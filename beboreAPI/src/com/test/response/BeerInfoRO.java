package com.test.response;

public class BeerInfoRO
{

    private int beerId;
    private String breweryName;
    private String beerName;
    private String beerStyle;

    /**
     * @return the beerId
     */
    public int getBeerId()
    {
        return beerId;
    }

    /**
     * @param beerId
     *            the beerId to set
     */
    public void setBeerId(int beerId)
    {
        this.beerId = beerId;
    }

    /**
     * @return the breweryName
     */
    public String getBreweryName()
    {
        return breweryName;
    }

    /**
     * @param breweryName
     *            the breweryName to set
     */
    public void setBreweryName(String breweryName)
    {
        this.breweryName = breweryName;
    }

    /**
     * @return the beerName
     */
    public String getBeerName()
    {
        return beerName;
    }

    /**
     * @param beerName
     *            the beerName to set
     */
    public void setBeerName(String beerName)
    {
        this.beerName = beerName;
    }

    /**
     * @return the beerStyle
     */
    public String getBeerStyle()
    {
        return beerStyle;
    }

    /**
     * @param beerStyle
     *            the beerStyle to set
     */
    public void setBeerStyle(String beerStyle)
    {
        this.beerStyle = beerStyle;
    }
}
