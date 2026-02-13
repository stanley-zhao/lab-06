package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns a boolean whether or not it belongs in the list
     * @return
     * Return whether or not it belongs in the list
     */
    public boolean hasCity(City city){
        for(int i=0;i<cities.size();i++) {
            if (cities.get(i).equals(city)) {
                return true;
            }
        }
        return false;
    }
    /**
     * This delete the city from the list if exists, otherwise throw an exception
     */
    public void delete(City city) {
        if(hasCity(city)){
            cities.remove(city);
        }else{
            throw new NoSuchElementException();
        }
    }

    /**
     * return number of cities in the list
     * @return number of cities in the list
     */
    public int countCities(){
        return cities.size();
    }
}