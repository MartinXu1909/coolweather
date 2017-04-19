package com.martin.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Martin on 2017/4/19 0019.
 */

public class City extends DataSupport {
    private int id;
    private String cityName; // 记录市的名字
    private int cityCode; // 记录市的代号
    private int provinceId; // 巨鹿当前市在所属省的id值

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}
