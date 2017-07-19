package com.deepaksp.qa.entity.repository;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.deepaksp.qa.entity.Topic;

/**
 * @author Deepak
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicRepositoryTest {

	@Resource
	private TopicRepository topicRepository;

	private void populateDate() {
		Topic topic = new Topic();
		topic.setName("Leverton");
		topic.setDescription("Builds a machine learning tool using AI to read lease documents");
		topicRepository.save(topic);
	}

	@Test
	public void testFindByName() {
		populateDate();
		Topic topic = topicRepository.findByNameIgnoreCase("leverton").get(0);
		assertEquals("Builds a machine learning tool using AI to read lease documents", topic.getDescription());
	}

	@Test
	public void testFindByDescriptionContains() {
		populateDate();
		Topic topic = topicRepository.findByDescriptionContainsIgnoreCase("machine LEARNING").get(0);
		assertEquals("Builds a machine learning tool using AI to read lease documents", topic.getDescription());
		assertEquals("Leverton", topic.getName());
	}

}
