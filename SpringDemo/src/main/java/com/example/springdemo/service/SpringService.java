package com.example.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exapmle.springdemo.repository.SpringRepository;

@Service
public class SpringService {
	@Autowired
	SpringRepository springRepo;
	
}
