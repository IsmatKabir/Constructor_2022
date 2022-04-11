package basicConcept;

public class AccessModifier {

	// Access Modifier: before variable and before method and before class
	
	
	// Public : No Restrictions : Have the access from any package
	// Private : Full Restrictions : Have the access from same class only
	// Protected: have the access in same package only.
	// Default: same behavior like protected
	
	
	
	public String name="Ismat";

	private String bankAccountNumber= "123456";// only inside the same class
	 protected String employeeId="1002";//same package
	  String address ="Queens,Ny"; // default
	
	public static void main(String[] args) {
		
		//create object
		AccessModifier acm=new AccessModifier();
		System.out.println(acm.name);
		System.out.println(acm.bankAccountNumber);
		System.out.println(acm.employeeId);
	System.out.println(acm.address);
	
	}
	
	
	
	
	
	
}
