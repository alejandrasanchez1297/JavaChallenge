package AccountWorld;

import java.util.*;

public class Order {

	private int id;
	private Date modified;
	private OrderStatus status;
	private String shippingAddress;
	private double total;
	private List<LineItem> items;
	
	private Order(LineItem item) {
		items = new ArrayList<LineItem>();
		items.add(item);
		total=0;
	}
	private void addItem(LineItem i) {
		items.add(i);
	
	}
	
	private double setTotal() {
		
		total=0;
		for(int i=0;i<items.size();i++)
		{
			LineItem temp =items.get(i);
			total=total+temp.getPrice()*temp.getQuantity();
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Hello World");
		LineItem item1 = new LineItem(3,5.5);
		LineItem item2 = new LineItem(3,5.5);
		LineItem item3 = new LineItem(3,5.5);
		
	} 
	
}
