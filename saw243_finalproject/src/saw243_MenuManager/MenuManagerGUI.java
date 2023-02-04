package saw243_MenuManager;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;
public class MenuManagerGUI{
	private JLabel firstLabel;
	private JLabel lblEntree;
	private JLabel lblSide;
	private JLabel lblSalad;
	private JLabel lblDessert;
	private JLabel secondLabel, createMenu;
	private JFrame mainFrame;
	private JButton generateRandomButton, createMenuButton, generateMinButton, generateMaxButton;
	private JComboBox entreeBox;
	private JComboBox sideBox;
	private JComboBox saladBox;
	private JComboBox dessertBox;
	private MenuManager menu;
	private JFrame frmChildWindow;
	private JList<Menu> menuList;
	private DefaultListModel<Menu> dlm;
	
	// public static JList createdMenusText;
	// private ArrayList<Menu> menuList= new ArrayList<Menu>();
 	public MenuManagerGUI() {
		menu = new MenuManager("data\\dishes.txt");
		buildMainMenuWindow();
	}
	private void buildMainMenuWindow() {
		mainFrame = new JFrame("Menu Manager");
		mainFrame.setBounds(100, 100, 664, 547);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		//labels
		firstLabel = new JLabel("Build your own menu");
		firstLabel.setBounds(10, 10, 150, 30);
		mainFrame.getContentPane().add(firstLabel);
		
		secondLabel = new JLabel("Generate a menu");
		secondLabel.setBounds(60, 286, 150, 30);
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
		
		createMenu = new JLabel("Create Menus");
		createMenu.setBounds(209, 20, 100, 60);
		mainFrame.getContentPane().add(createMenu);
		//COMBO BOXES
		dessertBox = new JComboBox(menu.getDesserts().toArray()); 
		dessertBox.setBounds(188, 190, 120, 30);
		mainFrame.getContentPane().add(dessertBox);
		
		entreeBox = new JComboBox(menu.getEntrees().toArray()); 
		entreeBox.setBounds(188, 61, 120, 30);
		mainFrame.getContentPane().add(entreeBox);
		
		sideBox = new JComboBox(menu.getSides().toArray()); 
		sideBox.setBounds(188, 102, 120, 30);
		mainFrame.getContentPane().add(sideBox);
		
		saladBox = new JComboBox(menu.getSalads().toArray()); 
		saladBox.setBounds(188, 140, 120, 30);
		mainFrame.getContentPane().add(saladBox);
		
		generateRandomButton = new JButton("Generate a Random Menu");
		generateRandomButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("What do you wanna name your menu?");
				Menu randomMenu = menu.randomMenu(name);
				dlm.addElement(randomMenu);
			}
		});
		generateRandomButton.setBounds(10, 341, 200, 30);
		mainFrame.getContentPane().add(generateRandomButton);
		
		createMenuButton = new JButton("Create Menu with these dishes");
		createMenuButton.setBounds(10, 250, 250, 30);
		mainFrame.getContentPane().add(createMenuButton);
		
		generateMinButton = new JButton("Generate Minimum Calories Menu");
		generateMinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("What do you wanna name your menu?");
				Menu minMenu = menu.minCaloriesMenu(name);
				dlm.addElement(minMenu);
				
			}
		});
		generateMinButton.setBounds(10, 386, 200, 30);
		mainFrame.getContentPane().add(generateMinButton);
		
		generateMaxButton = new JButton("Generate Maximum Calories Menu");
		generateMaxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("What do you wanna name your menu?");
				Menu maxMenu = menu.maxCaloriesMenu(name);
				dlm.addElement(maxMenu);
				
			}
		});
		generateMaxButton.setBounds(10, 427, 200, 30);
		mainFrame.getContentPane().add(generateMaxButton);
		
		//createdMenusText = new JList(menuList);
		dlm = new DefaultListModel<Menu>();
		menuList = new JList<Menu>(dlm);
		menuList.setBounds(374, 44, 250, 260);
		mainFrame.getContentPane().add(menuList);	
		
		
		JButton btnNewButton = new JButton("Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					createChildWindow();
				}
				catch(NullPointerException error) {
					System.out.println("You did not select a menu!");
				}
			}
		});
		btnNewButton.setBounds(344, 332, 89, 26);
		mainFrame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete All");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.clear();
				menuList.setModel(dlm);
			}
		});
		btnNewButton_1.setBounds(443, 332, 89, 26);
		mainFrame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Save to File");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Menu> arrayList = Collections.list(dlm.elements());
				FileManager.writeMenu("data\\savedMenus.txt", arrayList);
			}
		});
		btnNewButton_2.setBounds(542, 332, 89, 26);
		mainFrame.getContentPane().add(btnNewButton_2);
		
		
		createMenuButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Entree selectedEntree = (Entree) entreeBox.getSelectedItem();
				Side selectedSide = (Side) sideBox.getSelectedItem();
				Salad selectedSalad = (Salad) saladBox.getSelectedItem();
				Dessert selectedDessert = (Dessert) dessertBox.getSelectedItem();
				String name = JOptionPane.showInputDialog("What do you wanna name your menu?");
				
				
				Menu createdMenu = new Menu(name, selectedEntree, selectedSide, selectedSalad, selectedDessert);
				dlm.addElement(createdMenu);
				// menuList.add(createdMenu);
				// lmenuArray = new String[menuList.size()];
				//createdMenusText.setText(createdMenusText.getText() + "\n" + createdMenu.getName());
			}
		
		});
		
		mainFrame.setVisible(true);
		
	}
		


	private void createChildWindow() {
		frmChildWindow = new JFrame("Menu: My Menu");
		frmChildWindow.setBounds(100, 100, 900, 900);
		
		
		
		JTextArea textArea_1 = new JTextArea(menuList.getSelectedValue().getEntree().getName() + "\n" + menuList.getSelectedValue().getEntree().getDescription() + "\n" + "Calories: " + menuList.getSelectedValue().getEntree().getCalories() + " Price: " + menuList.getSelectedValue().getEntree().getPrice());
		textArea_1.setBounds(379, 64, 520, 112);
		frmChildWindow.getContentPane().add(textArea_1);
		
		JTextArea textArea = new JTextArea(menuList.getSelectedValue().getSide().getName() + "\n" + menuList.getSelectedValue().getSide().getDescription() + "\n" + "Calories: " + menuList.getSelectedValue().getSide().getCalories() + " Price: " + menuList.getSelectedValue().getSide().getPrice());
		textArea.setBounds(379, 200, 520, 112);
		frmChildWindow.getContentPane().add(textArea);
		
		JTextArea textArea_2 = new JTextArea(menuList.getSelectedValue().getSalad().getName() + "\n" + menuList.getSelectedValue().getSalad().getDescription() + "\n" + "Calories: " + menuList.getSelectedValue().getSalad().getCalories() + " Price: " + menuList.getSelectedValue().getSalad().getPrice());
		textArea_2.setBounds(379, 338, 520, 112);
		frmChildWindow.getContentPane().add(textArea_2);
		
		JTextArea textArea_2_1 = new JTextArea(menuList.getSelectedValue().getDessert().getName() + "\n" + menuList.getSelectedValue().getDessert().getDescription() + "\n" + "Calories: " + menuList.getSelectedValue().getDessert().getCalories() + " Price: " + menuList.getSelectedValue().getDessert().getPrice());
		textArea_2_1.setBounds(379, 476, 520, 112);
		frmChildWindow.getContentPane().add(textArea_2_1);
		
		JTextArea textField = new JTextArea(Integer. toString(menuList.getSelectedValue().totalCalories()));
		textField.setBounds(379, 624, 99, 45);
		frmChildWindow.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea textField_1 = new JTextArea(Integer. toString(menuList.getSelectedValue().totalPrice()));
		textField_1.setColumns(10);
		textField_1.setBounds(379, 703, 99, 45);
		frmChildWindow.getContentPane().add(textField_1);
		
		
		JLabel lblNewLabel = new JLabel("Entree:");
		lblNewLabel.setBounds(72, 69, 100, 14);
		frmChildWindow.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Side:");
		lblNewLabel_1.setBounds(72, 205, 100, 14);
		frmChildWindow.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salad:");
		lblNewLabel_2.setBounds(72, 343, 100, 14);
		frmChildWindow.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dessert:");
		lblNewLabel_3.setBounds(72, 481, 100, 14);
		frmChildWindow.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total Calories:");
		lblNewLabel_4.setBounds(72, 624, 100, 14);
		frmChildWindow.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total Price:");
		lblNewLabel_5.setBounds(72, 706, 100, 14);
		frmChildWindow.getContentPane().add(lblNewLabel_5);
		
		
		frmChildWindow.setVisible(true);

		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated S stub
		MenuManagerGUI gui = new MenuManagerGUI();
	}
}
