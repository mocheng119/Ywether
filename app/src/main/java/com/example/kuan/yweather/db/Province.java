package com.example.kuan.yweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by kuan on 2017/7/18.
 */

public class Province extends DataSupport{
    int id;
    String provinceName;
    int provinceCode;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
