package view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllers.NewItemController;
import controllers.NewListController;
import models.Item;
import models.ListItems;

public class NewItemWindow extends JFrame 
{
	public NewItemWindow(ListWindow listWindow, ListItems listItems)
	{
		super("Ajouter un item");
		this.setSize(500,500);
		
		JPanel contentPanel = new JPanel(new BorderLayout());
		
		JLabel nameLabel = new JLabel("Item : ");
		JTextField nameTextField = new JTextField("");
		JButton newListButton = new JButton("Valider");
		newListButton.addActionListener(new NewItemController(listWindow, this, nameTextField, listItems));
		
		contentPanel.add(nameLabel, BorderLayout.LINE_START);
		contentPanel.add(nameTextField, BorderLayout.CENTER);
		contentPanel.add(newListButton, BorderLayout.PAGE_END);
		
		this.add(contentPanel);
		this.setVisible(true);
	}
}
