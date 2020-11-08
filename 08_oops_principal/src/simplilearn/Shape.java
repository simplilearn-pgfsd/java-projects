package simplilearn;

public abstract class Shape {

	private String color;
	
	public abstract double area();

	public Shape(String color) {
		super();
		System.out.println("shape constructor called.");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
}

class Circle extends Shape {
	double radius;

	public Circle(String color,double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public String toString() {
		return "Circle Color Is :  " + super.getColor() + " and are is :" +area();
	}
	
	
}