package com.example.pam_672020267_api;

public class Country {
    String countryName;
    String countryCode;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public Country(String countryCode, String countryName) {
        super();
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}