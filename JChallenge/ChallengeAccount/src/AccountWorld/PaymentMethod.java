package AccountWorld;

public abstract class PaymentMethod {
	
	private int id;
	
	public PaymentMethod()	{
		
	}

	public abstract void authorize();

}
