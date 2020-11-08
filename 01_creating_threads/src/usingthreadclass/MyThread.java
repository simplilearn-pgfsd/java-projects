package usingthreadclass;

// extends the java.lang.Thread
public class MyThread  extends Thread{

	//define a run() method
	public void run() {
		System.out.println("concurrent thread started running ....");
	}
	
	public static void main(String[] args) {
		//create an object of MyThread
		MyThread object = new MyThread();
		
		// invoke a start method present in java.lang.Thread class
		object.start();
	}
}
