package example.spring.repo;

import org.springframework.data.repository.CrudRepository;

import example.spring.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
