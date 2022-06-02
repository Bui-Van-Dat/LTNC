
public class Rectangle extends GeometricObject{
	private double width;
	private double  height;

	public Rectangle() {
		super();
	}
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		double area = this.height*this.width;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 2*(this.height + this.width);
		return perimeter;
	}

	public String toString() {
		String str = String.format("My rectangle have height = %f ; width = %f .", height,width) + super.toString();
		return str;
	}
}
