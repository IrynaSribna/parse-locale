package com.ira;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * author: Iryna Sribna
 *
 */
public class App 
{
    public static void main( String[] args ) throws JSONException, FileNotFoundException, ParseException {
        if (args.length != 2) {
            System.out.println("Unable to find the language and locale region, program is terminated");
            System.exit(-1);
        }

        String localeString = args[0];
        Locale locale = new Locale.Builder().setLanguage(args[0]).setRegion(args[1]).build();
        System.out.println(locale);

        JsonParser jsonParser = new JsonParser();


        JSONObject json = jsonParser.getJsonFileContent();
        String adSpace = jsonParser.getAdspace(json);
        Date eventTime = jsonParser.getEventTime(json);
        Double commission = jsonParser.getCommission(json);
        Date expireTime = jsonParser.getExpireTime(json);
        Double amount = jsonParser.getAmount(json);
        Date payOutTime = jsonParser.getPayOutTime(json);

        // print
        PrintUtil.printString("adSpace", adSpace);
        PrintUtil.printDate("eventTime", eventTime, locale);
        PrintUtil.printDouble("commission", commission, locale);
        PrintUtil.printDate("expireDate", expireTime, locale);
        PrintUtil.printDouble("amount", amount, locale);
        PrintUtil.printDate("payOutTime", payOutTime, locale);

    }


}
