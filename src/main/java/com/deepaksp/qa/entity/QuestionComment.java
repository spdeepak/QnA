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
public class QuestionComment extends Comment {

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "comments")
	private Question question;

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
}
