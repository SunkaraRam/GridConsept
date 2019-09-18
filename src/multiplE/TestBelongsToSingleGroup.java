package multiplE;

import org.testng.annotations.Test;

public class TestBelongsToSingleGroup {
	
	@Test(groups= {"exclude-group"})
	public void method1() {
		
		System.out.println("This is Sanity and Regression Testing1");
		
	}
	
	@Test(groups = {"include-group"})
	public void method2() {
		
		System.out.println("This is Regressin Testing");
		
			
		}
	@Test(groups = {"include-group"},enabled = false)
	public void method3() {
		
		System.out.println("This is Sanity Testing3");
		
	}
	@Test
	public void method4(){
		
		System.out.println("This is Not Sanity Testing");
		
	}
	
}


