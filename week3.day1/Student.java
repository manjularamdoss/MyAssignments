package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Manjula");

	}
	public void studentDept() {
		System.out.println("IT");

	}
	public void studentId() {
	System.out.println("11mca026");

	}
	 public static void main(String[] args) {
	 Student obj = new Student();
	 System.out.println("====  Details from College Class  ===");
	 obj.collegeName();
	 obj.collegeCode();
	 obj.collegeRank();
	 System.out.println("===  Details from Department class  ===");
	 obj.departmentName();
	 System.out.println("===  Details from Student class  ===");
	 obj.studentName();
	 obj.studentDept();
	 obj.studentId();
	 }

}