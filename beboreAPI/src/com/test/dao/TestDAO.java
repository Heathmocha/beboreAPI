package com.test.dao;

import java.util.List;

import com.test.entity.BeerInfoEntity;

public class TestDAO extends TestBaseDAO
{

    public List<BeerInfoEntity> getBeerList()
    {
        List<BeerInfoEntity> beerList = null;

        System.out.println("HM - i am inside my DAO!");

        return beerList;
    }
}
