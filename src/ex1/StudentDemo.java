package ex1;

import java.util.ArrayList;

import beans.Student;

public class StudentDemo {

	public static void main(String[] args) {
		// Tao ra 1 al luu tru gia tri cua 3 sinh vien
		ArrayList<Student> al = new ArrayList<>();
		Student s1 = new Student(1, "Bao", "DHDT");
		Student s2 = new Student(2, "Han", "DHBK");
		Student s3 = new Student(3, "Ngan", "DHSP");

		// them 3 sv vao al
		al.add(s1);
		al.add(s2);
		al.add(s3);

		// 1. hoi co bao nhieu phan tu
		System.out.println("Size: " + al.size());

		// 2. in danh sach cac phan tu trong al
		for (Student obj : al) {
			System.out.println(obj);
			System.out.println("=====================");
		}
	}

}
