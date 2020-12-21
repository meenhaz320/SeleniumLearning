package variablesAndMethodsLab;
public class VariablesScenario3 {
	
//Scenario 3: Create two instance variables with different data types and use  their value in static and instance  methods.

	int age = 5;
	String name = "Meenhaz";
	
	public void instancemethod() {
	System.out.println("My name is "+name+" and my age is "+age);	
	}
	
	
	
	
	public static void main(String[] args) {
	
	VariablesScenario3 obj = new VariablesScenario3();
	obj.instancemethod();
	//My name is Meenhaz and my age is 5
	
	System.out.println("My name is "+name+" and my age is "_age);
	
	


	
	}

}
