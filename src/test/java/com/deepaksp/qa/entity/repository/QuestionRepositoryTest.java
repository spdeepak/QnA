package com.deepaksp.qa.entity.repository;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.deepaksp.qa.util.DateUtil;

/**
 * @author Deepak
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionRepositoryTest {

	@Resource
	private QuestionRepository questionRepository;

	@Test
	public void testFindByCreatedDateBetween() {
		System.out.println(questionRepository
				.findByCreatedDateBetweenOrderByCreatedDateDesc(DateUtil.pastMonth(), new Date()).size());
		System.out.println(questionRepository.findByCreatedDateBeforeOrderByCreatedDateDesc(new Date()).size());
	}

}
