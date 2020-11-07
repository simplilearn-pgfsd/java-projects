package simplilearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {

	public static void main(String[] args) {
		String regex = "[a-z]+";
		
		String check = "Regular Expressions";
		
		Pattern p = Pattern.compile(regex);
		Matcher c = p.matcher(check);
		
		while(c.find()) {
			System.out.println(check.substring(c.start(),c.end()));
		}
	}

}
