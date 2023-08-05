package com.spring_angular.spring_angular_online_test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_onlinetest {
	
	@Autowired
	FetchDataService fetchDataServices;
	
	@GetMapping(path="online_test_data")
	List<UserModel> getUsers() {
		return fetchDataServices.findAll();
	}
}