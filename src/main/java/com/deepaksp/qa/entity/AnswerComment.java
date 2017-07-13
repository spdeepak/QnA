package com.deepaksp.qa.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.deepaksp.qa.entity.interfaces.Comment;

/**
 * @author Deepak
 *
 */
@Entity
public class AnswerComment implements Comment {

	@Id
	@GeneratedValue
	private long id;

	private long version;

	private String Comment;

	@OneToOne(fetch = FetchType.EAGER)
	private Answer answer;

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public long getVersion() {
		return version;
	}

	@Override
	public void setVersion(long version) {
		this.version = version;
	}

	@Override
	public String getComment() {
		return Comment;
	}

	@Override
	public void setComment(String comment) {
		Comment = comment;
	}

}
