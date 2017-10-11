package com.bebore.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@Table(name="person")
@NamedQuery(name="Person.findAll", query="SELECT p FROM PersonEntity p")
public class PersonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String email;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	private String username;

	//bi-directional many-to-one association to Review
	@OneToMany(mappedBy="person")
	private List<ReviewEntity> reviews;

	public PersonEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<ReviewEntity> getReviews() {
		return this.reviews;
	}

	public void setReviews(List<ReviewEntity> reviews) {
		this.reviews = reviews;
	}

	public ReviewEntity addReview(ReviewEntity review) {
		getReviews().add(review);
		review.setPerson(this);

		return review;
	}

	public ReviewEntity removeReview(ReviewEntity review) {
		getReviews().remove(review);
		review.setPerson(null);

		return review;
	}

}