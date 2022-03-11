package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import models.ListItems;
import view.ListWindow;
import view.MainWindow;
import view.NewItemWindow;

public class NewItemWindowController implements ActionListener {
	
	private ListItems listItems;
	private ListWindow listWindow; 
	
	public NewItemWindowController(ListWindow listWindow, ListItems listItems) 
	{
		// TODO Auto-generated constructor stub
		this.listItems = listItems;
		this.listWindow = listWindow;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new NewItemWindow(this.listWindow, this.listItems);
	}

}
