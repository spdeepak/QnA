package com.deepaksp.qa.entity.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.deepaksp.qa.entity.Answer;
import com.deepaksp.qa.entity.Question;

/**
 * @author Deepak
 *
 */
@Repository
public interface AnswerRepository extends PagingAndSortingRepository<Answer, Long> {

	public List<Answer> findByCreatedDate(Date date);

	public List<Answer> findByUserId(Long useId);

	public List<Answer> findByQuestion(Question question);

	public List<Answer> findByQuestionId(Long questionId);
}
