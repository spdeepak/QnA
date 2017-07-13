package com.deepaksp.qa.entity.interfaces;

import com.deepaksp.qa.entity.User;

/**
 * @author Deepak
 *
 */
public interface Vote {

	public long getId();

	public void setId(long id);

	public User getUser();

	public void setUser(User user);

}
