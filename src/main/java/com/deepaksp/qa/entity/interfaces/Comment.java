package com.deepaksp.qa.entity.interfaces;

import java.util.Set;

import com.deepaksp.qa.entity.CommentDownvote;
import com.deepaksp.qa.entity.CommentUpvote;
import com.deepaksp.qa.entity.User;

/**
 * @author Deepak
 *
 */
public interface Comment<T> {

	public long getId();

	public void setId(long id);

	public long getVersion();

	public void setVersion(long version);

	public String getComment();

	public void setComment(String comment);

	public User getUser();

	public void setUser(User user);

	public Set<CommentUpvote> getUpvotes();

	public void setUpvotes(Set<CommentUpvote> upvotes);

	public Set<CommentDownvote> getDownvotes();

	public void setDownvotes(Set<CommentDownvote> downvotes);

}
