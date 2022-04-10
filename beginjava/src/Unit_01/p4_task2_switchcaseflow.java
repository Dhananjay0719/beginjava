package Unit_01;
import java.util.Scanner;
public class p4_task2_switchcaseflow {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int day;
		System.out.println("Enter Day : ");
		day = input.nextInt();
		
		p4_task2_switchcaseflow obj = new p4_task2_switchcaseflow();
		obj.switchTest(day);
		
		input.close();
	}
    public void switchTest(int day) {	
		switch(day) {
		case 1: System.out.println("Day 1 : Monday"); break;
		case 2: System.out.println("Day 2 : Tuesday"); break;
		case 3: System.out.println("Day 3 : Wednesday"); break;
		case 4: System.out.println("Day 4 : Thursday"); break;
		case 5: System.out.println("Day 5 : Friday"); break;
		case 6: System.out.println("Day 6 : Saturday"); break;
		case 7: System.out.println("Day 7 : Sunday"); break;
		default : System.out.println("Invalid day!");
		}
}
}