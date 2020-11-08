package simplilearn;

public class ThreadedSend extends Thread{
	
	//define instance variable's
	private String message;
	private Thread thread;
	private Sender sender;
	
	//define a constructor
	public ThreadedSend(String message,Sender sender) {
		this.message=message;
		this.sender=sender;	
	}

	// define the run method
	public void run() {
		synchronized (sender) {
			sender.send(message);
		}
		
	}
}
