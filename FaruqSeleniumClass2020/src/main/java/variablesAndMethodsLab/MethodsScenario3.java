package variablesAndMethodsLab;
//Scenario 3. Create an instance method and call it from a static  method .


public class MethodsScenario3 {
	
public void instanceMethod() {
	System.out.println("I am the instance method");
}

public static void staticMethod() {
	MethodsScenario3 obj = new MethodsScenario3();
	obj.instanceMethod();
}

	public static void main(String[] args) {
		
		MethodsScenario3.staticMethod();
	}

}
