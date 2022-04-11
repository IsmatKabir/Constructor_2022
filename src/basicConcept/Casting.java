package basicConcept;

public class Casting {

	static int age=24;
	int height=300;
	byte length= 127;
	float tax=.3f;
	double salary=5000.50;
	int newSalary= (int)salary;
	public static void main(String[] args) {
		
	Casting cast=new Casting();	
		
	double age1=  Casting.age;
	System.out.println(age1);	
	System.out.println(cast.newSalary);
	
	
	double stax=(double)cast.tax;
	System.out.println(stax);
	float newSalary=(float)cast.salary;
	System.out.println(newSalary);
	byte height1=(byte)cast.height;
	System.out.println(height1);
	int length1=(int)cast.length;
	System.out.println(length1);
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
