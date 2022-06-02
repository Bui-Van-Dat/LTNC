
public class B3_Circle extends B3_GeometricObject{
	private double radius;

	public B3_Circle() {
		super();
	}


	public B3_Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public B3_Circle(double radius) {
		super();
		this.radius = radius;
	}

	public B3_Circle(double d, boolean b) {
		// TODO Auto-generated constructor stub
	}


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	
	public double getDiameter() {
		double diameter = 2*Math.PI;
		return diameter;
	}
	
	public String toString() {
		String str = String.format("Radius = %f ,Area = %f .", radius,this.getArea()) + super.toString();
		return str;
	}
	
	public int compareB3_Circle(B3_Circle a) {
		if(this.radius == a.getRadius()) {
			return 0;
		}
		else if(this.radius < a.getRadius()){
			return -1;
		}
		else {
			return 1;
		}
	}
}