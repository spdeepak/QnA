package com.deepaksp.qa.entity.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.deepaksp.qa.entity.QuestionComment;

/**
 * @author Deepak
 *
 */
@Repository
public interface QuestionCommentRepository extends PagingAndSortingRepository<QuestionComment, Long> {

	public List<QuestionComment> findByCreatedDate(Date date);
}
