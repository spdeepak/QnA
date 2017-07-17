package com.deepaksp.qa.entity.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.deepaksp.qa.entity.Topic;

@Repository
public interface TopicRepository extends PagingAndSortingRepository<Topic, Long> {

	public List<Topic> findByNameIgnoreCase(String name);

	public List<Topic> findByNameContainsIgnoreCase(String name);

	public List<Topic> findByDescriptionIgnoreCase(String description);

	public List<Topic> findByDescriptionContainsIgnoreCase(String description);
}
