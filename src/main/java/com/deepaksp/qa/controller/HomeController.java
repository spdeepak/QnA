package com.deepaksp.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.deepaksp.qa.entity.repository.QuestionRepository;

@Controller
public class HomeController {

	@Autowired
	private QuestionRepository questionRepository;

	@GetMapping(value = "/")
	public String goToHomePage(Model model) {
		model.addAttribute("questions", questionRepository.findAll());
		model.addAttribute("latest", questionRepository.findFirst10ByOrderByCreatedDate());
		return "home";
	}
}
