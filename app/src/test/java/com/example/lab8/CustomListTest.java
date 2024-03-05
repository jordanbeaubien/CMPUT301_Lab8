package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    /**
     * create a mocklist for my citylist * @return
     */
    public CustomList MockCityList(){
        return new CustomList(null,new ArrayList<>());
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

}
