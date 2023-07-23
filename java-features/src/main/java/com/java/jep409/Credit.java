package com.java.jep409;

public final class Credit extends PaymentMethod {
    private String cardNumber;

    private Credit(String payerName) {
        super(payerName);
    }
}
