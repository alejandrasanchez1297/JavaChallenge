package AccountWorld;

public class LineItem {

	private int quantity;
	private double price;
	private Product product;
	
	public LineItem(int q, double prc) {
		quantity=q;
		price=prc;
		product=new Product();
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
}
