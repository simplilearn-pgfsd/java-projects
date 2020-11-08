package usingrunnableinterface;

// Implements java.lang.Runnable
public class MyRunnableThread implements Runnable {
	public static int counter = 0;

	public void run() {
		while (MyRunnableThread.counter <= 10) {

			try {
				System.out.println("Expl Thread :" + (++MyRunnableThread.counter));
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				System.out.println("Exception in thread : " + e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("starting main thread ----->");
		//create an target of MyRunnableThread
		MyRunnableThread target = new MyRunnableThread();
		//create an object(t) of Thread
		Thread t = new Thread(target);
		t.start();
		
		while (MyRunnableThread.counter <= 10) {

			try {
				System.out.println("Main Thread :" + (++MyRunnableThread.counter));
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				System.out.println("Exception in main thread : " + e.getMessage());
			}
		}
		
		System.out.println("End of main thread --->");
	}

}
