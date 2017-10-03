package com.test.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the beerInfo database table.
 * 
 */
@Entity
@Table(name = "beerInfo")
@NamedQuery(name = "BeerInfo.findAll", query = "SELECT b FROM BeerInfoEntity b")
public class BeerInfoEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    private int beerId;
    private String breweryName;
    private String beerName;
    private String beerStyle;

    public BeerInfoEntity()
    {
        super();
    }

    public int getBeerId()
    {
        return this.beerId;
    }

    public void setBeerId(int beerId)
    {
        this.beerId = beerId;
    }

    public String getBreweryName()
    {
        return this.breweryName;
    }

    public void setBreweryName(String breweryName)
    {
        this.breweryName = breweryName;
    }

    public String getBeerName()
    {
        return this.beerName;
    }

    public void setBeerName(String beerName)
    {
        this.beerName = beerName;
    }

    public String getBeerStyle()
    {
        return this.beerStyle;
    }

    public void setBeerStyle(String beerStyle)
    {
        this.beerStyle = beerStyle;
    }

}