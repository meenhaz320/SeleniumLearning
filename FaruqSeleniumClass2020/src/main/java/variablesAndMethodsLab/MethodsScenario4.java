package variablesAndMethodsLab;

//Scenario 4. Create three instance methods 
//call the second and third method  from the first method .


public class MethodsScenario4 {
	
public void method1() {
	method2();
	method3();
}

public void method2() {
	System.out.println("method 2");
}

public void method3() {
	System.out.println("method 3");
}

	public static void main(String[] args) {
	
	MethodsScenario4 obj = new MethodsScenario4();
	
	obj.method1();

	}

}
