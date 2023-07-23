package com.java.jep409;

public final class Debit extends PaymentMethod {

    private String name;

    private Debit(String payerName) {
        super(payerName);
    }
}
