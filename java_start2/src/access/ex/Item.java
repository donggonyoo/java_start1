package access.ex;

public class Item {
	String name;
	int price;
	int quantity;
	
	public Item(String name, int price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}
	
	public int total() {
		return price * quantity;
		
	}

}