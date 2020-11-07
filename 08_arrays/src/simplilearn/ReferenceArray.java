package simplilearn;

public class ReferenceArray {

	Point[] createArray() {
		//declare an array of Point identifier
		Point[] points;
		//construct an Point array
		points = new Point[10];
		//initialize the array
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point(i,i +1 );
		}
		return points;
	}

	public static void main(String[] args) {
		ReferenceArray instance = new ReferenceArray();
		Point[] mypoints = instance.createArray();
		instance.displayElements(mypoints);
	}

	private void displayElements(Point[] mypoints) {
		for (Point point : mypoints) {
			point.display();
		}
		
	}
}
