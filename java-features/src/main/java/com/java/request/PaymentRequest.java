package com.java.request;

import lombok.Getter;

@Getter
public class PaymentRequest {

    private String authentication;
    private Object paymentMethod;
}
