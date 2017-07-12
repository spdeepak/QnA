package com.deepaksp.qa.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

/**
 * @author Deepak
 *
 */
@Entity
public class AnswerComment extends Comment {

	@OneToOne(fetch = FetchType.EAGER)
	private Answer answer;

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
}
