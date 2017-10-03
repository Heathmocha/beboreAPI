package com.test.manager;

import java.util.List;

import javax.inject.Inject;

import com.test.dao.TestDAO;
import com.test.entity.BeerEntity;
import com.test.mapper.BeerListMapper;
import com.test.response.BeerInfoRO;

public class TestManager
{

    @Inject
    TestDAO testDAO;

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

    public TestDAO getTestDAO()
    {
        return testDAO;
    }

    public void setTestDAO(TestDAO testDAO)
    {
        this.testDAO = testDAO;
    }

}
