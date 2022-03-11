package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllers.ListWindowController;
import controllers.NewItemWindowController;
import controllers.NewListController;
import models.Item;
import models.ListItems;

public class ListWindow extends JFrame
{	
	private ListItems listItems;
	private JPanel contentPanel = new JPanel(new FlowLayout());
	
	public ListWindow(String name, ListItems listItems)
	{
		super(name);
		this.listItems = listItems;
	
		this.setSize(500,500);
		
		JButton newItemButton= new JButton("Ajouter un item");
		newItemButton.addActionListener(new NewItemWindowController(this, listItems));
		
		this.refeshItems();
		
		this.add(newItemButton, BorderLayout.PAGE_START);
		this.add(contentPanel, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	public void refeshItems() 
	{
		for(Component c : contentPanel.getComponents())
		{
			contentPanel.remove(c);
		}
		
		for(int i=0; i<this.listItems.size(); i++)
		{
			Item item = this.listItems.get(i);
			
			JPanel componment = new JPanel(new FlowLayout());
			JLabel nameList = new JLabel(item.getName());
			
			componment.add(nameList);
			this.contentPanel.add(componment);
		}
		
		contentPanel.revalidate();
		contentPanel.repaint();
	}
}
