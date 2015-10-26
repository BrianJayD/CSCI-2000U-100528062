public class Square extends Shape {
	private double side;

	public Square(double side) {
		shapeName = "Square";
		if (side != 0) {
			this.side = side;
		}
		else {
			System.out.println("Side cannot have a length of 0!");
		}
	}

	public String getName() {
		return shapeName;
	}

	public double getArea() {
		return side * side;
	}
}