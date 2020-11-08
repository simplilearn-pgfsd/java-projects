package simplilearn.model;

public class CEO implements Role{

	@Override
	public String getRoleName() {
		
		return "CEO";
	}

	@Override
	public String getResponsibility() {
		
		return "manages a company";
	}

}
