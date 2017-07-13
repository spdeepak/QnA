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
public class Question {

	@Id
	@GeneratedValue
	private long id;

	private long version;

	private String question;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<QuestionComment> comments = new HashSet<>();

	@OneToOne(fetch = FetchType.EAGER)
	private User creator;

	@OneToMany(fetch = FetchType.LAZY)
	private Set<User> followers = new HashSet<>();

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<QuestionUpvote> upvotes = new HashSet<>();

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<QuestionDownvote> downvotes = new HashSet<>();

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Topic> topics = new HashSet<>();

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

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Set<QuestionComment> getComments() {
		return comments;
	}

	public void setComments(Set<QuestionComment> comments) {
		this.comments = comments;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Set<QuestionUpvote> getUpvotes() {
		return upvotes;
	}

	public void setUpvotes(Set<QuestionUpvote> upvotes) {
		this.upvotes = upvotes;
	}

	public Set<QuestionDownvote> getDownvotes() {
		return downvotes;
	}

	public void setDownvotes(Set<QuestionDownvote> downvotes) {
		this.downvotes = downvotes;
	}

	public Set<User> getFollowers() {
		return followers;
	}

	public void setFollowers(Set<User> followers) {
		this.followers = followers;
	}

	public Set<Topic> getTopics() {
		return topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}
}