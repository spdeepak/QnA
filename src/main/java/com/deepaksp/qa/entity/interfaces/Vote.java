package com.deepaksp.qa.entity.interfaces;

import java.util.Set;

import com.deepaksp.qa.entity.User;

/**
 * @author Deepak
 *
 */
public interface Vote {

	public long getId();

	public void setId(long id);

	public Set<User> getUsers();

	public void setUsers(Set<User> users);

}
