package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day1 {


@Parameters({"URL","Username"})
@Test (groups= {"Smoke"})
public void sample1(String website,String user) {
	System.out.println("Hello");
	System.out.println("The URL for Personal loan is " +website);
	System.out.println("The username for Personal loan is " + user);
	

}

@AfterTest
public void aftertest() {
	System.out.println("I will execute after the test");
}

}
