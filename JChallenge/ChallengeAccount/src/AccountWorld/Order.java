package AccountWorld;

import java.util.*;

public class Order {

	private int id;
	private Date modified;
	private OrderStatus status;
	private String shippingAddress;
	private double total;
	private List<LineItem> items;
	
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
		
		System.out.println("Hello World");
		Order test = new Order();		
		LineItem item1 = new LineItem(4,5.5);
		LineItem item2 = new LineItem(2,7);
		LineItem item3 = new LineItem(1,10);
		test.addItem(item1);
		test.addItem(item2);
		test.addItem(item3);
		double tot = test.getTotal();
		System.out.println("Te total is "+tot+" and should be 46");
		
		LineItem item4 = new LineItem(10,3);
		LineItem item5 = new LineItem(4,8);
		LineItem item6 = new LineItem(3,2);
		test.addItem(item4);
		test.addItem(item5);
		test.addItem(item6);
		double tot2 = test.getTotal();
		System.out.println("Te total is "+tot2+" and should be 114");
		
		
	} 
	
}
