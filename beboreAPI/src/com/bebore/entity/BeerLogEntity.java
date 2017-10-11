package com.bebore.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the beerLog database table.
 * 
 */
@Entity
@Table(name = "beerLog")
@IdClass(BeerLogEntityKey.class)
@NamedQuery(name = "BeerLog.findAll", query = "SELECT b FROM BeerLogEntity b")
public class BeerLogEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    private int logId;

    @Id
    private int beerId;

    private String comment;

    @Temporal(TemporalType.DATE)
    private Date drinkDate;

    public BeerLogEntity()
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

    public int getbeerId()
    {
        return this.beerId;
    }

    public void setbeerId(int beerId)
    {
        this.beerId = beerId;
    }

    public String getComment()
    {
        return this.comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public Date getDrinkDate()
    {
        return this.drinkDate;
    }

    public void setDrinkDate(Date drinkDate)
    {
        this.drinkDate = drinkDate;
    }

}