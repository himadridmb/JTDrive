package callback;

public class Student implements CallBack{

	private String name;
	public Student(String name)
	{
		this.setName(name);
	}
	
	
	@Override
	public void callBack() {
		System.out.println("Callback executed for "+this.getName());
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
