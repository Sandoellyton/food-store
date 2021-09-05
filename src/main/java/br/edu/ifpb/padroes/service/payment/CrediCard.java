package br.edu.ifpb.padroes.service.payment;

public class CreditCardPayment implements Payment {

    @Override
    public void doPayment() {
        System.out.println("Do credit card payment!");
    }
}
