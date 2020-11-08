package simplilearn;

import simplilearn.threads.Consumer;
import simplilearn.threads.Producer;

public class SyncTest {

	public static void main(String[] args) {
		//create a shared object (SyncStack)
		SyncStack stack = new SyncStack();
		
		Producer producer = new Producer(stack);
		Consumer consumer = new Consumer(stack);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		
		t2.start();
		t1.start();

	}

}
