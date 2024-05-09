package com.prashant.cruddemo;

import com.prashant.cruddemo.dao.StudentDAO;
import com.prashant.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println(studentDAO.deleteAll());
	}

	private void deleteStudent(StudentDAO studentDAO) {
		getAllStudents(studentDAO);
		studentDAO.delete(1001);
		getAllStudents(studentDAO);
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student a = studentDAO.findById(1001);
		a.setLastname("Shukla");
		studentDAO.update(a);
		System.out.println(studentDAO.findById(1001));
	}

	private void getAllStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for (Student student: students) {
			System.out.println(student);
		}
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object.....");
		Student newStudent = new Student("Aman", "Singh", "thakur@gmail.com");


		//save the student in the database
		System.out.println("Saving to the Database......");
		studentDAO.save(newStudent);


		//display the id of the saved student
		System.out.println("Generated id of the saved student :"+newStudent.getId());

		// Load a Student from the Database

		Student retStu = studentDAO.findById(newStudent.getId());
		// print the details of the loaded student;
		System.out.println(retStu.toString());
	}


}
