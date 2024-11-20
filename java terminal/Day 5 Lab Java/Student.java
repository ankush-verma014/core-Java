/*
 Q2. Design a Student class to manage student details and grades.
The class should include the following:
studentId, studentName, totalMarks.
Initialize the student details with or without total marks.
Define some operations such as:
addMarks(double marks): Adds the specified marks to the total.
deductMarks(double marks): Deducts the specified marks from the total if
   sufficient marks are available; otherwise, display an appropriate message.
displayStudentInfo(): Displays the student ID, name, and total marks.
*/


class Student {
    int studentId;
    String studentName;
    double totalMarks;

 
    public void addMarks(double marks) {
        totalMarks += marks;
    }

    public void deductMarks(double marks) {
        if (marks <= totalMarks) {
            totalMarks -= marks;
        } else {
            System.out.println("Sufficient marks not available");
        }
    }


    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Total Marks: " + totalMarks);
    }

    public static void main(String[] args) {

		System.out.println("Student 1st");
       
        Student s1 = new Student();
        s1.studentId = 15;
        s1.studentName = "Ankush Verma";
        s1.totalMarks = 5;

        s1.displayStudentInfo();
      
        s1.addMarks(30);
        s1.deductMarks(50);

        s1.displayStudentInfo();
       
	     System.out.println("----------------------");
		System.out.println("Student 2nd");

		 Student s2 = new Student();
        s2.studentId = 18;
        s2.studentName = "Shri ram";
        s2.totalMarks = 397;

        s2.displayStudentInfo();
      
        s1.addMarks(70);
        s2.deductMarks(20);

        s2.displayStudentInfo();
    }
}
