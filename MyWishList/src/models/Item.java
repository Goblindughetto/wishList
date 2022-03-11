package models;

public class Item {
	private String name;
	private float price;
	private String link;
	private String describe;
	private boolean isBuy;
	
	public Item(String name) 
	{
		this.name = name;
	}
	
	public Item(String name, float price, String link, String describe, boolean isBuy) {
		this.name = name;
		this.price = price;
		this.link = link;
		this.describe = describe;
		this.isBuy = isBuy;
	}
	
	public String getName() { return name; }
	
	public void setName(String name) { this.name = name; }

	public float getPrice() { return price;	}
	
	public void setPrice(float price) { this.price = price; }
	
	public String getLink() { return link; }
	
	public void setLink(String link) { this.link = link; }
	
	public String getDescribe() { return describe; }
	
	public void setDescribe(String describe) { this.describe = describe; }
	
	public boolean isBuy() { return isBuy; }
	
	public void setBuy(boolean isBuy) { this.isBuy = isBuy; }
	
}
