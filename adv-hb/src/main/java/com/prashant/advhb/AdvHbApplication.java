package com.prashant.advhb;

import com.prashant.advhb.dao.AppDAO;
import com.prashant.advhb.entity.Course;
import com.prashant.advhb.entity.Instructor;
import com.prashant.advhb.entity.InstructorDetail;
import com.prashant.advhb.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdvHbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvHbApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO dao) {
		return runner -> {
			//createInstructor(dao);
			//findInstructor(dao);
			//addCourses(dao);

			createCourseAndStudents(dao);
		};

	}

	private void createCourseAndStudents(AppDAO dao) {
		Course course = new Course("SpringBoot");
		Student one = new Student("Prashant", "Shukla", "prash@love2code.com");
		Student two = new Student("Aman", "Singh", "aman@gmail.com");
		course.addStudent(one);
		course.addStudent(two);
		
	}

	private void addCourses(AppDAO dao) {
		Instructor instructor = new
				Instructor("kunal", "kushwaha", "kunal@love2code.com");

		InstructorDetail detail = new InstructorDetail("www.youtube.com/kk", "loves tech");

		instructor.setInstructorDetail(detail);

		Course dsa = new Course("DSA");
		Course dev = new Course("Dev-Ops");
		instructor.add(dsa);
		instructor.add(dev);
		System.out.println("Saving Instructor :" + instructor);
		dao.save(instructor);
	}

	private void findInstructor(AppDAO dao) {
		Instructor theInstructor = dao.findInstructorById(2);
		System.out.println(theInstructor);
	}

	private void createInstructor(AppDAO dao) {
		Instructor instructor = new
				Instructor("kunal", "kushwaha", "kunal@love2code.com");

		InstructorDetail detail = new InstructorDetail("www.youtube.com/kk", "loves tech");

		instructor.setInstructorDetail(detail);

		System.out.println("Saving Instructor :" + instructor);
		dao.save(instructor);
	}

}
