package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();
        Customer customer1 = new Customer("Charlie Rose", "charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer customer2 = new Customer("Diana Prince", "diana@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer customer3 = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.SPOTPRICE);
        double[][] usage1 = CustomerPowerUsageData.usage_month_customer1;
        double[][] usage2 = CustomerPowerUsageData.usage_month_customer2;
        double[][] usage3 = CustomerPowerUsageData.usage_month_customer3;
        double[][] prices = MonthPowerData.powerprices_month;
        Invoice inv1 = new Invoice(customer1, "January", usage1, prices);
        Invoice inv2 = new Invoice(customer2, "January", usage2, prices);
        Invoice inv3 = new Invoice(customer3, "January", usage3, prices);
        Invoice[] invoices = {inv1, inv2, inv3};
        Invoices.processInvoices(invoices);
    }
}