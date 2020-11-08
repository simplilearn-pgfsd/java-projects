package simplilearn;

public class Program {

	public static void main(String[] args) {
		
		//shared object between s1 & s2
		Sender sender = new Sender();
		
		ThreadedSend s1 = new ThreadedSend("Hi", sender);
		ThreadedSend s2 = new ThreadedSend("Bye", sender);
		s1.start();
		
		try {
			s1.join();
		} catch (InterruptedException e1) {
			System.out.println("Interrupted");
		}
		s2.start();
		
		
		try {
			//s1.join();// wait for other thread's to complete there task
			s2.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		} 
		

	}

}
