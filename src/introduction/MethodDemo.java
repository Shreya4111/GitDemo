package introduction;

public class MethodDemo {
	public static void main(String[] args)
	{
		MethodDemo d = new MethodDemo();
		d.GetData();
		DemoMethod2 d1= new DemoMethod2();
		d1.Method2();
		GetData2();
		
		
	}
	public void GetData()
	{
		System.out.println("get the data of shreya");
	}
	// if we are mentioning the method with the static key word it is having the access to the class level
	//no need to create the object we can directly access the static method.
	//sometine people will use the static if the method is present in the same class because o need to create the object 
	public static void GetData2()
	{
		System.out.println("get the details of the family members ");
	}

}
