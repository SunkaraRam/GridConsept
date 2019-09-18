package multiplE;

import org.testng.annotations.Test;

public class GroupToMulGroup {


		@Test (groups= {"sanity-testing"}, enabled = false)
		public void method1(){
			
			System.out.println("This is Sanity1");
			
		}
		
		@Test(groups = {"regression-testing"})
		public void method2() {
			
			System.out.println("This is Regressin Testing1");
			
				
			}
		@Test(groups = {"sanity-testing"})
		public void method3() {
			
			System.out.println("This is Sanity Testing2");
			
		}
		@Test(groups = {"regression-testing"})
		public void method4(){
			
			System.out.println("This is Regression Testing2");
			
		}
		
		@Test(groups = {"sanity-testing"})
		public void method5() {
			
			System.out.println("This is Sanity Testing3");
			
		}
		
		@Test(groups = {"regression-testing"}, enabled=false)
		public void method6() {
			
			System.out.println("This is reggression Testing3");
			
		}
		
		
	}


