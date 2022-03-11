package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;

import models.ListItems;
import view.MainWindow;
import view.NewListWindow;

public class NewListController implements ActionListener {
	
	private MainWindow mainWindow;
	private JFrame fenetre;
	private JTextField name;
	private ArrayList<ListItems> listeDeList;
	
	public NewListController(MainWindow mainWindow, JFrame fenetre, JTextField name, ArrayList<ListItems> listeDeList) {
		this.mainWindow = mainWindow;
		this.fenetre = fenetre;
		this.name = name;
		this.listeDeList = listeDeList;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		ListItems nouvelleListe = new ListItems(this.name.getText());
		listeDeList.add(nouvelleListe);
		this.fenetre.dispose();
		this.mainWindow.refeshList();
	}
}
