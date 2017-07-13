package com.deepaksp.qa.entity.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.deepaksp.qa.entity.Question;

@Repository
public interface QuestionRepository extends PagingAndSortingRepository<Question, Long> {

}
