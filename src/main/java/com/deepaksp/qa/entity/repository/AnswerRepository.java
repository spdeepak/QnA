package com.deepaksp.qa.entity.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.deepaksp.qa.entity.Answer;

@Repository
public interface AnswerRepository extends PagingAndSortingRepository<Answer, Long> {

}
