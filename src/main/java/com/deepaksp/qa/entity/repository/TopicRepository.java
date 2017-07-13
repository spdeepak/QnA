package com.deepaksp.qa.entity.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.deepaksp.qa.entity.Topic;

@Repository
public interface TopicRepository extends PagingAndSortingRepository<Topic, Long> {

}
