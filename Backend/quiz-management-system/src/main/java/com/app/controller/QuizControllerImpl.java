package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.QuizService;

@RestController
public class QuizControllerImpl implements QuizController {
	@Autowired
	private QuizService service;
}