package AccountWorld;

import java.util.*;

public class Account {
	
	private int id;
	private Customer custumer;
	private AccountStatus status;
	private ShoppingCart cart;
	private List addresses;
	private List methods;
	
	public Account() {
		
		addresses = new ArrayList<Address>();
		/** In the UML diagram was written <PaymentMethods> 
		 * but the name of the class is singular
		 */
		methods = new ArrayList<PaymentMethod>();
	}
	public void addMethod(PaymentMethod p) {
		methods.add(p);
	}
	public void addAddress(Address a) {
		addresses.add(a);
	}
	public void destroyMethods() {
		
		methods = new ArrayList<PaymentMethod>();
	}
	public void destroyAddresses() {
		
		addresses = new ArrayList<Address>();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
