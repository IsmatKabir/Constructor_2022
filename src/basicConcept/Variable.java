package basicConcept;

import basic.LearnVariable;

public class Variable {

	// Variable: is a container which can hold value
	// vary able: value will change based on its need
	// What is variable?
	
	// Create a variable
	// DataType varaibleName = varaibleValue;
	String student= "Aunonto";
	public String address= "Queens,Ny";
	
	// String is a Data type
		// student is a variable name
		// = is Assignment operator
		// "Aunonto" is a string value which is a string type of data
		
	String name;
	// declare a variable without value
	//String student= "Aunonto";
	//delare variable with assigning value
	
	int age=24; // global instance variable
	static int salary=5000; // global static variable
	// Global variable/ global scope/ class variable
	// Any variable you created inside of a class but outside of a method is called class level variable
	public static void main(String[] args) {
		
	
	Variable vrl=new Variable();
	
	
	// Any variable you created inside of a method is called local variable
	// static global variable is called by class name
			System.out.println(vrl.age);
	System.out.println(Variable.salary);
	Variable.salary=6666; // ReAssign value
	System.out.println(Variable.salary);
	Variable.salary=7777; // ReAssign value
	System.out.println(Variable.salary);
	// we can create different object and reassign the value
	Variable vr= new Variable();
	vr.age=25;
	System.out.println(vr.age);// reassign value of age
	// we are calling variable from Static class
	
	Static st=new Static();
	System.out.println(st.name);
	// calling from casting class
	Casting cast= new Casting ();
	System.out.println(cast.height);
	// Re-assigning the height value
	cast.height = 400;
	System.out.println(cast.height);
	
	}
	
	
	
	
}
