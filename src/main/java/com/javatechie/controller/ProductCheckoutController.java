package com.javatechie.controller;

import com.javatechie.dto.CreatePaymentRequest;
import com.javatechie.dto.ProductRequest;
import com.javatechie.dto.StripeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductCheckoutController {

    @PostMapping("/checkout")
    public ResponseEntity<StripeResponse> checkoutProducts(@RequestBody ProductRequest productRequest) {
        //StripeResponse stripeResponse = stripeService.createPayment(createPaymentRequest);
//        return ResponseEntity
//                .status(stripeResponse.getHttpStatus())
//                .body(stripeResponse);
        return null;
    }
}
