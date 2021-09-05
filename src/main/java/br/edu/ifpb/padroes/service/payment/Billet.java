package br.edu.ifpb.padroes.service.payment;

public class Billet implements Payment {

    @Override
    public void doPayment() {
        System.out.println("Do billet payment!");
    }
}
