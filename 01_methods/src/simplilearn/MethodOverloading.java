package simplilearn;

public class MethodOverloading {

	public static void main(String[] args) {
		//Create an instance of MethodOverloading
		MethodOverloading instance = new MethodOverloading();
		// Find an area of circle given radius is 5
		instance.area(5);

		//Find an area of triangle given base = 10, height = 12
		instance.area(10, 12);
	}

	// area of circle
	public void area(double radius) {
		double result = 3.14 * radius * radius;
		System.out.println("Area Of Circle Is : " + result);
		// can i have a return statement here ?
//		return ; implicit return (javac)
 	}
	
	//area of triangle 1/2 * base * height
	public void area(double base,double height) {
		double result = 0.5 * base * height;
		System.out.println("Area of Traingle is :" + result);
	}
	
}
