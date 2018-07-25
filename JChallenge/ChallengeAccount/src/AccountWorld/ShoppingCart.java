package AccountWorld;

import java.util.*;

public class ShoppingCart {

	private List items;
	
	public ShoppingCart() {
		items = new ArrayList<LineItem>();
	}
	
	public void addItem(LineItem i) {
		items.add(i);
	}
	public void cleanCart() {
		items.clear();
	}
	
}
