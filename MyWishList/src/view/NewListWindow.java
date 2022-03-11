package view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controllers.NewListController;
import models.ListItems;

public class NewListWindow extends JFrame
{
	public NewListWindow(MainWindow mainWindow, ArrayList<ListItems> listeDeList) 
	{
		super("Ajouter une liste");
		this.setSize(500,500);
		
		JPanel contentPanel = new JPanel(new BorderLayout());
		
		JLabel nameLabel = new JLabel("Name : ");
		JTextField nameTextField = new JTextField("");
		JButton newListButton = new JButton("Valider");
		newListButton.addActionListener(new NewListController(mainWindow, this, nameTextField, listeDeList));
		
		contentPanel.add(nameLabel, BorderLayout.LINE_START);
		contentPanel.add(nameTextField, BorderLayout.CENTER);
		contentPanel.add(newListButton, BorderLayout.PAGE_END);
		
		this.add(contentPanel);
		this.setVisible(true);
	}
}
