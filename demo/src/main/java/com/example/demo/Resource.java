package com.example.demo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {
	
	@Autowired
	DbPostgres repo;
	
	@GetMapping
	public List<Alien> fun() {
		
		List<Alien> list = new LinkedList<>();
		
		
		Alien obj = new Alien();
		obj.id = 1;
		obj.name = "hari";
		
		Alien obj2 = new Alien();
		obj2.id = 2;
		obj2.name = "yadav";
		
		list.add(obj);
		list.add(obj2);
		
		
		return list;
	}
	
	@PostMapping
	public List<Alien> fun2() {
		
		List<Alien> list = new LinkedList<>();
		
		
		Alien obj = new Alien();
		obj.id = 3;
		obj.name = "hari";
		
		Alien obj2 = new Alien();
		obj2.id = 4;
		obj2.name = "yadav";
		
		list.add(obj);
		list.add(obj2);
		
		
		return list;
	}
	
	
	@GetMapping("db")
	public List<Alien> fun3() {
		
		//List<Alien> list = new LinkedList<>();
		
		
		List<Alien> list  = (List<Alien>) repo.findAll();
		
		
		return list;
	}
	
}
