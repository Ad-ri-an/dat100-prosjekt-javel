package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();
        System.out.println("a)");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();
        System.out.println("b)");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();
        System.out.println("c)");
        DailyPower.computePowerUsage(powerusage_day);
        System.out.println();
        System.out.println("d)");
        DailyPower.computeSpotPrice(powerusage_day,powerprices_day);
        System.out.println();
        System.out.println("e)");
        //kan ikke hente den og skrive ut noe siden den er privat.
        System.out.println();
        System.out.println("f)");
        DailyPower.computePowerSupport(powerusage_day,powerprices_day);
        System.out.println();
        System.out.println("g)");
        DailyPower.computeNorgesPrice(powerusage_day);
        System.out.println();
        System.out.println("h)");
        DailyPower.findPeakUsage(powerusage_day);
        System.out.println();
        System.out.println("i)");
        DailyPower.findAvgPower(powerusage_day);
        System.out.println();
    }
}
