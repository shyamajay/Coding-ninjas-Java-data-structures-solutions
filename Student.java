package classesandobjects;
import java.util.Scanner;

public class Student {

	private static int roll_no;
	static int num_students;
	String name;
	
	public int getroll_no()
	{
		return Student.roll_no;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public Student()
	{
		System.out.println("Enter the name of the student");
		Scanner s = new Scanner(System.in);
		this.name = s.nextLine();
		num_students++;
		roll_no = num_students;
	}
	
	public void display()
	{
		System.out.println("The name of the student is " + name + " and the roll number is : " + roll_no);
	}
	
	
}
