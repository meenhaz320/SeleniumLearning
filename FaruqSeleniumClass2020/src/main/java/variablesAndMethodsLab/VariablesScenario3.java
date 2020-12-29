package variablesAndMethodsLab;
public class VariablesScenario3 {
	
//Scenario 3: Create two instance variables with different data types
//use  their value in static and instance  methods.

	int age;
	String name;
	
	
	public void instancemethod() {
	age = 2;
	name = "Meenhaz";
	System.out.println("My name is "+name+" and my age is "+age);	
	}
	
	public static void staticmethod() {
	VariablesScenario3 obj = new VariablesScenario3();
	obj.age = 78;
	obj.name = "Donald Trump";
	System.out.println("My name is "+obj.name +" and my age is "+ obj.age + " years old.");
	}
		
	
	public static void main(String[] args) {
	
	VariablesScenario3 obj = new VariablesScenario3();
	
	obj.instancemethod();    //using instance variables in instance method
	obj.staticmethod();		//using instance variables in static method

	


	
	}

}
