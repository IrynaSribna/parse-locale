package com.ira;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by iryna.sribna on 05.05.2015.
 */
public class PrintUtil {
    public static void printString(String key, String valueToPrint) {
        System.out.println(key + ": " + valueToPrint);
    }

    public static void printDate(String key, Date dateToPrint, Locale locale) {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.SHORT, locale);
        System.out.println(key + ": " + dateFormat.format(dateToPrint) + " " + timeFormat.format(dateToPrint));
    }

    public static void printDouble(String key, Double doubleToPrint, Locale locale) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(key + ": " + numberFormat.format(doubleToPrint));
    }
}
