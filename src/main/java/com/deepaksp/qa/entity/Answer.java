package com.deepaksp.qa.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	@JoinColumn(name = "answer")
	private Set<AnswerComment> comments = new HashSet();

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

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<AnswerComment> getComments() {
		return comments;
	}

	public void setComments(Set<AnswerComment> comments) {
		this.comments = comments;
	}

}
