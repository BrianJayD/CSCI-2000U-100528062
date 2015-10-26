import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;
import java.lang.*; 


public class questions {
	
	void q1()
	{
		int[] counts = new int[26];
		Scanner scan = new Scanner(System.in);
		
		//get word from user
		System.out.print("Enter a single word(letters only, please)");
		String word = scan.nextLine();
		
		//convert to all upper case
		word = word.toUpperCase();
		
		//count frequency of each letter in string
		try {
			for(int i=0; i < word.length(); i++)
			{
				counts[word.charAt(i) - 'A']++;
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Unexpected character found!");
		}
		
		//print frequencies
		System.out.println();
		for(int i=0; i < counts.length; i++)
		{
			if(counts[i] != 0)
			{
				System.out.println((char)(i+'A')+":" + counts[i]);
			}
		}
	}

	void q2()
	{
		int creditHrs;  // number of semester hours earned
		double qualityPts; // number of quality points earned
		double gpa; // grade point (quality point) average
		
		String sName;
		
		try
		{
			BufferedReader buffRead = new BufferedReader(new FileReader("students.txt"));
			String line = buffRead.readLine();
			PrintWriter printWrite = new PrintWriter("warning.txt");
			printWrite.println("Students on Academic Warning");
			
			//Process the input file, one token at a time
			while(line != null)
			{
				// Get the credit hours and quality points and
	            // determine if the student is on warning. If so,
	            // write the student data to the output file.
				StringTokenizer sToken = new StringTokenizer(line);
				sName = sToken.nextToken();
				creditHrs = Integer.parseInt(sToken.nextToken());
				qualityPts = Double.parseDouble(sToken.nextToken());

				gpa = qualityPts / creditHrs;

				if (creditHrs < 30 && gpa < 1.5) {
					printWrite.println(sName);
				}
				else if (creditHrs < 60 && gpa < 1.75) {
					printWrite.println(sName);
				}
				else if (gpa < 2.0 && creditHrs >= 60) {
					printWrite.println(sName);
				}

				line = buffRead.readLine();
				
			}
			buffRead.close();
			printWrite.close();
			
		}
		catch (Exception e) {
			System.out.println();
		}
	}
	
	void q3()
	{
		/*
		Node node0 = new Node(0, "value0");
		Node node1 = new Node(1, "value1");
		Node node2 = new Node(2, "value2");
		Node node3 = new Node(3, "value3");
		Node node4 = new Node(4, "value4");
		Node node5 = new Node(5, "value5");
		Node node6 = new Node(6, "value6");
		
		DoubleLinkedList dll = new DoubleLinkedList(node0);
		dll.insert(node1, 1);
		dll.insert(node2, 2);
		dll.insert(node3, 3);
		dll.insert(node4, 4);
		dll.insert(node5, 5);
		dll.insert(node6, 6);
		
		DoubleLinkedListIterator it = new DoubleLinkedListIterator(dll);
		while(it.hasNext())
		{
			System.out.println(it.getTuple());
		}
		
		//-------------Delete a element from linklist
		*/

	}
}