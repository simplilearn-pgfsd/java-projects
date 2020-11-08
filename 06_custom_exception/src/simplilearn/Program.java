package simplilearn;

import simplilearn.exceptions.CustomException;
import simplilearn.model.Employee;

public class Program {

	public static void main(String[] args) {
		Employee employee = new Employee("Tom");
		System.out.println(employee.getTitle());
		
		employee.promoteToManager();
		
		try {
			employee.promoteToCEO();
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}finally {
			System.out.println(employee.getTitle());
		}

	}

}
