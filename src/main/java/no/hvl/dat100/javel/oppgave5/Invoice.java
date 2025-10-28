package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    public void computeAmount() {

        PowerAgreementType type = c.getPowerAgreement();
        switch (type) {
            case SPOTPRICE -> amount = MonthlyPower.computeSpotPrice(usage,prices);
            case POWERSUPPORT -> amount = MonthlyPower.computePowerSupport(usage, prices);
            case NORGESPRICE -> amount = MonthlyPower.computeNorgesPrice(usage);
        }
    }

    public void printInvoice() {

        double totalUsage = MonthlyPower.computePowerUsage(usage);
        System.out.println(c);
        System.out.println("Month: " + month);
        System.out.printf("Usage: %.2f kWh%n", totalUsage);
        System.out.printf("Amount: %.2f NOK%n", amount);
    }
}
