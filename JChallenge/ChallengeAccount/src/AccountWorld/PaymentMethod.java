package AccountWorld;

public abstract class PaymentMethod {
	
/*
 * Attributes	
 */
	private int id;
	
	public PaymentMethod()	{
		
	}
/*
 * Methods
 */
	public abstract void authorize();

}
