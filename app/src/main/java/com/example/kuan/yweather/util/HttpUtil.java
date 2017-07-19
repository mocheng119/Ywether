package com.example.kuan.yweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by kuan on 2017/7/18.
 */

public class HttpUtil {
    public  static  void sendOkhttprequest(String addres,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(addres).build();
        client.newCall(request).enqueue(callback);
    }
}
