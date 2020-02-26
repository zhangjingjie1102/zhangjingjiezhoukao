package com.bawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bawei.pojo.Student;
import com.bawei.service.StudentService;

@Controller
public class StudentController {
	
	
	@Autowired
	private StudentService service;
	
	
	@RequestMapping("listStudent")
	public String listGood(Model m) {
		
		List<Student> list = service.listStudent();
		m.addAttribute("list", list);
		return "list";
	}
}
