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
    BeboreDAO beboreDAO;

    @Inject
    BeerListMapper beerListMapper;

    public List<BeerInfoRO> getBeerList()
    {

        List<BeerEntity> beerList;
        beerList = getBeboreDAO().getBeerList();

        return beerListMapper.mapBeers(beerList);
    }

    public BeerInfoRO getSpecificBeer(int id)
    {
        BeerEntity specificBeer = new BeerEntity();

        specificBeer = getBeboreDAO().getBeerById(id);

        return beerListMapper.mapBeer(specificBeer);

    }

    public void getReviewList()
    {
        System.out.println("HM - inside the method getReviewList");
    }

    public BeboreDAO getBeboreDAO()
    {
        return beboreDAO;
    }

    public void setBeboreDAO(BeboreDAO beboreDAO)
    {
        this.beboreDAO = beboreDAO;
    }

}
