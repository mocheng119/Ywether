package com.example.kuan.yweather.json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kuan on 2017/7/18.
 */

public class Suggestion {
    @SerializedName("comf")
    public  Comfort comfort;
    @SerializedName("cw")
    public  CarWash carWash;
    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
