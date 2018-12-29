package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinModel {
    double mRate;

    public static BitcoinModel fromJson(JSONObject jsonObject){
        try {
            BitcoinModel bitcoinModel = new BitcoinModel();

            bitcoinModel.mRate = jsonObject.getJSONObject("averages").getDouble("day");

            return bitcoinModel;

        } catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }
}
