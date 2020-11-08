package simplilearn;

public class MountainBike  extends Bicycle{
	
	public int seatHeight;
	
	public MountainBike(int gear,int speed,int seatHeight) {
		// invoke a constructor in super class (Bicycle)
		super(gear,speed);
		this.seatHeight = seatHeight;
	}
	
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\n Seat Height Is " + seatHeight;
	}

}
