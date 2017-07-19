package com.example.kuan.yweather.util;

import android.text.TextUtils;

import com.example.kuan.yweather.db.City;
import com.example.kuan.yweather.db.County;
import com.example.kuan.yweather.db.Province;

import com.example.kuan.yweather.json.Weather;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by kuan on 2017/7/18.
 */

public class Utility {
    //省级数据
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvince = new JSONArray(response);
                for (int i = 0; i < allProvince.length(); i++) {
                    JSONObject provinceobj = allProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceobj.getString("name"));
                    province.setProvinceCode(provinceobj.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    //市级数据
    public static boolean handleCityResponse(String res, int provinceId) {
        if (!TextUtils.isEmpty(res)) {
            try {
                JSONArray allCities = new JSONArray(res);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityobj = allCities.getJSONObject(i);
                    City city = new City();
                    city.setProvinceId(provinceId);
                    city.setCityName(cityobj.getString("name"));
                    city.setCityCode(cityobj.getInt("id"));
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    //县级数据
    public static boolean handleCountyReponse(String res, int cityId) {
        if (!TextUtils.isEmpty(res)) {
            try {
                JSONArray allCounties = new JSONArray(res);
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject countyobj = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyobj.getString("name"));
                    county.setWeatherId(countyobj.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    /**
     * 将解析成Weather类
     * */
    public static Weather handleWeatherResponse(String res){
        try {
            JSONObject weatherboj=new JSONObject(res);
            JSONArray weatherobjs=weatherboj.getJSONArray("HeWeather");
            String weatherContent=weatherobjs.getJSONObject(0).toString();
            return  new Gson().fromJson(weatherContent,Weather.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }
}
