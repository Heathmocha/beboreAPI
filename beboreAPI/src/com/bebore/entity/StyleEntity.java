package com.bebore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the style database table.
 * 
 */
@Entity
@Table(name = "style")
@NamedQuery(name = "Style.findAll", query = "SELECT s FROM StyleEntity s")
public class StyleEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    private String name;

    // bi-directional many-to-one association to Beer
    @OneToMany(mappedBy = "style")
    private List<BeerEntity> beers;

    public StyleEntity()
    {
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<BeerEntity> getBeers()
    {
        return this.beers;
    }

    public void setBeers(List<BeerEntity> beers)
    {
        this.beers = beers;
    }

    public BeerEntity addBeer(BeerEntity beer)
    {
        getBeers().add(beer);
        beer.setStyle(this);

        return beer;
    }

    public BeerEntity removeBeer(BeerEntity beer)
    {
        getBeers().remove(beer);
        beer.setStyle(null);

        return beer;
    }

}