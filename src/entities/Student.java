package entities;

public class Student implements Comparable<Student>{

	private final String name;
	private final Integer id;
	private Double cgpa;
	
	public Student(String name, Integer id, Double cgpa) {
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public Double getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return id + "| " + name + " - CGPA: " + cgpa;
	}

	//Order for biggest CGPA
	@Override
	public int compareTo(Student other) {
		if(this.cgpa > other.getCgpa()) {
			return - 1;
		} else if(this.cgpa < other.getCgpa()) {
			return 1;
		} else {
			return 0;
		}
	}
}
