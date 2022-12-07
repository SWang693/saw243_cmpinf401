package saw243_MenuManager_v3;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Menu> menu = new ArrayList<Menu>();
		MenuManager userTest = new MenuManager("data\\dishes.txt");
		
		Scanner myOBJ = new Scanner(System.in);
		System.out.println("Please input the number of Menus that you would liek to create below: ");
		int userInput = myOBJ.nextInt();
		
		System.out.println("You have chosen to generate " + userInput + " random menus, enjoy");
		
		for(int i = 0; i < userInput;  i++) {
			Menu testMenu = MenuManager.randomMenu("Menu " + (i+1));
			menu.add(testMenu);
			FileManager.writeMenu("data\\swag.txt", menu);
		}
		
	}

}
