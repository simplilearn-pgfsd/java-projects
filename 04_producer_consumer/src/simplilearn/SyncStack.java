package simplilearn;

import java.util.ArrayList;
import java.util.List;

public class SyncStack {
	
	private List<Character> buffer = new ArrayList<>(400);

	
	//producer (thread) uses a push behavior
	public synchronized void push(char c) {
		this.notify();
		buffer.add(c);
	}
	
	// consumer (thread) uses a pop behavior
	public synchronized char pop() {
		// local variable
		char c;
		while (buffer.size() == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
		c = buffer.remove(buffer.size()-1);
		return c;
	}
}
