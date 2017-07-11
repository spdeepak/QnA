package com.deepaksp.qa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Email;

/**
 * @author Deepak
 *
 */
@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;

	private long version;

	private String firstName;

	private String middleName;

	private String lastName;

	@Email
	private String email;

	private Date dateOfBirth;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Question> askQuestions = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Question> followQuestions = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Question> getAskQuestions() {
		return askQuestions;
	}

	public void setAskQuestions(List<Question> askQuestions) {
		this.askQuestions = askQuestions;
	}

	public List<Question> getFollowQuestions() {
		return followQuestions;
	}

	public void setFollowQuestions(List<Question> followQuestions) {
		this.followQuestions = followQuestions;
	}

}
