package com.bebore.mapper;

import java.util.ArrayList;
import java.util.List;

import com.bebore.entity.BeerEntity;
import com.bebore.response.BeerInfoRO;

public class BeerListMapper
{

    public List<BeerInfoRO> mapBeers(List<BeerEntity> beerListInput)
    {
        System.out.println("HM - inside the mapper and the number of beers = " + beerListInput.size());

        List<BeerInfoRO> beerRO = new ArrayList<BeerInfoRO>();

        for (BeerEntity beerItem : beerListInput)
        {

            beerRO.add(mapBeer(beerItem));

        }

        return beerRO;

    }

    public BeerInfoRO mapBeer(BeerEntity beerInput)
    {
        BeerInfoRO beerRO = new BeerInfoRO();

        beerRO.setBreweryName(beerInput.getBrewery().getName());
        beerRO.setBeerName(beerInput.getName());
        beerRO.setBeerStyle(beerInput.getStyle().getName());

        return beerRO;
    }

}
