package AccountWorld;

public class Address {

	private int id;
	private String city;
	private String country;
	private String lineOne;
	private String lineTwo;
	private boolean billingAddress;
	
	public Address() {
		
	}
	
	public String getAddress() {
		return lineOne+" "+lineTwo+", "+city+" ("+country+").";
	}
	

}
