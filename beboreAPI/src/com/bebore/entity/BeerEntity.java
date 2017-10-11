package com.bebore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the beer database table.
 * 
 */
@Entity
@Table(name = "beer")
@NamedQueries(
{ 
    @NamedQuery(name = "getAllBeerCollection", query = "SELECT b FROM BeerEntity b"),
    @NamedQuery(name = "getBeerInstance", query = "SELECT b FROM BeerEntity b where id = :inputId") 
})

public class BeerEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    private String name;

    // bi-directional many-to-one association to Brewery
    @ManyToOne
    private BreweryEntity brewery;

    // bi-directional many-to-one association to Style
    @ManyToOne
    private StyleEntity style;

    // bi-directional many-to-one association to Review
    @OneToMany(mappedBy = "beer")
    private List<ReviewEntity> reviews;

    public BeerEntity()
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

    public BreweryEntity getBrewery()
    {
        return this.brewery;
    }

    public void setBrewery(BreweryEntity brewery)
    {
        this.brewery = brewery;
    }

    public StyleEntity getStyle()
    {
        return this.style;
    }

    public void setStyle(StyleEntity style)
    {
        this.style = style;
    }

    public List<ReviewEntity> getReviews()
    {
        return this.reviews;
    }

    public void setReviews(List<ReviewEntity> reviews)
    {
        this.reviews = reviews;
    }

    public ReviewEntity addReview(ReviewEntity review)
    {
        getReviews().add(review);
        review.setBeer(this);

        return review;
    }

    public ReviewEntity removeReview(ReviewEntity review)
    {
        getReviews().remove(review);
        review.setBeer(null);

        return review;
    }

}