package service;

import java.util.List;

import dao.IStudentDao;
import dao.StudentDaoMyAqlImpl;
import exception.NameRepeatException;
import pojo.Student;

public class StudentServiceImpl implements IStudentService{
	private IStudentDao studentDao = new StudentDaoMyAqlImpl();

	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	public boolean add(Student student) throws NameRepeatException {
		if (studentDao.checkName(student.getName())) {
			throw new NameRepeatException("用户已经存在");
		} else {
			int result = studentDao.add(student);
			if (result > 0) {
				return true;
			} else {
				return false;
			}
		}
	}
}
