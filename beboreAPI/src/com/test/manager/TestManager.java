package com.test.manager;

import java.util.List;

import com.test.response.BeerInfoRO;

public class TestManager
{

    public static List<BeerInfoRO> getBeerList()
    {

        System.out.println("HM - inside the manager method getBeerList");

        return null;
    }

    public static BeerInfoRO getSpecificBeer()
    {

        // hardcoded response for now
        BeerInfoRO specificBeer = new BeerInfoRO();

        specificBeer.setBeerId(5);
        specificBeer.setBreweryName("Ballast Point");
        specificBeer.setBeerName("Even Keel");
        specificBeer.setBeerStyle("Session IPA");
        
        return specificBeer;

    }

}
