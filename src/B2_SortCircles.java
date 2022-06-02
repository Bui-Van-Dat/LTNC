import java.util.Arrays;

public class B2_SortCircles {
	private Circle[] c;

	/**
	 * 
	 */
	public B2_SortCircles() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @param c
	 */
	public B2_SortCircles(Circle[] c) {
		super();
		this.c = c;
	}



	public Circle[] getC() {
		return c;
	}

	public void setC(Circle[] c) {
		this.c = c;
	}
	
	public void sortCircles() {
		 Arrays.sort(c);
}
	public void printCircleArray() {
		for(int i = 0 ; i<this.c.length ; i++) {
			System.out.println(String.format("Circle %d ", i+1) + c[i].toString());
		}
	}
}
