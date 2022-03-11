package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;

import models.Item;
import models.ListItems;
import view.ListWindow;

public class NewItemController implements ActionListener {
	
	private ListWindow listWindow;
	private JFrame fenetre;
	private JTextField name;
	private ListItems listItems;

	public NewItemController(ListWindow listWindow, JFrame fenetre, JTextField name, ListItems listItems) {
		// TODO Auto-generated constructor stub
		this.listWindow = listWindow;
		this.fenetre = fenetre;
		this.listItems = listItems;
		this.name = name;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Item newItem = new Item(this.name.getText());
		listItems.add(newItem);
		this.fenetre.dispose();
		this.listWindow.refeshItems();
	}

}
