package com.shopit.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PaymentResponse {

    private Long paymentId;
    private String transactionId;
    private String paymentStatus;
    private String message;

}