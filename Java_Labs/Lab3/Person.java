public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person (String newFirstName, String newLastName, int newAge)
	{
	    firstName = newFirstName;
	    lastName = newLastName;
	    age = newAge;
	}
	   
	public String getFirstName() {
	    return firstName;
	}
	   
	public String getLastName(){
	    return lastName;
	}
	   
	public int getAge() {
	    return age;
	}
	   
	   //Override equals function here
	public boolean equals(Person p2) {
		if ((this.getFirstName() == p2.getFirstName()) 
			&& (this.getLastName() == p2.getLastName()) 
			&& (this.getAge() == p2.getAge())) {

			return true;			
		}
		else {
			return false;
		}
	}
	   
}