package com.bawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.StudentDao;
import com.bawei.pojo.Student;
import com.bawei.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentDao dao;

	@Override
	public List<Student> listStudent() {
		return dao.listStudent();
	}
}
