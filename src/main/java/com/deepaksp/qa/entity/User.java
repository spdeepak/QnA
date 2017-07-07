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

}
