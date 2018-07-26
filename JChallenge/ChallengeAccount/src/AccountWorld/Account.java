package AccountWorld;

import java.util.*;

public class Account {
	
/*
 * Attributes
 */
	private int id;
	private Customer customer;
	private AccountStatus status;
	private ShoppingCart cart;
	private List <Address> addresses;
	private List <PaymentMethod> methods;
	
/**
 * Methods
 */
	
	public Account() {
		
		Customer customer= new Customer();
		addresses = new ArrayList<Address>();
		/**
		 *  As soon as the account is created is active
		 */
		status=AccountStatus.ACTIVE;
		ShoppingCart cart = new ShoppingCart();
		
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
	

}
