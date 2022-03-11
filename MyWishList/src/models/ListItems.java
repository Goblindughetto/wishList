package models;

import java.util.ArrayList;

public class ListItems extends ArrayList<Item> 
{
	private String name;

	public ListItems(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double totalPrice() 
	{
		double price = 0.0;
		
		for(int i=0; i<this.size(); i++)
		{
			price += this.get(i).getPrice();
		}
		return price;
	}

}
