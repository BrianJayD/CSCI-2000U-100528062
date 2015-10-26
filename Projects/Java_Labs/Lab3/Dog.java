abstract class Dog {
	protected String name;
	protected int breedWeight;
	
	public Dog(String name) {
		this.name = name;
	}
	
	//Return Dog's name
	public String getName() {
		return name;		
	}

	abstract public int avgBreedWeight();
	
	//Return a string with dog's comments
	public String speak() {
		return "Woof";
	}		
}