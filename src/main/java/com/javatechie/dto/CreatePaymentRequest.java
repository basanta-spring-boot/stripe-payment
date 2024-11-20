package com.javatechie.dto;

import lombok.Data;

@Data
public class CreatePaymentRequest {
    private Long amount;
    private Long quantity;
    private String name;
}
