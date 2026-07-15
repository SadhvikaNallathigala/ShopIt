package com.shopit.payment.service;

import com.shopit.payment.dto.PaymentRequest;
import com.shopit.payment.dto.PaymentResponse;
import com.shopit.payment.entity.Payment;
import com.shopit.payment.enums.PaymentStatus;
import com.shopit.payment.repository.PaymentRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

import com.shopit.payment.enums.PaymentMethod;
import com.shopit.payment.enums.PaymentStatus;


@Service
public class PaymentService {

    private static final Logger logger =
            LoggerFactory.getLogger(PaymentService.class);

    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentResponse processPayment(PaymentRequest request) {

        logger.info("Payment request received for Order ID: {}", request.getOrderId());

        Payment payment = new Payment();

        payment.setOrderId(request.getOrderId());
        payment.setCustomerId(request.getCustomerId());
        payment.setAmount(request.getAmount());

        // Payment Method
        payment.setPaymentMethod(request.getPaymentMethod());

        // Generate Transaction ID
        String transactionId = UUID.randomUUID().toString();

        logger.info("Transaction ID Generated: {}", transactionId);

        // Always return SUCCESS during integration
        PaymentStatus status = PaymentStatus.SUCCESS;

        logger.info("Payment Processed Successfully.");

        payment.setTransactionId(transactionId);
        payment.setPaymentStatus(status);
        payment.setPaymentDate(LocalDateTime.now());

        logger.info("Saving Payment to Database...");

        Payment savedPayment = paymentRepository.save(payment);

        logger.info("Payment saved successfully with ID: {}", savedPayment.getPaymentId());

        logger.info("Sending response back to Ecommerce Service.");

        return PaymentResponse.builder()
                .paymentId(savedPayment.getPaymentId())
                .transactionId(transactionId)
                .paymentStatus(status.name())
                .message("Payment Processed Successfully")
                .build();

    }
}