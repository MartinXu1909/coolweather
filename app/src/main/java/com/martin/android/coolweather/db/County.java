package com.martin.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Martin on 2017/4/19 0019.
 */

public class County extends DataSupport {
    private int id;
    private String countyName; // 记录县的名字
    private String weatherId; // 记录县所对应的天气
    private int cityId; // 当前县在所市省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyName() {
        return countyName;
    }
}
