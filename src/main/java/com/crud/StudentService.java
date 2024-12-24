package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;
	public String post(Student s) {
		return sd.post(s);
	}
	
	public String emp(List<Student> s) {
		return sd.emp(s);
	}
	public List<Student> getAll(){
		return sd.getAll();
	}
	public Student num( int a) {
		return sd.num(a);
	}
	public String d(int a) {
		return sd.d(a);
	}
	public String update(int a,Student s) {
		return sd.update(a,s);
	}
	

}
