package variablesAndMethodsLab;
//Scenario 1: Create an instance method and a static method in a class and call them from the main method.

public class MethodsScenario1 {
	
public void instanceMethod() {
	System.out.println("I am the instance method");
}

public static void staticMethod() {
	System.out.println("I am the static method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MethodsScenario1 obj = new MethodsScenario1();
	obj.instanceMethod();
	MethodsScenario1.staticMethod();
	}

}
