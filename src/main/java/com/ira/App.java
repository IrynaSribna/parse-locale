package com.ira;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JSONException, FileNotFoundException, ParseException {
        JsonParser jsonParser = new JsonParser();
        JSONObject content = jsonParser.getJsonFileContent();
        String adspace = jsonParser.getAdspace(content);
        Date payOutTime = jsonParser.getPayOutTime(content);

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
        System.out.println(dateFormat.format(payOutTime));

    }
}
