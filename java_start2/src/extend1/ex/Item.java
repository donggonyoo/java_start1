package extend1.ex;

public class Item {
	public String name;
	public int price;
	
	public Item(String name,int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return this.price;	
	}
	
	public void print() {
		System.out.print("이름 : "+this.name+"  가격 : "+this.price+" ");
		
	}

}
