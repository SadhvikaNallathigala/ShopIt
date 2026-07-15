package com.shopit.payment.controller;

import com.shopit.payment.dto.PaymentRequest;
import com.shopit.payment.dto.PaymentResponse;
import com.shopit.payment.entity.Payment;
import com.shopit.payment.repository.PaymentRepository;
import com.shopit.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

import com.shopit.payment.exception.PaymentNotFoundException;

@RestController
@RequestMapping("/payments")
@CrossOrigin("*")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private PaymentRepository paymentRepository;

    // Process Payment
    @PostMapping("/process")
    public PaymentResponse processPayment(@Valid @RequestBody PaymentRequest request) {
        return paymentService.processPayment(request);
    }

    // Get Payment by ID
    @GetMapping("/{paymentId}")
    public Payment getPayment(@PathVariable Long paymentId) {

        return paymentRepository.findById(paymentId)
                .orElseThrow(() ->
                new PaymentNotFoundException("Payment with ID " + paymentId + " not found"));

    }

    // Transaction History
    @GetMapping("/history")
    public List<Payment> getHistory() {
        return paymentRepository.findAll();
    }

}