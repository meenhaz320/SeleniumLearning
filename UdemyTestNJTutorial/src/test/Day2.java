package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {

@Test (groups= {"Smoke"})
public void Hello() {
	System.out.println("Hola");
}

@Test(dataProvider="getData")
public void Bye(String username, String password) {
	System.out.println("Adios");
	System.out.println(username);
	System.out.println(password);
}

@BeforeTest
public void beforeTest() {
	System.out.println("I will execute before the test");
}

@DataProvider
public Object[][] getData() {
Object[][] data = new Object[3][2];
		
data[0][0]="username1";
data[0][1]="password1";
data[1][0]="username2";
data[1][1]="password2";
data[2][0]="username3";
data[2][1]="password3";

return data;

}



}
