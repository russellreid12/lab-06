package com.example.listycity;

import java.util.Objects;

/**
 * This is a class defined as City. Contains two
 * String variables city and province, getters for them,
 * and a constructor.
 *
 */
public class City implements Comparable<City> {
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }


    public String getCityName() {
        return this.city;
    }



    public String getProvinceName() {
        return this.province;
    }

    @Override
    public int compareTo(City other){
        return this.city.compareTo(other.getCityName());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof City)) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
