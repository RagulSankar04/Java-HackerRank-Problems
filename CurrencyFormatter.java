import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale usLocale = Locale.US;
        Locale indiaLocale = new Locale("en", "IN");
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;
        
        NumberFormat usformatted = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat indiaformatted = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinaformatted = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat franceformatted = NumberFormat.getCurrencyInstance(franceLocale);
        
        String us = usformatted.format(payment);
        String india = indiaformatted.format(payment);
        String china = chinaformatted.format(payment);
        String france = franceformatted.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}