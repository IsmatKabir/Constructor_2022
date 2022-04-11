package basicConcept;

public class Static {
// static is a keyword
	
// if we use static keyword then you can call variable , method by its class name
		
// static it self a type
//create only one instance

	          static    int age= 15;
	
	            String name="Aunonto";
	            
	  public static void main(String[] args) {
		Static st=new Static();
		  
		 System.out.println(Static.age); 
		 System.out.println(st.name); 
		 Static.learning(); 
		 st.reading(); 
		  
		  
	}          
	            
	            
	            
	
	public static void learning() {
	System.out.println("we are learning java");	
		
		
	}
		
	public void reading() {
	System.out.println("we are reading");	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
