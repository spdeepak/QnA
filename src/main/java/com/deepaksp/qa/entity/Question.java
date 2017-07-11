package com.deepaksp.qa.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Deepak
 *
 */
@Entity
public class Question {

	@Id
	@GeneratedValue
	private long id;

	private long version;

	private String question;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<QuestionComment> comments = new HashSet();
}