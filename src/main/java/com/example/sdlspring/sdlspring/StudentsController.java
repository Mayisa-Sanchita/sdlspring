package com.example.sdlspring.sdlspring;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sdlspring.sdlspring.models.Students;
import com.example.sdlspring.sdlspring.repositories.StudentsRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/students")

public class StudentsController {

	@Autowired
	private StudentsRepository repository;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Students> getAllStudents() {
	  return repository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Students getStudentById(@PathVariable("id") ObjectId id) {
	  return repository.findBy_id(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyStudentById(@PathVariable("id") ObjectId id, @Valid @RequestBody Students students) {
	  students.set_id(id);
	  repository.save(students);
	}
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Students createStudent(@Valid @RequestBody Students students) {
	  students.set_id(ObjectId.get());
	  repository.save(students);
	  return students;
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable ObjectId id) {
	  repository.delete(repository.findBy_id(id));
	}
	
	
	
}
