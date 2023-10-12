package testNG;

import org.testng.annotations.Test;

public class Priority_invocation_enabled {
//add testNG Library
//then import
	@Test(priority=2)

	public void demo1() {
		
		System.out.println("hi demo1");
    }
	@Test(priority=4)
	public void demo2()
	{
		System.out.println("hi demo2");
	}
	@Test(priority=-8,invocationCount=2,enabled=false)
	public void demo3()
	{
		System.out.println("hi demo3");
	}
}
