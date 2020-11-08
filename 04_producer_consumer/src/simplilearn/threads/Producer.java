package simplilearn.threads;

import simplilearn.SyncStack;

public class Producer implements Runnable{
	
	private SyncStack theStack;
	private int num;
	private static int counter = 1;
	
	
	public Producer(SyncStack theStack) {
		this.theStack = theStack;
		num = counter ++;
	}

	@Override
	public void run() {
		char c;
		
		for (int i = 0; i < 200; i++) {
			c = (char) (Math.random() * 26 +'A');
			theStack.push(c);
			
			System.out.println("Producer " + num + ": " +c);
			
			try {
//				System.out.println("Producer Sleep --- >");
				Thread.sleep((int)(Math.random() * 300));
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
		
	}

}
