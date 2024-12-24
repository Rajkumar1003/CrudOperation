package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	StudentService ss;
	@PostMapping(value = "/post")
	public String post(@RequestBody Student s) {
		return ss.post(s);
	}
	@PostMapping(value = "/list")
	public String emp(@RequestBody List<Student> s) {
		return ss.emp(s);
	}
	@GetMapping(value = "/get")
	public List<Student> getAll(){
		return ss.getAll();
	}
	@GetMapping(value = "/val/{a}")
	public Student num(@PathVariable int a) {
		return ss.num(a);
	}
	@DeleteMapping(value = "/del/{a}")
	public String d(@PathVariable int a) {
		return ss.d(a);
	}
	
	@PutMapping(value = "/update/{a}")
	public String update(@PathVariable int a,@RequestBody Student s) {
		return ss.update(a,s);
	}
	
	@GetMapping(value="/one")
	public String getOne() {
		return "hello";
	}

}
