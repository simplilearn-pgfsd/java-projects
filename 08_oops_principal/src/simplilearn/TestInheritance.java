package simplilearn;

public class TestInheritance {

	public static void main(String[] args) {
		MountainBike mb= new MountainBike(3, 100, 25);
		System.out.println(mb.toString());
		
		System.out.println("Increase a speed for 30");
		mb.speedUp(30);
		System.out.println(mb.toString());
	}

}
