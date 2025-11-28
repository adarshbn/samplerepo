package inheritance;

public class HierarchialChild extends HierarchialParent{
	
	public void display()
	{
		System.out.println("Hierarchial child 1");
	}

	public static void main(String[] args) {

		HierarchialChild obj = new HierarchialChild();
		obj.print();
		obj.display();

	}

}
