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
public class QuestionComment implements Comment {

	@Id
	@GeneratedValue
	private long id;

	private long version;

	private String Comment;

	@OneToOne(fetch = FetchType.EAGER)
	private Question question;

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
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
