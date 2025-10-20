package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        for(int i = 0; i < prices.length; i++){
            System.out.printf("%.2f kWh ", prices[i]);
        }
        System.out.println();
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for(int i = 0; i < usage.length; i++){
            System.out.printf("%.2f NOK ", usage[i]);
        }
        System.out.println();
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;
        for(int i = 0; i < usage.length; i++){
            sum += usage[i];
        }
        System.out.println("sum = " + sum + "kWh");
        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;
        for(int i  = 0; i < usage.length; i++){
            price += usage[i] * prices[i];
        }
        System.out.printf("total pris: %.2f kr\n", price);
        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;
        if(price > THRESHOLD){
            double extra = price - THRESHOLD;
            support = PERCENTAGE * extra * usage;
        }
        System.out.printf("strømstøtte: %.2f kr\n", support);
        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;
        for(int i = 0; i < usage.length; i++){
            support += getSupport(usage[i], prices[i]);
        }
        System.out.printf("Strømstøtte for hele dagen: %.2f kr\n", support);
        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;
        for(int i = 0; i < usage.length; i++){
            price += usage[i] * NORGESPRIS_KWH;
        }
        System.out.printf("Total pris med norgespris: %.2f kr\n", price);
        return price;
    }

    // h) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;
        for(int i = 0; i < usage.length; i++){
            
        }

        return temp_max;
    }
    // i)
    public static double findAvgPower(double[] usage) {

        double average = 0;

        // TODO

        return average;
    }
}