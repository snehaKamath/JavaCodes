import java.util.Arrays;

public class StudentStacks {

	private String[] studentArray;
	private int seatingCapacity;

	private int topOfStack = -1;

	StudentStacks(int size) {
		this.seatingCapacity = size;
		studentArray = new String[size];

		Arrays.fill(studentArray, "-1");

	}

	public void addStudents(String studentName) {

		if (topOfStack + 1 < seatingCapacity) {

			topOfStack++;

			studentArray[topOfStack] = studentName;
			System.out.println(studentName + " was added to the class");

		} else {
			System.out.println("Class seating capacity is full");
		}
		
	}

	public String removeStudent() {

		if (topOfStack >= 0) {
			System.out.println(studentArray[topOfStack] + " was removed from the class");
			studentArray[topOfStack] = "-1";
			

			return studentArray[topOfStack--];
		} else {
			System.out.println("Nobody seated in the class");
			return null;
		}

	}

	public void viewStudents() {
		System.out.println("Student currently seated:");
		for (int i = 0; i <= topOfStack; i++) {
			System.out.println(studentArray[i]);
		}
	}

	public static void main(String args[]) {
        StudentStacks students = new StudentStacks(5);
        String remove_student;
		students.addStudents("Sneha");
		students.addStudents("Samata");
		students.addStudents("Shreya");
		students.viewStudents();
		remove_student = students.removeStudent();
		students.viewStudents();
		students.addStudents("Nikita");
		students.addStudents("Anusha");
		students.addStudents("Piya");
		students.viewStudents();
		students.addStudents("Asha");
		students.addStudents("Parineeta");
		remove_student = students.removeStudent();
		students.viewStudents();
   }

}