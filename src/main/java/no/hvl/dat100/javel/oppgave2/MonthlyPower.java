package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        for(int i = 0; i < usage.length; i++){ //dag
            System.out.print("Day " + (i + 1) + ": ");
            for(int j = 0; j < usage[i].length; j++){ //time
                System.out.printf("%.2f kWh ", usage[i][j]);
            }
            System.out.println();
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        for(int i = 0; i < prices.length; i++){ //dag
            System.out.print("Day " + (i + 1) + ": ");
            for(int j = 0; j < prices[i].length; j++){ //time
                System.out.printf("%.2f NOK ", prices[i][j]);
            }
            System.out.println();
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;
        for(int i = 0; i < usage.length; i++){ //dag
            for(int j = 0; j < usage[i].length; j++){ //time
                sum += usage[i][j];
            }
        }
        System.out.printf("Total strømforbruk for måneden: %.2f kWh", sum);
        System.out.println();
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        int i = 0; //dag
        while(i < powerusage.length && !exceeded){
            int j = 0; //time
            while(j < powerusage[i].length && !exceeded){
                usage += powerusage[i][j];
                if(usage > threshold){
                    exceeded = true;
                }
                j++;
            }
            i++;
        }
        System.out.println(exceeded);
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;
        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                price += usage[i][j] * prices[i][j];
            }
        }
        System.out.printf("Strømpris for en måned: %.2f NOK %n", price);
        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        double THRESHOLD = 0.9375;
        double PERCENTAGE = 0.9;
        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                double price = prices[i][j];
                if(price > THRESHOLD){
                    double extra = price - THRESHOLD;
                    support += usage[i][j] * extra * PERCENTAGE;
                }
            }
        }
        System.out.printf("Total strømstøtte: %.2f NOK %n", support);
        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;
        double NORGESPRIS_KWH = 0.5;
        for(double[] i : usage){
            for(double j : i){
                price += j * NORGESPRIS_KWH;
            }
        }
        System.out.printf("Total pris med Norgespris: %.2f NOK%n", price);
        return price;
    }
}
