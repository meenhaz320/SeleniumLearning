package variablesAndMethodsLab;
//Scenario 4: Create two static variables with different data types
//use their value in a static method and in an instance method.

public class VariablesScenario4 {

static int wheels;
static String color;

public void instanceMethod() {
wheels = 3;
color = "Red";

System.out.println("Rickshaw has "+wheels+" wheels and the color is +color");

}

public static void staticMethod() {
wheels = 4;
color = "Blue";

System.out.println("Toyota corolla has "+wheels+ " wheels and the color is "+color);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesScenario4 obj = new VariablesScenario4();
		obj.staticMethod();
		obj.instanceMethod();
		
		
	}

}
