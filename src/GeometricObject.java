import java.util.Date;

public class GeometricObject implements Comparable<GeometricObject>{
	private String color = "while";
	private boolean filled = false;
	private Date dateCreated;
	/**
	 * 
	 */
	public GeometricObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param color
	 * @param filled
	 */
	public GeometricObject(String color, boolean filled) {
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
	public static double sumArea(GeometricObject[] a) {
		double sumArea = 0;
		for(int i=0 ; i < a.length ; i++) {
			sumArea += a[i].getArea();
		}
		return sumArea;
		}
	
	public double getArea() {
		return 0;
	}

	@Override
	public int compareTo(GeometricObject o) {
		return this.getArea() == o.getArea() ? 0 :
            this.getArea() > o.getArea() ? 1: -1;
	}
	
	}
