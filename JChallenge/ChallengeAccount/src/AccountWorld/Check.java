package AccountWorld;

public class Check extends PaymentMethod{
	
/*
 * Attributes
 */
	private int number;
	private int bankId;
	private String holder;
	
/*
 *  Methods 
 */
	
	public Check(){

		
		this.number=2;
		this.bankId=23;
		this.holder="Alejandra";
		
		
	}
	
	public void authorize() {
		
	}
}
