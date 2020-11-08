package simplilearn;

//demonstrate the uses of inheritance
public class Bicycle  extends java.lang.Object{

		public int gear;
		public int speed;
		public Bicycle(int gear, int speed) {
			//implicit super();
			this.gear = gear;
			this.speed = speed;
		}
		
		public void applyBrake(int decrement) {
			speed -= decrement;
		}
		
		public void speedUp(int increment) {
			speed += increment;
		}
		
		@Override
		public String toString() {
			return ("No of gears are " + gear + "\n" + "Speed of bicycle is" +speed);
		}
}
