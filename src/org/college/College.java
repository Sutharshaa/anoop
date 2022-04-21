package org.college;

public class College {

	public void collegeName() {
    System.out.println("syed");
    
     }
	
	public void collegeCode() {
      System.out.println("9128");
	}
	
	public void collegeRank() {
		System.out.println("21");

	}
	
	public static void main(String[] args) {
		College c = new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		
		Student s = new Student();
		s.studentDept();
		s.studentID();
		s.studentName();
		
		Hostel H = new Hostel();
		H.hostelName();
		H.hashCode();
		
		Dept d = new Dept();
		d.deptName();
		
		
	}
}
