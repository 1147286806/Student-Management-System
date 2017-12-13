package controller;


import java.util.Date;
import java.util.List;
import exception.NameRepeatException;
import pojo.Student;
import service.IStudentService;
import service.StudentServiceImpl;

public class StudentController {
	private IStudentService studentService = new StudentServiceImpl();
	
	public List<Student> findAll() {
		return studentService.findAll();
	}
	
	public boolean add(String name, int age , String gender, String address)throws NameRepeatException {
		Student student = new Student(name, age, gender, address, new Date());
		return studentService.add(student);
	}
}
