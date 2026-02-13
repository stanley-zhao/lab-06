package com.example.listycity;

import java.util.Objects;

/**
*  This is a class that defines a City.
*/
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        City city =  (City)o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City c = (City) o;
        return this.hashCode() == c.hashCode();
    }
    // Source - https://stackoverflow.com/a/54941928
    // Posted by Luke Usherwood, modified by community. See post 'Timeline' for change history
    // Retrieved 2026-02-12, License - CC BY-SA 4.0
    @Override
    public int hashCode() {
        return Objects.hash(this.city,this.province);
    }
}