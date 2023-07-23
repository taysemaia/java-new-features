package com.java.jep427;

import com.java.jep409.Credit;
import com.java.jep409.Debit;
import com.java.jep409.PaymentMethod;
import com.java.jep409.Pix;
import com.java.service.PaymentService;

public class SwitchPatternMatching {

    private PaymentService paymentService;

//    public static void main(String[] args) {
//        Object obj = "Hello";
//
//        if (obj instanceof String str) {
//            System.out.println("É uma string: " + str);
//        } else if (obj instanceof Integer i) {
//            System.out.println("É um inteiro: " + i);
//        } else {
//            System.out.println("Tipo desconhecido");
//        }
//    }


    //    JEP406
//    private void validate(Object obj) {
//        switch (obj) {
//            case Credit credit -> paymentService.executePayment(credit);
//            case Debit debit -> paymentService.executePayment(debit);
//            case Pix pix && pix.isValidKey() -> paymentService.executePayment(pix);
//            default -> throw new IllegalStateException("Unexpected value: " + obj);
//        }
//    }
    private void validate(PaymentMethod method) {
        switch (method) {
            case Credit credit -> paymentService.executePayment(credit);
            case Debit debit -> paymentService.executePayment(debit);
            case Pix pix when pix.isValidKey() -> paymentService.executePayment(pix); // guarded pattern (&&) foi substituido pelo when
            case null -> System.out.print("opa");
            default -> throw new IllegalStateException("Unexpected value: " + method);
        }
    }
}
