package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import models.ListItems;
import view.MainWindow;
import view.NewListWindow;

public class NewListWindowController implements ActionListener {
	
	private ArrayList<ListItems> listDeList;
	private MainWindow mainWindow; 

	public NewListWindowController(MainWindow mainWindow, ArrayList<ListItems> listDeList) 
	{
		this.mainWindow = mainWindow;
		this.listDeList = listDeList;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new NewListWindow(this.mainWindow, this.listDeList);
	}
}
