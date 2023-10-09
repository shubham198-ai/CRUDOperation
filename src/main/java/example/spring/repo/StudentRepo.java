package example.spring.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import example.spring.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {
public List<Student> findByNameStartingWith(String prefix);

public List<Student> findByName(String name);
}
