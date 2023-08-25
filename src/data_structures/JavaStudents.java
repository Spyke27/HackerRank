package data_structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.Student;

public class JavaStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Bob", 2, 4.20));
		list.add(new Student("Evellyn", 5, 4.20));
		list.add(new Student("Cindy", 3, 4.20));
		list.add(new Student("Anna", 1, 4.20));
		list.add(new Student("David", 4, 4.20));
		
		
		Collections.sort(list);
		
		for(Student student: list) {
			System.out.println(student);
		}

		sc.close();
	}

}
