package com.bebore.entity;

import java.io.Serializable;

import javax.persistence.IdClass;

/**
 * The primary key class for the beerLog database table.
 * 
 */
@IdClass(BeerLogEntityKey.class)
public class BeerLogEntityKey implements Serializable
{
    // default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    private int logId;
    private int beerId;

    public BeerLogEntityKey()
    {
        super();
    }

    public int getLogId()
    {
        return this.logId;
    }

    public void setLogId(int logId)
    {
        this.logId = logId;
    }

    public int getBeerId()
    {
        return this.beerId;
    }

    public void setBeerId(int beerId)
    {
        this.beerId = beerId;
    }

    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if (!(other instanceof BeerLogEntityKey))
        {
            return false;
        }
        BeerLogEntityKey castOther = (BeerLogEntityKey) other;
        return (this.logId == castOther.logId) && (this.beerId == castOther.beerId);
    }

    public int hashCode()
    {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.logId;
        hash = hash * prime + this.beerId;

        return hash;
    }
}