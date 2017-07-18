package com.deepaksp.qa.entity.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.deepaksp.qa.entity.Question;

/**
 * @author Deepak
 *
 */
@Repository
public interface QuestionRepository extends PagingAndSortingRepository<Question, Long> {

	public List<Question> findByQuestionContainsIgnoreCase(String question);

	public List<Question> findByTopicsName(String topicName);

	public List<Question> findByCreatedDate(Date date);

	public List<Question> findFirst10ByOrderByCreatedDate();

	public List<Question> findByCreatedDateBetween(Date date1, Date date2);
}
