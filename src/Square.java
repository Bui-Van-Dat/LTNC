
public class Square extends GeometricObject{
	private double side;

	public Square() {
		super();
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		double area = Math.pow(this.side,2);
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 4*this.side;
		return perimeter;
	}

	public String toString() {
		String str = String.format("My Square have side = %f .", this.side) + super.toString();
		return str;
	}
}
