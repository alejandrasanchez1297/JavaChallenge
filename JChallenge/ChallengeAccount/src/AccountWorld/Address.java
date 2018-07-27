package AccountWorld;

public class Address {

/*
 * Attributes	
 */
	private int id;
	private String city;
	private String country;
	private String lineOne;
	private String lineTwo;
	private boolean billingAddress;
	
/*
 * Methods
 */
	
	public Address(int id, String city, String coutry, String lineOne, String loneTwo, boolean billingAddress) {
		
		this.id=id;
		this.city=city;
		this.country=country;
		this.lineOne=lineOne;
		this.lineTwo=lineTwo;
		this.billingAddress=billingAddress;
	}
	
	public String getAddress() {
		return lineOne+" "+lineTwo+", "+city+" ("+country+").";
	}
	public static void main(String[] args) {
		Address testGetAddress = new Address(1234,"Bogota","Colombia","calle 27 #67-11","Apartamento 804 T2",true);
		String gotAddress = testGetAddress.getAddress();
		System.out.println(gotAddress);
	}

}
