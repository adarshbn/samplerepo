package inheritance;

public class MultiLevelChild extends MultiLevelParent{

	public void display()
	{
		System.out.println("Multi level child");
	}
	
	public static void main(String[] args) {
		
		MultiLevelChild obj = new MultiLevelChild();
		obj.show();
		obj.display();
		obj.sum();

	}

}
