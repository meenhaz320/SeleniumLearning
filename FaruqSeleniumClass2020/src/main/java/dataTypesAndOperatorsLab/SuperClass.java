package dataTypesAndOperatorsLab;

//create a class for this argument
// super class can handle smaller class but smaller cannot handle super

public class SuperClass {

	public static void main(String[] args) {
		
		byte age=20;
		int age1=20;
		
		int age3= age+age1;
		//can't be byte age3
		
		int a =30;
		long b=30;
		long c=a+b;
		//long is bigger than int
		
		System.out.println(age3);
		System.out.println(c);

	}

}
