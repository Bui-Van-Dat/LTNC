
public class B3_Test {
	public static void main(String[] args) {
		B3_GeometricObject c1 = new B3_Circle(10,"blue",true);
        B3_GeometricObject c2 = new B3_Circle(9,"green",true);

       B3_Circle circleMax = (B3_Circle) B3_GeometricObject.max(c1, c2);

        System.out.println("Geometric has area max: ");
        System.out.println(circleMax);
	}
}
