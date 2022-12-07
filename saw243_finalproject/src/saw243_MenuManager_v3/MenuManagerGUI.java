package saw243_MenuManager_v3;

import javax.swing.*;

public class MenuManagerGUI {
	private JLabel firstLabel;
	private JLabel lblEntree;
	private JLabel lblSide;
	private JLabel lblSalad;
	private JLabel lblDessert;
	private JLabel secondLabel;
	private JFrame mainFrame;
	private JButton button;
	private JComboBox entreeBox;
	private JTextField field;
	private MenuManager menu;
	
	public MenuManagerGUI() {
		menu = new MenuManager("data\\dishes.txt");
		buildMainMenuWindow();
	}
	private void buildMainMenuWindow() {
		mainFrame = new JFrame("Menu Manager");
		mainFrame.setBounds(100, 100, 500, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		mainFrame.setVisible(true);
		
		firstLabel = new JLabel("Build your own menu");
		firstLabel.setBounds(10, 10, 150, 30);
		mainFrame.getContentPane().add(firstLabel);
		
		secondLabel = new JLabel("Generate a menu");
		secondLabel.setBounds(10, 300, 150, 30);
		mainFrame.getContentPane().add(secondLabel);
		
		lblEntree = new JLabel("Entree");
		lblEntree.setBounds(20, 40, 150, 30);
		mainFrame.getContentPane().add(lblEntree);
		
		lblSide = new JLabel("Side");
		lblSide.setBounds(20, 90, 150, 30);
		mainFrame.getContentPane().add(lblSide);
		
		lblSalad = new JLabel("Salad");
		lblSalad.setBounds(20, 140, 150, 30);
		mainFrame.getContentPane().add(lblSalad);
		
		lblDessert = new JLabel("Dessert");
		lblDessert.setBounds(20, 190, 150, 30);
		mainFrame.getContentPane().add(lblDessert);
		
		entreeBox = new JComboBox<Entree>((Entree[]) menu.getEntrees().toArray()); 
		entreeBox.setBounds(20, 140, 150, 30);
		mainFrame.getContentPane().add(entreeBox);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated S stub
		MenuManagerGUI gui = new MenuManagerGUI();
	}
	

}
