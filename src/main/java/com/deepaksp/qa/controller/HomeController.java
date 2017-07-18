package com.deepaksp.qa.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.deepaksp.qa.entity.repository.QuestionRepository;

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
		model.addAttribute("week", questionRepository.findByCreatedDateBetween(new Date(), pastWeek(new Date())));
		model.addAttribute("month", questionRepository.findByCreatedDateBetween(new Date(), pastMonth(new Date())));
		return "home";
	}

	private Date pastWeek(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -7);
		return cal.getTime();
	}

	private Date pastMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.MONTH, -1);
		return cal.getTime();
	}
}
