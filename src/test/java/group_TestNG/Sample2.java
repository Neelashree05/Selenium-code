package group_TestNG;

import org.testng.annotations.Test;

public class Sample2 {
	
	@Test(groups="smoke")
	public void demo4()
	{
		System.out.println("hi demo4");
	}
	
	@Test
	public void demo5()
	{
		System.out.println("hi demo5");
	}
	
	@Test(groups="smoke")
	public void demo6()
	{
		System.out.println("hi demo6");
	}

}
