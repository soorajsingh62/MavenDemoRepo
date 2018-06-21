package MavenDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass2 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass -this will be executed only once before each class - TestNGClass2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod - this will be executed before every test - TestNGClass2");
	}
	
	@Test()
	public void test1() {
		System.out.println("Test - inside test1 of TestNGClass2.java");
	}

	@Test()
	public void test2() {
		System.out.println("Test - inside test2 of TestNGClass2.java");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method - this will be executed after every test - TestNGClass2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass -this will be executed only once after each class - TestNGClass2");
	}

}
