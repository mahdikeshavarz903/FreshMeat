package com.freshmeat.model;

public class Address {
    private String token;
    private String home_phone_number;
    private String zip_code;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getHome_phone_number() {
        return home_phone_number;
    }

    public void setHome_phone_number(String home_phone_number) {
        this.home_phone_number = home_phone_number;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }
}
