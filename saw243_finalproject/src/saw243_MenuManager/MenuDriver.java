package saw243_MenuManager;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDriver {

	public static void main(String[] args) {
		// System.out.println("HERE");
		// TODO Auto-generated method stub
		ArrayList<MenuItem> menuItemList = FileManager.readItems("data\\dishes.txt");
		for(MenuItem m : menuItemList) {
			System.out.println(m.getDescription());
		}
		// MenuManager userTest = new MenuManager("data\\dishes.txt");
		
		/*
		Scanner myOBJ = new Scanner(System.in);
		System.out.println("Please input the number of Menus that you would liek to create below: ");
		int userInput = myOBJ.nextInt();
		
		System.out.println("You have chosen to generate " + userInput + " random menus, enjoy");
		
		for(int i = 0; i < userInput;  i++) {
			Menu testMenu = MenuManager.randomMenu("Menu " + (i+1));
			menu.add(testMenu);
			FileManager.writeMenu("data\\swag.txt", menu);
		}
		*/
		
	}

}
