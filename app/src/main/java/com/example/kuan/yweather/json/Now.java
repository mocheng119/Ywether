package com.example.kuan.yweather.json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kuan on 2017/7/18.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    public  class More{
        @SerializedName("txt")
        public String info;
    }
    @SerializedName("cond")
    public More more;
}
