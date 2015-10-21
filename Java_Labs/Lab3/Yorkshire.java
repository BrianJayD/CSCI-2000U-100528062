public class Yorkshire extends Dog{
	private static int breedWeight = 20;

	public Yorkshire(String name){
		super(name);
	}

	public int avgBreedWeight() {
		return breedWeight;
	}
	
	//Small bark -- override speak method in Dog
	public String speak(){
		return "woof";
	}
	
}