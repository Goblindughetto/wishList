package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ListItems;
import view.ListWindow;
import view.NewListWindow;

public class ListWindowController implements ActionListener {
	
	private ListItems liste;
	private String listName;

	public ListWindowController(ListItems listItems) {
		// TODO Auto-generated constructor stub
		this.liste = listItems;
		this.listName = listItems.getName();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new ListWindow(listName, liste);
	}

}
