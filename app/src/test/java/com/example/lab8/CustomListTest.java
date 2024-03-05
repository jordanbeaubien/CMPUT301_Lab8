package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    /**
     * Create a mockList for my cityList
     * @return the created mock cityList
     */
    public CustomList MockCityList(){
        return new CustomList(null,new ArrayList<>());
    }

    /**
     * Create a mock City
     * @param CityName          Name of City
     * @param ProvinceName      Name of City's province
     * @return                  City object with above details
     */
    public City mockCity(String CityName, String ProvinceName) {
        return new City(CityName, ProvinceName);
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest(){
        CustomList cityList = MockCityList();
        int listSize = cityList.getCount();
        cityList.addCity(new City("Estevan", "SK"));
        assertEquals(cityList.getCount(),listSize + 1);
    }

    /*
     * Lab Exercise
     * • Implement has city, delete city, and count cities (same as lab 6), however, this time using TDD.
     * • Create each functionality one at a time, creating (and pushing) a test to create a failing build, before adding functionality to make it pass.
     * • e.g., create hasCity test, push for failing build, write functionality for hasCity to make passing build. Repeat for delete city and count cities.
     * Please submit the link to your repo/fork.
     */


    /**
     * Check if city is present in list
     */
    @Test
    public void hasCityTest(){
        CustomList cityList = MockCityList();
        City mockCity = mockCity("Estevan", "SK");
        cityList.addCity(mockCity);
        assertEquals(true, cityList.hasCity(mockCity));
    }

    /**
     * Check if city is deleted from list
     */
    @Test
    public void deleteCityTest(){
        CustomList cityList = MockCityList();
        City mockCity = mockCity("Estevan", "SK");
        cityList.addCity(mockCity);
        cityList.deleteCity(mockCity);
        assertEquals(false, cityList.hasCity(mockCity));
    }

    /**
     * Check count of cities in list.
     */
    @Test
    public void countCitiesTest(){
        CustomList cityList = MockCityList();
        City mockCity = mockCity("Estevan", "SK");
        cityList.addCity(mockCity);
        cityList.addCity(mockCity);
        cityList.addCity(mockCity);
        assertEquals(3, cityList.countCities());
    }
}
