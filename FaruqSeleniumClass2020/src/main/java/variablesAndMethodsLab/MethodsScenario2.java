package variablesAndMethodsLab;
//Scenario 2. Create a static method and call it from an instance method .


public class MethodsScenario2 {
	
	public void instanceMethod() {
	MethodsScenario2 obj = new MethodsScenario2();
	
	obj.staticMethod();	
	}

	public static void staticMethod() {
		System.out.println("I am the static method");
	}

	public static void main(String[] args) {
	MethodsScenario2 obj = new MethodsScenario2();
	obj.instanceMethod();

	}

}
