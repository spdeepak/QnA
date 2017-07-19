package com.deepaksp.qa.entity.repository;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Deepak
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AnswerRepositoryTest {

	@Resource
	private AnswerRepository answerRepository;

	@Test
	public void test() {

	}

}
