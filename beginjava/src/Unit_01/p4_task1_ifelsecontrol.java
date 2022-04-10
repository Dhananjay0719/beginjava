package Unit_01;
import java.util.Scanner;
public class p4_task1_ifelsecontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        p4_task1_ifelsecontrol obj= new p4_task1_ifelsecontrol();
		obj.flowControl();
	}
	void flowControl() {
		boolean pass = true;
		
		// if else conditions
		if(pass) 
			System.out.println("You have successfully passed :)");
		else
			System.out.println("Try again :)");
		
		
		// creating scanner object
		Scanner input = new Scanner(System.in);
		
		// if else ladder
		float cgpa;
		System.out.println("Enter CGPA secured : ");
		cgpa = input.nextFloat();
		
		if(cgpa >= 9.0f && cgpa < 10.0f)
			System.out.println("Outstanding");
		else if(cgpa >= 8.5f && cgpa < 9.0f)
			System.out.println("Very Good");
		else if(cgpa >= 7.0f && cgpa < 8.5f)
			System.out.println("Good");
		else
			System.out.println("Can do better");
		
		if(cgpa > 10.f)
			System.out.println("Invalid Entry");
		
		
		input.close();		
	}
}
