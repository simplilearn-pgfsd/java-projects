package simplilearn;

public class Sender {
	
	public void send(String message) {
		System.out.println("sending \t" + message);
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
		
		System.out.println("\n" +message + "Sent.");
	}

}
