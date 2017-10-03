package com.test.dao;

import java.util.List;

import com.test.entity.BeerEntity;

public class TestDAO extends TestBaseDAO
{

    public List<BeerEntity> getBeerList()
    {
        List<BeerEntity> beerList = null;

        try
        {

            beerList = getEntityManager().createNamedQuery("getAllBeerCollection", BeerEntity.class).getResultList();

//            if (!beerList.isEmpty())
//            {
//                for (BeerEntity singleBeer : beerList)
//                {
//                    System.out.println("HM - beer name = " + singleBeer.getName());
//                    System.out.println("HM - brewery name = " + singleBeer.getBrewery().getName());
//                    System.out.println("HM - style = " + singleBeer.getStyle().getName());
//                }
//            }

        } catch (Exception e)
        {
            System.out.println("HM - you got an exception!");
            e.printStackTrace();
        }

        return beerList;
    }
    
    public BeerEntity getBeerById(int id)
    {
        BeerEntity singleBeer = null;

        try
        {

            singleBeer = getEntityManager().createNamedQuery("getBeerInstance", BeerEntity.class).setParameter("inputId", id).getSingleResult();

        } catch (Exception e)
        {
            System.out.println("HM - you got an exception!");
            e.printStackTrace();
        }

        return singleBeer;
    }
}
