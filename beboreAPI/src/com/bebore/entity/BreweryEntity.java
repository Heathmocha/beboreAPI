package com.bebore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the brewery database table.
 * 
 */
@Entity
@Table(name="brewery")
@NamedQuery(name="Brewery.findAll", query="SELECT b FROM BreweryEntity b")
public class BreweryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	//bi-directional many-to-one association to Beer
	@OneToMany(mappedBy="brewery")
	private List<BeerEntity> beers;

	public BreweryEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BeerEntity> getBeers() {
		return this.beers;
	}

	public void setBeers(List<BeerEntity> beers) {
		this.beers = beers;
	}

	public BeerEntity addBeer(BeerEntity beer) {
		getBeers().add(beer);
		beer.setBrewery(this);

		return beer;
	}

	public BeerEntity removeBeer(BeerEntity beer) {
		getBeers().remove(beer);
		beer.setBrewery(null);

		return beer;
	}

}