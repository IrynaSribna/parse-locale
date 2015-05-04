package com.ira;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by iryna.sribna on 04.05.2015.
 */
public class JsonParser {

    public JSONObject getJsonFileContent() throws FileNotFoundException, JSONException {
        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        String content = new Scanner(new File(classLoader.getResource("info.json").getFile())).useDelimiter("\\Z").next();
        JSONObject adspaceMetadata= new JSONObject(content);
        return adspaceMetadata;
    }


    public String getAdspace(JSONObject json) throws JSONException {
        return json.getString("adSpace");

    }

    public Date getEventTime(JSONObject json) throws JSONException, ParseException {
        String eventTimeString = json.getString("eventTime");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhh:mm");
        Date date = sdf.parse(eventTimeString);

        return date;
    }

    public Double getCommission(JSONObject json) throws JSONException {
        return json.getDouble("commissionInMicrocents");
    }

    public Date getExpireTime(JSONObject json) throws JSONException, ParseException {
        String expireTimeString = json.getString("expireTime");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy hh:mm");
        Date date = sdf.parse(expireTimeString);

        return date;
    }

    public Double getAmount(JSONObject json) throws JSONException {
        return json.getDouble("amountInMicrocents");
    }

    public Date getPayOutTime(JSONObject json) throws JSONException, ParseException {
        String payOutTimeString = json.getString("payOutTime");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh.mm");
        Date date = sdf.parse(payOutTimeString);

        return date;
    }

}
