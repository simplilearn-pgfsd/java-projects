package simplilearn.threads;

import simplilearn.SyncStack;

public class Consumer implements Runnable{
	
	private SyncStack theStack;
	private int num;
	private static int counter = 1;
	
	
	public Consumer(SyncStack theStack) {
		this.theStack = theStack;
		num = counter ++;
	}

	@Override
	public void run() {
		char c;
		
		for (int i = 0; i < 200; i++) {
			c =  theStack.pop();
			System.out.println("Consumer " + num + ": " +c);
			
			try {
//				System.out.println("Consumer Sleep --- >");
				Thread.sleep((int)(Math.random() * 300));
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
		
	}

}
