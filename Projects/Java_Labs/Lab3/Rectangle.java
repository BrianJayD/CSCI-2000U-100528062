public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		shapeName = "Rectangle";
		if ((width != 0) && (length != 0)) {
			this.width = width;
			this.length = length;
		}
		else {
			System.out.println("Cannot have a length or width of 0!");
		}
	}

	public String getName() {
		return shapeName;
	}

	public double getArea() {
		return width * length;
	}
}