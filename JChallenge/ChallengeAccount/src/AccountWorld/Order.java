package AccountWorld;

import java.util.*;

public class Order {

/*
 * Attributes
 */
	private int id;
	private Date modified;
	private OrderStatus status;
	private String shippingAddress;
	private double total;
	private List<LineItem> items;

/*
 * Methods
 */
	
	private Order() {
		items = new ArrayList<LineItem>();
		total=0;
	}
	private void addItem(LineItem i) {
		items.add(i);
		total=total+i.getPrice()*i.getQuantity();
	
	}
	
	private double getTotal() {
		
		return total;
	}
	
	public static void main(String[] args) {
		
		Order testGetTotal = new Order();		
		LineItem item1 = new LineItem(4,5.5);
		LineItem item2 = new LineItem(2,7);
		LineItem item3 = new LineItem(1,10);
		testGetTotal.addItem(item1);
		testGetTotal.addItem(item2);
		testGetTotal.addItem(item3);
		double totalOrder= testGetTotal.getTotal();
		System.out.println("The total is "+totalOrder+" and should be 46");
		
		LineItem item4 = new LineItem(10,3);
		LineItem item5 = new LineItem(4,8);
		LineItem item6 = new LineItem(3,2);
		testGetTotal.addItem(item4);
		testGetTotal.addItem(item5);
		testGetTotal.addItem(item6);
		totalOrder = testGetTotal.getTotal();
		System.out.println("The total is "+totalOrder+" and should be 114");
		
		
	} 
	
}
