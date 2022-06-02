import java.util.Random;

public class B2_Test {
	public static void main(String[] args) {
        Random rd = new Random();
        Circle[] c = new Circle[6];
        for (int i = 0; i < c.length; i++) {
            // Random radius of circle in range [0.0, 20.0]
            c[i] = new Circle(rd.nextDouble() * 20);
        }

        System.out.println("Before sort: ");
        for (int i = 0; i < c.length; i++) {
            String st = String.format("Circle %d , radius: %f",i+1,c[i].getRadius());
            System.out.println(st);
        }
        System.out.println("\nAfter sort by radius: ");

        B2_SortCircles sc = new B2_SortCircles(c);
        sc.sortCircles();
        sc.printCircleArray();
		
	}
}
