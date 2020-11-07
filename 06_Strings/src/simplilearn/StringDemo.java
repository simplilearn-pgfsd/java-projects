package simplilearn;import javax.management.relation.Relation;

public class StringDemo {

	public static void main(String[] args) {
		// methods in String
		String s = new  String("Hello World!");
		System.out.println("length " + s.length());
		
		String sub = new String("Welcome");
		System.out.println(sub.substring(2));
		
		String s1 = "Hello";
		String s2 ="Helddo";
		System.out.println(s1.compareTo(s2));
		
		String s3 = "";
		System.out.println(s3.isEmpty());
		
		String s4 = "HELLO";
		System.out.println(s4.toLowerCase());
		
		String replace = s2.replace('d', 'l');
		System.out.println(replace);
		
		String x = "welcome";
		String y = "welcome";
		System.out.println(x.equals(y));
		
		
		// creating StringBuffer
		StringBuffer sb = new StringBuffer("welcome to java!");
		sb.append("Enjoy your learning");
		System.out.println(sb);
	
		
		sb.insert(0, 'W');
		System.out.println(sb);
		// work on replace 
		sb.delete(0, 1);
		System.out.println(sb);
		
		StringBuilder build = new StringBuilder("happy");
		build.append("learning");
		System.out.println(build);
		System.out.println(build.reverse());
		

	}

}
