package AccountWorld;

public class Check extends PaymentMethod{
	
	private int number;
	
	private int bankId;
	
	private String holder;
	
/** M�todos */
	
	public Check(){

		
		this.number=2;
		this.bankId=23;
		this.holder="Alejandra";
		
		
	}
	
	public void authorize() {
		
	}
}
