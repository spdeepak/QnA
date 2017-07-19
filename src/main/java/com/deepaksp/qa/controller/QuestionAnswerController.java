package com.deepaksp.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.deepaksp.qa.entity.Question;
import com.deepaksp.qa.entity.repository.AnswerRepository;
import com.deepaksp.qa.entity.repository.QuestionRepository;

/**
 * @author d.prabhakar
 *
 */
@Controller
public class QuestionAnswerController {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@GetMapping("/question/{questionId}")
	public String goToQuestionPage(@PathVariable("questionId") Long questionId, Model model) {
		Question question = questionRepository.findOne(questionId);
		model.addAttribute("question", question);
		return "questions";
	}
}
