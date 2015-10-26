import java.util.Scanner;
import java.util.Arrays; // Allows me to print out the array for q3();
import java.util.Random; //Allows computer to randomly choose a number for q5();

class questions {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);

		boolean choice = true;
		boolean end = false;

		System.out.println("Please enter a question number between 1 and 5, input 0 to print Hello World");

		while (choice) {
			while (!end) {
				int qNum = user.nextInt();
				switch (qNum) {
					case 0:
						q0();
						System.out.println("Choose another question:");
						break;
					case 1:
						q1();
						System.out.println("Choose another question:");
						break;
					case 2:
						q2();
						System.out.println("Choose another question:");
						break;
					case 3:
						q3();
						System.out.println("Choose another question:");
						break;
					case 4:
						q4();
						System.out.println("Choose another question:");
						break;
					case 5:
						q5();
						System.out.println("Choose another question:");
						break;
				}
			}
		}
	}


	//This is an example
	static void q0()
	{
		System.out.println("Hello World!");
	}
	
		
	static void q1()
	{
		double val1, val2, val3;
		double average;
		Scanner scan = new Scanner(System.in);

       // get three values from user
     	System.out.println("Get three intergers and I will compute their average");
     	System.out.println("Enter 1st interger: ");
     	val1 = scan.nextInt();
     	System.out.println("Enter 2nd interger: ");
     	val2 = scan.nextInt();
     	System.out.println("Enter 3rd interger: ");
     	val3 = scan.nextInt();
       //Calculate average here
       average = (val1 + val2 + val3) / 3;
       //Print it out here
       System.out.println("Average of " + val1 + ", " + val2 + " and " + val3 + ": " + average);
      
	}
	
	static void q2()
	{
		System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("==          Student Points          ==");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
		System.out.println("Name\t\tLab\tBonus\tTotal");
		System.out.println("----\t\t---\t-----\t-----");
		System.out.println("Joe\t\t43\t7\t50");
		System.out.println("William\t\t50\t8\t58");
		System.out.println("Mary Sue\t39\t10\t59");
	}

	static void q3()
	{

		Scanner sc = new Scanner(System.in);
		int[] set =  new int[5];
		
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter in a number between 10 and 100: ");
			int num = sc.nextInt();

			if (num < 10 || num > 100) {
				System.out.println("Number not between 10 and 100!");
			}
			else {
				set[i] = num;
				for (int j = 0; j < 5; j++) {
					if (set[i] == set[j] && i != j) {
						System.out.println("Duplicate found: " + num);
						set[j] = 0;
						break;
					}
				}
			}
			if (i == 4) {
				for (int j = 0; j < 4; j++) {
					if (set[i] == set[j]) {
						
						set[i] = 0;
						set[j] = 0;
						break;
					}
				}
			}
		}


		System.out.println("Displaying valid inputs.");


		for (int i = 0; i < 5; i++) {
			if (set[i] != 0) {
				System.out.println(set[i]);
			}
		}
		
	}

	static void q4()
	{		
	    // part (a)
		String college = new String ("Anytown, USA");

	    int stringLength;
	    String change1, change2, change3; 	    
	    
	    // part (b)
	    stringLength = college.length();
	    System.out.println (college + " contains " + stringLength + " characters.");
	    
	    //part (c)
	    change1 = college.toUpperCase();    
	    System.out.println(change1);
	    
	    //part (d)
	    change2 = college.toUpperCase();
	    change2 = college.replace('o', '*'); 		
	    System.out.println(change2);

	    //part (e)
	    change3 = college.concat(" College and Town.");
	    System.out.println ("The final string is " + change3);
	}

	static void q5()
	{
		System.out.println("Please enter R(ock), S(cissor) or P(aper)");		
		Scanner scan = new Scanner(System.in);		
		
		String personPlay;
		
		String computerPlay;
		int computerInt; //Randomly generate number used to determine computer's play
		
	//Get player's play -- note that this is stored as a string
		String rock = "r";
		String paper = "p";
		String scissors = "s";
		personPlay = scan.next();

		if (personPlay.equalsIgnoreCase(rock)) {
			System.out.println("You chose " + rock);
		}
		else if (personPlay.equalsIgnoreCase(paper)) {
			System.out.println("You chose " + paper);
		}
		else if (personPlay.equalsIgnoreCase(scissors)) {
			System.out.println("You chose " + scissors);
		}
		else {
			System.out.println("Next time please input single letters. (r)ock, (p)aper or (s)cissors.");
		}

	//Make player's play uppercase for ease of comparison
	//Converts the players input to upper case to allow flexibility 
		String upCase = " ";

		upCase = personPlay;
		upCase = personPlay.toUpperCase();
	//Generate computer's play (0,1,2)
		Random rnd = new Random();
		int rNum = rnd.nextInt(3);
		String cCase = " ";
	//Translate computer's randomly generated play to string
		if (rNum == 0) {
			computerPlay = rock.toUpperCase();
			cCase = computerPlay;
			System.out.println("Computer chose " + rock);
		}
		else if (rNum == 1) {
			computerPlay = paper.toUpperCase();
			cCase = computerPlay;
			System.out.println("Computer chose " + paper);
		}
		else if (rNum == 2) {
			computerPlay = scissors.toUpperCase();
			cCase = computerPlay;
			System.out.println("Computer chose " + scissors);
		}

	//Compares the players choice with computers choice
		if (upCase.equals("R") && cCase.equals("R")) {
			System.out.println("Rock vs Rock. TIE!");
		}
		else if (upCase.equals("R") && cCase.equals("P")) {
			System.out.println("Rock vs Paper. YOU LOSE!");
		}
		else if (upCase.equals("R") && cCase.equals("S")) {
			System.out.println("Rock vs Scissors. YOU WIN!");
		}
		else if (upCase.equals("P") && cCase.equals("R")) {
			System.out.println("Paper vs Rock. YOU WIN");
		}
		else if (upCase.equals("P") && cCase.equals("P")) {
			System.out.println("Paper vs Paper. TIE!");
		}
		else if (upCase.equals("P") && cCase.equals("S")) {
			System.out.println("Paper vs Scissors. YOU LOSE!");
		}
		else if (upCase.equals("S") && cCase.equals("R")) {
			System.out.println("Scissors vs Rock. YOU LOSE!");
		}
		else if (upCase.equals("S") && cCase.equals("P")) {
			System.out.println("Scissors vs Paper. YOU WIN!");
		}
		else if (upCase.equals("S") && cCase.equals("S")) {
			System.out.println("Scissors vs Scissors. TIE!");
		}
		System.out.println("Exiting....");
		
	}	
	
}