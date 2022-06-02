import java.util.Date;

 abstract public class B3_GeometricObject implements Comparable<B3_GeometricObject>{
	private String color = "while";
	private boolean filled = false;
	private Date dateCreated;
	
	public B3_GeometricObject() {
		super();
	}
	
	public B3_GeometricObject(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		String desCribe = null;
		if(filled == false) {
			desCribe = String.format("Geometric is not colored ");
		}
		else {
		desCribe = String.format("Geometric is  %s", color);}
		return desCribe;
	
	}
	public static double sumArea(B3_GeometricObject[] a) {
		double sumArea = 0;
		for(int i=0 ; i < a.length ; i++) {
			sumArea += a[i].getArea();
		}
		return sumArea;
		}
	
	
	abstract double getArea();
	abstract double getPerimeter();
	
	public int compareTo(B3_GeometricObject geometricObject) {
        return this.getArea() == geometricObject.getArea() ? 0 :
                this.getArea() > geometricObject.getArea() ? 1: -1;
    }

    // Get object has max area
    public static B3_GeometricObject max(B3_GeometricObject o1, B3_GeometricObject o2) {
        if (o1.compareTo(o2) > 0)
            return o1;
        return o2;
    }
	}
