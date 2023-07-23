package com.java.jep409;

public final class Pix extends PaymentMethod{

    private String key;

    private Pix(String payerName) {
        super(payerName);
    }

    public boolean isValidKey(){
        return true;
    }

}
