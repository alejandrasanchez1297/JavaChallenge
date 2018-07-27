package AccountWorld;

public class Address {

/**
 * Attributes	
 */
	private int id;
	private String city;
	private String country;
	private String lineOne;
	private String lineTwo;
	private boolean billingAddress;
	
/**
 * Methods
 */
	
	public Address(int ID, String ct, String ctr, String L1, String L2, boolean bA) {
		
		id=ID;
		city=ct;
		country=ctr;
		lineOne=L1;
		lineTwo=L2;
		billingAddress=bA;
	}
	
	public String getAddress() {
		return lineOne+" "+lineTwo+", "+city+" ("+country+").";
	}
	public static void main(String[] args) {
		Address test = new Address(1234,"Bogota","Colombia","calle 27 #67-11","Apartamento 804 T2",true);
		String add = test.getAddress();
		System.out.println(add);
	}

}
