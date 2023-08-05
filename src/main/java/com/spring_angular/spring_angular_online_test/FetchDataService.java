package com.spring_angular.spring_angular_online_test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchDataService extends JpaRepository<UserModel, Integer> {

	ArrayList arrlist=new ArrayList();
	@Override
	List<UserModel> findAll();
	public static void main (String[] args) {
		//System.out.println(List<UserModel>);
		
		for (int i = 0; i < arrlist.size();i++) 
	      { 		      
	          System.out.println(arrlist.get(i)); 		
	      }   
	}
}
