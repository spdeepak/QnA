package com.deepaksp.qa.entity.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.deepaksp.qa.entity.User;

/**
 * @author Deepak
 *
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	public List<User> findByFirstName(String firstName);

	public List<User> findByFirstNameContainsIgnoreCase(String firstName);

	public List<User> findByMiddleName(String middleName);

	public List<User> findByMiddleNameContainsIgnoreCase(String middleName);

	public List<User> findByLastName(String lastName);

	public List<User> findByLastNameContainsIgnoreCase(String lastName);

	public List<User> findByFirstNameAndMiddleNameAndLastNameContainsIgnoreCase(String firstName, String middleName,
			String lastName);
}
