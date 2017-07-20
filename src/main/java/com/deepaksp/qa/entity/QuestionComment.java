package com.deepaksp.qa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.deepaksp.qa.entity.interfaces.Comment;

/**
 * @author Deepak
 *
 */
@Entity
public class QuestionComment implements Comment<QuestionComment> {

	@Id
	@GeneratedValue
	private long id;

	private long version;

	@Column(columnDefinition = "TEXT")
	private String Comment;

	@OneToOne(fetch = FetchType.EAGER)
	private Question question;

	@OneToOne(fetch = FetchType.EAGER)
	private User user;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<CommentUpvote> upvotes = new HashSet<>();

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<CommentDownvote> downvotes = new HashSet<>();

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

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

	@Override
	public User getUser() {
		return user;
	}

	@Override
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public Set<CommentUpvote> getUpvotes() {
		return upvotes;
	}

	@Override
	public void setUpvotes(Set<CommentUpvote> upvotes) {
		this.upvotes = upvotes;
	}

	@Override
	public Set<CommentDownvote> getDownvotes() {
		return downvotes;
	}

	@Override
	public void setDownvotes(Set<CommentDownvote> downvotes) {
		this.downvotes = downvotes;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
