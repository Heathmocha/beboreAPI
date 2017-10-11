package com.bebore.manager;

import java.util.List;

import javax.inject.Inject;

import com.bebore.dao.BeboreDAO;
import com.bebore.entity.BeerEntity;
import com.bebore.mapper.BeerListMapper;
import com.bebore.response.BeerInfoRO;

public class BeboreManager
{

    @Inject
    BeboreDAO testDAO;

    @Inject
    BeerListMapper beerListMapper;

    public List<BeerInfoRO> getBeerList()
    {
        System.out.println("HM - inside the manager method getBeerList");

        List<BeerEntity> beerList;
        beerList = getTestDAO().getBeerList();

        return beerListMapper.mapBeers(beerList);
    }

    public BeerInfoRO getSpecificBeer(int id)
    {
        BeerEntity specificBeer= new BeerEntity();

        specificBeer = getTestDAO().getBeerById(id);

        return beerListMapper.mapBeer(specificBeer);

    }

    public BeboreDAO getTestDAO()
    {
        return testDAO;
    }

    public void setTestDAO(BeboreDAO testDAO)
    {
        this.testDAO = testDAO;
    }

}
