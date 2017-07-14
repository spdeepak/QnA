package com.deepaksp.qa.entity.repository;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.deepaksp.qa.entity.Topic;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicRepositoryTest {

	@Resource
	private TopicRepository topicRepository;

	@Test
	public void test() {
		Topic topic = new Topic();
		topic.setName("Leverton");
		topic.setDescription("Builds a machine learning tool using AI to read lease documents");
		topicRepository.save(topic);
		System.out.println(topic.getId());
		System.out.println(topic.getName());
		System.out.println(topic.getDescription());
	}

}
