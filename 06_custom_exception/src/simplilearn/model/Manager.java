package simplilearn.model;

public class Manager implements Role {

	@Override
	public String getRoleName() {
		
		return "Manager";
	}

	@Override
	public String getResponsibility() {
		
		return "manages a department";
	}

}
