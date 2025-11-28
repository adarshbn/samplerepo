package accessmodifier;

public class AccessOne {
	
	public void display()
	{
		System.out.println("Public");
	}
	
	private void display2()
	{
		System.out.println("Private");
	}
	
	protected void display3()
	{
		System.out.println("Protected");
	}
	
	void display4()
	{
		System.out.println("Default");
	}

	public static void main(String[] args) {

		AccessOne obj = new AccessOne();
		obj.display();
		obj.display2();
		obj.display3();
		obj.display4();

	}

}
