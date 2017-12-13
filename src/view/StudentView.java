package view;

import java.util.List;
import java.util.Scanner;
import controller.StudentController;
import exception.NameRepeatException;
import pojo.Student;

public class StudentView {
	private StudentController studentController = new StudentController();
	private Scanner scanner = new Scanner(System.in);
	
	public void showView() {
		while (true) {
			System.out.println("------ѧ������ϵͳ------");
			System.out.println("1.��ѯ����");
			System.out.println("2.���");
			System.out.println("3.�޸�");
			System.out.println("4.ɾ��");
			System.out.println("0.�˳�");
			System.out.println("��ѡ��");
			int selecte = scanner.nextInt();
			if (selecte == 0) {
				break;
			} else {
				switch (selecte) {
				case 1:
					findAll();
					break;
				case 2:
					add();
					break;
				default:
					break;
				}
			}
		}
	}

	private void add() {
		while (true) {
			System.out.println("������ѧ������");
			String name = scanner.next();
			System.out.println("������ѧ�����䣺");
			int age = scanner.nextInt();
			System.out.println("������ѧ���Ա�");
			String gender = scanner.next();
			System.out.println("������ѧ����ַ��");
			String address = scanner.next();
			boolean result = false;
			try {
				result = studentController.add(name, age, gender, address);
			} catch (NameRepeatException e) {
				System.out.println(e.getMessage());
			}
			if (result) {
				System.out.println("��ӳɹ�");
			} else {
				System.out.println("���ʧ��");
			}
			
			System.out.println("�Ƿ�������룺1������  0���˳�");
			int quit = scanner.nextInt();
			if (quit == 0) {
				break;
			}
		}
	}

	private void findAll() {
		List<Student> list = studentController.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
