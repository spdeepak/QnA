package com.deepaksp.qa.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Deepak
 *
 */
@Entity
public class AnswerComment extends Comment {

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "comments")
	private Answer answer;
}
