package com.deepaksp.qa.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Deepak
 *
 */
@Entity
public class Answer {

	@Id
	@GeneratedValue
	private long id;

	private long version;

	@OneToOne(fetch = FetchType.EAGER)
	private Question question;

	@OneToOne(fetch = FetchType.EAGER)
	private User user;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<AnswerComment> comments = new HashSet();

}
