package example.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.model.Student;

@RestController
public class StudentController {
	
	private static List<Student>list=new ArrayList<Student>();
	static {
		list.add(new Student(01,"shub",55));
	}
	@GetMapping("/student")
	public List<Student> getallStudent(){
		return list;
		
	}

}
