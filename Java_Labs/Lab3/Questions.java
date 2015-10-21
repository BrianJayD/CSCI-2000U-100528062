import java.util.Scanner;
import java.util.StringTokenizer; //To Treat the Inputs in q1 as seperate strings

class questions {
	void q1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 9 Intergers seperated by spaces: ");
	    String input = sc.nextLine();
	    StringTokenizer intNums = new StringTokenizer(input);
	    int[] arr = new int[9];
	    int i;

	    for(i = 0; i < 9; i++) {
	        arr[i] = Integer.parseInt((String)intNums.nextElement());
	    }

	    int[][] mat = new int[3][3];

	    i = 0;
	    for(int j = 0; j < 3; j++) {
	    	for(int k=0; k < 3; k++) {
	    		mat[j][k] = arr[i++];
	    	}
	    }
	    
	    System.out.println("Original Matrix:");
	    for (int j = 0; j < 3; j++) {
	    	for (int k = 0; k < 3; k++) {
	    		System.out.print(mat[j][k] + "\t");
	    	}
	    	System.out.println("\t");
	    }

	    System.out.println("Transposed Matrix:");
	    for (int j = 0; j < 3; j++) {
	    	for (int k = 0; k < 3; k++) {
	    		System.out.print(mat[k][j] + "\t");
	    	}
	    	System.out.println("\t");
	    }
	}

	void q2()
	{
		Person p1 = new Person("Tim", "Hortons", 23);
		Person p2 = new Person("Jean", "Hortons", 24);
		Person p3 = new Person("Tim", "Hortons", 23);
		
		System.out.println(p1.equals(p1));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));		
	}
	
	void q3()
	{
		//Dog dog = new Dog("Spike");
		Dog L_dog = new Labrador("Tim", "Yellow");
		Dog Y_dog = new Yorkshire("Joe");
		System.out.println(L_dog.getName() + " says " + L_dog.speak() + ", weight is: " + L_dog.avgBreedWeight());
		System.out.println(Y_dog.getName() + " says " + Y_dog.speak() + ", weight is: " + Y_dog.avgBreedWeight());
	}
	
	void q4()
	{
		//uncomment the following code block, complete it to finish its function
			
		Dog myDog; // Give a correct class to define myDog 
		String ans = "y";
		int choice;
		Scanner scan = new Scanner(System.in);
		while(ans.equalsIgnoreCase("y"))
		{
			System.out.println("Choose a Breed:\n1. Labrador\n2. Yorkshire");
			choice = scan.nextInt();
			
			if(choice == 1)
			{
				System.out.println("I am Labrador, give me a name and color: ");
				String name = scan.next();
				String color = scan.next();
				myDog = new Labrador(name, color); // Select a correct dog class to make a instance 
				System.out.println("Hello, my name is " + name + ", I am a " + color + " Labrador.");
			}
			else
			{
				System.out.println("I am Yorshire, give me a name: ");
				String name = scan.next();
				myDog =	new Yorkshire(name); // Select a correct dog class to make a instance 
				System.out.println("Hello, my name is " + name + ", I am a Yorkshire.");
			}
		}
	}
	
	void q5()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in side for the Square: ");
		double sSide = scan.nextDouble();

		System.out.println("Enter in Width for Rectangle: ");
		double wSide = scan.nextDouble();
		System.out.println("Enter in Length for Rectangle: ");
		double lSide = scan.nextDouble();

		Shape s1 = new Square(sSide);
		Shape r1 = new Rectangle(wSide, lSide);

		Shape shape[] = new Shape[2];
		shape[0] = s1;
		shape[1] = r1;

		System.out.println("Area of " + shape[0].getName() + ": " + shape[0].getArea());
		System.out.println("Area of " + shape[1].getName() + ": " + shape[1].getArea());
	}

}