package com.deepaksp.qa.entity.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.deepaksp.qa.entity.AnswerComment;

/**
 * @author Deepak
 *
 */
@Repository
public interface AnswerCommentRepository extends PagingAndSortingRepository<AnswerComment, Long> {

	public List<AnswerComment> findByCreatedDate(Date date);
}
