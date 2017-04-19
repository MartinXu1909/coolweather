package com.martin.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Martin on 2017/4/19 0019.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName; // 记录省的名字
    private int provinceCode; // 记录省的代号

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceName() {
        return provinceName;
    }
}
