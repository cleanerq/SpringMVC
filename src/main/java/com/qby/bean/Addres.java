package com.qby.bean;

/**
 * @author qby
 * @date 2020/6/24 23:52
 */
public class Addres {
    private String province;
    private String city;
    private String street;

    @Override
    public String toString() {
        return "Addres{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
