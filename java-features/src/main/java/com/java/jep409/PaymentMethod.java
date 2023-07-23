package com.java.jep409;

public sealed abstract class PaymentMethod permits Credit, Debit, Pix {
    protected PaymentMethod(String payerName) {
    }
}
