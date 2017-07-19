package com.deepaksp.qa.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.deepaksp.qa.entity.repository.QuestionRepository;
import com.deepaksp.qa.util.DateUtil;

/**
 * @author Deepak
 *
 */
@Controller
public class HomeController {

	@Autowired
	private QuestionRepository questionRepository;

	@GetMapping(value = "/")
	public String goToHomePage(Model model) {
		model.addAttribute("questions", questionRepository.findAll());
		model.addAttribute("latest", questionRepository.findFirst10ByOrderByCreatedDate());
		model.addAttribute("week", questionRepository.findByCreatedDateBetweenOrderByCreatedDateDesc(DateUtil.pastWeek(), new Date()));
		model.addAttribute("month", questionRepository.findByCreatedDateBetweenOrderByCreatedDateDesc(DateUtil.pastMonth(), new Date()));
		return "home";
	}

}
