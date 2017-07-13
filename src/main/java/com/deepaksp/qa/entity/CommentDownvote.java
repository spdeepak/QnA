package com.deepaksp.qa.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.deepaksp.qa.entity.interfaces.Vote;

/**
 * @author Deepak
 *
 */
@Entity
public class CommentDownvote implements Vote {

	@Id
	@GeneratedValue
	private long id;

	@OneToOne(fetch = FetchType.EAGER)
	private User user;

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public User getUser() {
		return user;
	}

	@Override
	public void setUser(User user) {
		this.user = user;
	}
}
