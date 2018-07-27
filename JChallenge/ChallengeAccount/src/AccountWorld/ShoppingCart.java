package AccountWorld;

import java.util.*;

public class ShoppingCart {

/*
 * Attributes
 */
	
	private List<LineItem> items;
	
/*
 * Methods
 */
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
