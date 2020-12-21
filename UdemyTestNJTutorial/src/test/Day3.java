package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

@Parameters({"URL","Username"})
@Test 
public void WebloginCarLoan(String website, String name) {
	System.out.println("weblogincar");
	System.out.println("The URL for Car is "+website);
	System.out.println("The website for car is "+name);
}

@Test (groups= {"Toke"})
public void MobileLogincarLoan() {
	System.out.println("Mobilelogincar");
}

@Test(dependsOnMethods = {"WebloginCarLoan"})
public void MobileLoginAPIcarLoan() {
	System.out.println("APICarlogin");
}
	
@BeforeSuite
public void firstever() {
	System.out.println("I'll execute before the suite");
}

@BeforeMethod
public void betweenCar() {
	System.out.println("I am between cars");
}
}




