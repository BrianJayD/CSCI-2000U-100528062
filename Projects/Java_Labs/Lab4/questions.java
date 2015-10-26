import java.util.Scanner;
import java.util.*;

public class questions {

	void q1()
	{
		String backwards = "";
		String forward = "";
		String changeCase = "";

		System.out.println("Enter a String:");
		Scanner scan = new Scanner(System.in);
		forward = scan.nextLine();
		int length = forward.length();

		for (int i = length - 1; i >= 0; i--) {
			backwards = backwards + forward.charAt(i);

		}
		System.out.println("Reversed String: " + backwards);

		for (int j = 0; j < length; j++) {
			int c = forward.charAt(j);
			if (c > 64 && c < 91) {
				c = c + 32;
				System.out.print((char) c);
			}
			else if (c > 96 && c < 123) {
				c = c -32;
				System.out.print((char) c);
			}
			else if (c == 32) {
				System.out.print(" ");
			}
			else if (c > 32 && c < 65) {
				System.out.print((char) c);
			}

		}
		System.out.println("");



	}
	
	void q2()
	{
		Student s1_1 = new Student("Tom", "Oshawa", "Computer Science");
		Student s1_2 = new Student("Tom", "Oshawa", "Computer Science");
		
		Student s2_1 = new Student("Jean", "Toronto", "Chemistry");
		Student s2_2 = new Student("Jean", "Toronto");
		
		Student s3_1 = new Student("Tom", "Toronto");
		Student s3_2 = new Student("Tom", "Oshawa");
		
		Student s4_1 = new Student("Kate", "Whiteby");
		Student s4_2 = new Student("Tom", "Whiteby");
		
		/*
		System.out.println(s1_1.compareTo(s1_2));
		System.out.println(s2_1.compareTo(s2_2));
		System.out.println(s3_1.compareTo(s3_2));
		System.out.println(s4_1.compareTo(s4_2));*/
	}
}