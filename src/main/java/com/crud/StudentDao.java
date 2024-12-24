package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.PathVariable;import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sr;
	public String post(Student s) {
		sr.save(s);
		return "posted";
	}
	
	public String emp(List<Student> s) {
		sr.saveAll(s);
		return "posted";
	}
	public List<Student> getAll(){
		return sr.findAll();
	}
	public Student num( int a) {
		return sr.findById(a).get();
	}
	public String d(int a) {
		sr.deleteById(a);
		return "deleted";
	}
	public String update(int a,Student s) {
		sr.save(s);
		return "updated";
		
		
	}
	

}
