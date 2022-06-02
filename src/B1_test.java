
public class B1_test {
	public static void main(String[] args) {

		//display sum area in array
		GeometricObject[] a = new GeometricObject[3];
		a[0] = new Circle(4,"green",true);
		a[1] = new Rectangle(5,6,"red",true);
		a[2] = new Square(7,"while",false);
		
		GeometricObject test = new GeometricObject();
		System.out.printf("Sum Area of geometric objects in a = %f\n",test.sumArea(a));
		
		//Display information about each geometric in the array
		for(int i=0; i<a.length ;i++) {
			System.out.printf("Geometric %d:\n%s\n",i+1,a[i].toString());
		}
		}
	}
 