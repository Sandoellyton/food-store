package br.edu.ifpb.padroes.service.payment;

public class Debit implements Payment {

    @Override
    public void doPayment() {
        System.out.println("Do debit payment!");
    }
}
