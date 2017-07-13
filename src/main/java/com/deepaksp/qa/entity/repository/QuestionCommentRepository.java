package com.deepaksp.qa.entity.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.deepaksp.qa.entity.QuestionComment;

@Repository
public interface QuestionCommentRepository extends PagingAndSortingRepository<QuestionComment, Long> {

}
