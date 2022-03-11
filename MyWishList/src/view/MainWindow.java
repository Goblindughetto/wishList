package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import models.ListItems;
import controllers.ListWindowController;
import controllers.NewListWindowController;

public class MainWindow extends JFrame 
{	
	private ArrayList<ListItems> listDeList = new ArrayList<ListItems>();
	private JPanel listWishlistPanel = new JPanel(new FlowLayout());
	
	public MainWindow(String name) 
	{
		super(name);
		this.setSize(500,500);
		
		JButton newWishlistButton = new JButton("Nouvelle wishlist");
		newWishlistButton.addActionListener(new NewListWindowController(this, listDeList)); 
		
		this.refeshList();
		
		this.add(newWishlistButton, BorderLayout.PAGE_START);
		this.add(listWishlistPanel, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	public void refeshList() 
	{
		for(Component c : listWishlistPanel.getComponents())
		{
			listWishlistPanel.remove(c);
		}
		
		for(int i=0; i<this.listDeList.size(); i++)
		{
			ListItems list = this.listDeList.get(i);
			
			JPanel componment = new JPanel(new FlowLayout());
			JLabel nameList = new JLabel(list.getName());
			JButton button = new JButton("Voir la liste");
			button.addActionListener(new ListWindowController(list));
			
			componment.add(nameList);
			componment.add(button);
			this.listWishlistPanel.add(componment);
		}
		
		listWishlistPanel.revalidate();
		listWishlistPanel.repaint();
	}
}
