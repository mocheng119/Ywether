package com.example.kuan.yweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by kuan on 2017/7/18.
 */

public class County extends DataSupport {
    int id;
    String countyName;
    String weatherId;
    int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
