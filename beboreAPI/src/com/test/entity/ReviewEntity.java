package com.test.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the review database table.
 * 
 */
@Entity
@Table(name="review")
@NamedQuery(name="Review.findAll", query="SELECT r FROM ReviewEntity r")
public class ReviewEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private String comment;

	private byte rating;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="reviewed_date")
	private Date reviewedDate;

	//bi-directional many-to-one association to Beer
	@ManyToOne
	private BeerEntity beer;

	//bi-directional many-to-one association to Person
	@ManyToOne
	private PersonEntity person;

	public ReviewEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public byte getRating() {
		return this.rating;
	}

	public void setRating(byte rating) {
		this.rating = rating;
	}

	public Date getReviewedDate() {
		return this.reviewedDate;
	}

	public void setReviewedDate(Date reviewedDate) {
		this.reviewedDate = reviewedDate;
	}

	public BeerEntity getBeer() {
		return this.beer;
	}

	public void setBeer(BeerEntity beer) {
		this.beer = beer;
	}

	public PersonEntity getPerson() {
		return this.person;
	}

	public void setPerson(PersonEntity person) {
		this.person = person;
	}

}