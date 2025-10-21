package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;
import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();
        System.out.println("a)");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();
        System.out.println("b)");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();
        System.out.println("c)");
        MonthlyPower.computePowerUsage(power_usage_month);
        System.out.println();
        System.out.println("d)");
        System.out.println("Over hyttegrensen (1000kWh): ");
        MonthlyPower.exceedThreshold(power_usage_month, 1000);
        System.out.println("Over hyttegrensen (5000kWh): ");
        MonthlyPower.exceedThreshold(power_usage_month, 5000);
        System.out.println();
        System.out.println("e)");
        MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        System.out.println();
        System.out.println("f)");
        MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        System.out.println();
        System.out.println("g)");
        MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.println();
    }
}