package service;

import java.util.List;

import exception.NameRepeatException;
import pojo.Student;

public interface IStudentService {
	List<Student> findAll();
	boolean add(Student student) throws NameRepeatException;
}
