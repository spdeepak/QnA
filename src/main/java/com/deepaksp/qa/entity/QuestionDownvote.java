package com.deepaksp.qa.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.deepaksp.qa.entity.interfaces.Vote;

/**
 * @author Deepak
 *
 */
@Entity
public class QuestionDownvote implements Vote {

	@Id
	@GeneratedValue
	private long id;

	@OneToMany(fetch = FetchType.EAGER)
	private Set<User> users = new HashSet<>();

	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public Set<User> getUsers() {
		return users;
	}

	@Override
	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
