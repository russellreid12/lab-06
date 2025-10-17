package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class contains methods for modifying an
 * arraylist of city objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Sorts and gets a list of cities
     * @return
     *  return sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This method adds a city
     * @param city
     */
    public void add(City city) {
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * 
     * @param city
     */
    public void delete(City city) {
        if(!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     *
     * @param city
     * @return
     */
    public boolean hasCity(City city) {
       return cities.contains(city);
    }

    /**
     *
     * @param city
     * @return
     */
    public int countCities(City city) {
        return cities.size();
    }

}
