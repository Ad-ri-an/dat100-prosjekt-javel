package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        System.out.println("a)");
        Customers companyCustomers = new Customers(6);
        System.out.print("Oprettet en tabell med plass til 6 kunder.");
        System.out.println();

        System.out.println("b)");
        Customer c1 = new Customer("Alice Smith", "Alice@example.no", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson", "Bob@example.no",1002 ,PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose", "Charlie@example.no",1003 ,PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Diana Prince", "Diana@example.no",1004 ,PowerAgreementType.NORGESPRICE);
        Customer c5 = new Customer("Ethan Hunt", "Ethan@example.no",1005 ,PowerAgreementType.POWERSUPPORT);

        companyCustomers.addCustomer(c1);
        companyCustomers.addCustomer(c2);
        companyCustomers.addCustomer(c3);
        companyCustomers.addCustomer(c4);
        companyCustomers.addCustomer(c5);

        System.out.println("Lagt til 5 kunder i tabellen.");
        System.out.println("Antall kunder: " + companyCustomers.countNonNull());
        System.out.println();

        System.out.println("c)");
        Customer found = companyCustomers.getCustomer(1003); //henter kunde 1003
        if (found != null){
            System.out.println(found);
        }
        else{
            System.out.println("finner ikke kunde.");
        }
        System.out.println();

        System.out.println("d)");
        Customer c6 = new Customer("Genius Man", "Genius@email.no", 1006, PowerAgreementType.SPOTPRICE);
        companyCustomers.addCustomer(c6);
        System.out.println("La til bruker: " + companyCustomers.getCustomer(1006));
        System.out.println(companyCustomers.countNonNull());
        System.out.println();

        System.out.println("e)");
        Customer remove = companyCustomers.removeCustomer(1002);//fjerner kunde 1002
        if (remove != null) {
            System.out.println("kunde fjernet:");
            System.out.println(remove);
        }
        else {
            System.out.println("finner ikke kunde.");
        }
        System.out.println();
        System.out.println(companyCustomers.countNonNull());
        System.out.println();

        System.out.println("f)");
        System.out.println("=== Aktive brukere i tabell ===");
        System.out.println();
        Customer[] activeCustomers = companyCustomers.getCustomers();
        for (Customer c : activeCustomers){
            System.out.println(c);
            System.out.println();
        }
        System.out.println("antall aktive kunder: " + activeCustomers.length);
        System.out.println();
    }
}
