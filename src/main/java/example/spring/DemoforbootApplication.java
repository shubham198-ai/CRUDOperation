package example.spring;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import example.spring.model.Student;
import example.spring.repo.StudentRepo;

@SpringBootApplication
public class DemoforbootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoforbootApplication.class, args);
		StudentRepo studentrepo = context.getBean(StudentRepo.class);
		// create student data
//
//		Student student1 = new Student();
//		student1.setName("shubham");
//		student1.setMarks(85);
//
//		Student student2 = new Student();
//		student2.setName("raj");
//		student2.setMarks(54);
//		List<Student> ops = Arrays.asList(student1, student2);
//		Iterable<Student> itr = studentrepo.saveAll(ops);
//		itr.forEach(System.out::println);
//
//		// update
//		Optional<Student> opt = studentrepo.findById(5);
//		Student stud = opt.orElse(student1);
//		stud.setName("rahul");
//		stud.setMarks(88);
//		Student stu = studentrepo.save(stud);
//		System.out.println(stu);
//		Iterable<Student> itr1 = studentrepo.findAll();
//		itr1.forEach(System.out::println);

		// delet=
		//studentrepo.deleteById(3);
		//System.out.println("deleted");
		//System.out.println("..............................................");
		
		//custom operation
		List<Student>studentlist=studentrepo.findByName("shubham");
		studentlist.forEach(System.out::println);
		//List<Student>list=studentrepo.findByNameStartingWith("r");
		//list.forEach(System.out::println);
		
		
	}

	// studentrepo.save(student1);
	// System.out.println(student1);

	// update student
	// Optional<Student>optional=studentrepo.findById(2);
	// Student student2=optional.get();
	// student2.setName("ravi");
	// student2.setMarks(58);
	// studentrepo.save(student2);
	// System.out.println(student2);

	// delete student

}
