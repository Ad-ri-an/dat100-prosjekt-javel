package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer kunde = new Customer("Adrian", "adaus1535@hvl.no", 1234, PowerAgreementType.SPOTPRICE);

        System.out.println("TEST1: ");
        System.out.println(kunde);
        System.out.println();

        System.out.println("TEST2: ");
        System.out.println("Name: " + kunde.getName());
        System.out.println("Email: " + kunde.getEmail());
        System.out.println("Customer ID: " + kunde.getCustomer_id());
        System.out.println("Agreement: " + kunde.getPowerAgreement());
        System.out.println();

        System.out.println("TEST3: ");
        kunde.setName("Austefjord");
        kunde.setEmail("Adrian.Austefjord@gmail.com");
        kunde.setCustomer_id(9999);
        kunde.setPowerAgreement(PowerAgreementType.NORGESPRICE);
        System.out.println(kunde);
    }
}
