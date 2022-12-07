package saw243_MenuManager_v3;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MenuItem> menuItemList = FileManager.readItems("data\\dishes.txt");
		for(MenuItem m : menuItemList) {
			System.out.println(m.getDescription());
		}
		MenuManager userTest = new MenuManager("data\\dishes.txt");
			Menu testMenu = userTest.randomMenu("Random Menu ");
			
			ArrayList<Menu> temp = new ArrayList<>();
			temp.add(testMenu);
			FileManager.writeMenu("data\\swag.txt", temp);
	}

}
