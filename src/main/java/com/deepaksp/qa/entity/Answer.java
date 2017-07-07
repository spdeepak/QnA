package com.deepaksp.qa.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

}
