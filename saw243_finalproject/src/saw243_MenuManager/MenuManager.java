package saw243_MenuManager;

import java.util.ArrayList;
import java.util.Random;

public class MenuManager extends FileManager{
	private static ArrayList<Entree> entrees = new ArrayList<Entree>();;
	private static ArrayList<Side> sides = new ArrayList<Side>();
	private static ArrayList<Salad> salads = new ArrayList<Salad>();
	private static ArrayList<Dessert> desserts = new ArrayList<Dessert>();
	
	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> men = readItems(dishesFile);

		for(int i = 0; i < men.size(); i++) {
			if(men.get(i) instanceof Entree) {
				entrees.add((Entree) men.get(i));
			}
			if(men.get(i) instanceof Side) {
				sides.add((Side) men.get(i));
			}
			if(men.get(i) instanceof Salad) {
				salads.add((Salad) men.get(i));
			}
			if(men.get(i) instanceof Dessert) {
				desserts.add((Dessert) men.get(i));
			}
		}	
	}
	public Menu randomMenu(String name) {
		/**
		* Method name: randomMenu
		* no parameters
		* @returns a random menu
		*/

		Entree e = null;
		Side s = null;
		Salad sS = null;
		Dessert d = null;
		Random r = new Random();
		for (int i = 0; i < entrees.size(); i++) {
            // generating random index with the help of
            // nextInt() method
            int index = r.nextInt(entrees.size());
            e = entrees.get(index);
        }
		for (int i = 0; i < sides.size(); i++) {
            // generating random index with the help of
            // nextInt() method
            int index = r.nextInt(sides.size());
            s = sides.get(index);
        }
		for (int i = 0; i < salads.size(); i++) {
            // generating random index with the help of
            // nextInt() method
            int index = r.nextInt(salads.size());
            sS = salads.get(index);
        }
		for (int i = 0; i < desserts.size(); i++) {
            // generating random index with the help of
            // nextInt() method
            int index = r.nextInt(desserts.size());
            d = desserts.get(index);
        }
		Menu randomMenu = new Menu(name, e, s, sS, d);
		return randomMenu;
	}
	public Menu minCaloriesMenu(String name) {
		
		Entree e = null;
		Side s = null;
		Salad sS = null;
		Dessert d = null;
		for (int i = 1; i < entrees.size(); i++) {
            // generating lowest calories entree
            // declares to Entree object
            if(entrees.get(i).getCalories() < entrees.get(i-1).getCalories()) {
            	e = entrees.get(i);
            }
            else {
            	e = entrees.get(i-1);
            }
        }
		for (int i = 1; i < sides.size(); i++) {
			// generating lowest calories entree
            // declares to Entree object
            if(sides.get(i).getCalories() < sides.get(i-1).getCalories()) {
            	s = sides.get(i);
            }
            else {
            	s = sides.get(i-1);
            }
        }
		for (int i = 1; i < salads.size(); i++) {
			// generating lowest calories entree
            // declares to Entree object
            if(salads.get(i).getCalories() < salads.get(i-1).getCalories()) {
            	sS = salads.get(i);
            }
            else {
            	sS = salads.get(i-1);
            }
        }
		for (int i = 1; i < desserts.size(); i++) {
			// generating lowest calories entree
            // declares to Entree object
            if(desserts.get(i).getCalories() < desserts.get(i-1).getCalories()) {
            	d = desserts.get(i);
            }
            else {
            	d = desserts.get(i-1);
            }
        }
		Menu lowestCalories = new Menu(name, e, s, sS, d);
		return lowestCalories;
	}
public Menu maxCaloriesMenu(String name) {
		
		Entree e = null;
		Side s = null;
		Salad sS = null;
		Dessert d = null;
		for (int i = 1; i < entrees.size(); i++) {
            // generating lowest calories entree
            // declares to Entree object
            if(entrees.get(i).getCalories() > entrees.get(i-1).getCalories()) {
            	e = entrees.get(i);
            }
            else {
            	e = entrees.get(i-1);
            }
        }
		for (int i = 1; i < sides.size(); i++) {
			// generating lowest calories entree
            // declares to Entree object
            if(sides.get(i).getCalories() > sides.get(i-1).getCalories()) {
            	s = sides.get(i);
            }
            else {
            	s = sides.get(i-1);
            }
        }
		for (int i = 1; i < salads.size(); i++) {
			// generating lowest calories entree
            // declares to Entree object
            if(salads.get(i).getCalories() > salads.get(i-1).getCalories()) {
            	sS = salads.get(i);
            }
            else {
            	sS = salads.get(i-1);
            }
        }
		for (int i = 1; i < desserts.size(); i++) {
			// generating lowest calories entree
            // declares to Entree object
            if(desserts.get(i).getCalories() > desserts.get(i-1).getCalories()) {
            	d = desserts.get(i);
            }
            else {
            	d = desserts.get(i-1);
            }
        }
		Menu lowestCalories = new Menu(name, e, s, sS, d);
		return lowestCalories;
	}
public  ArrayList<Entree> getEntrees() {
	return entrees;
}
public  void setEntrees(ArrayList<Entree> entrees) {
	MenuManager.entrees = entrees;
}
public  ArrayList<Side> getSides() {
	return sides;
}
public  void setSides(ArrayList<Side> sides) {
	MenuManager.sides = sides;
}
public  ArrayList<Salad> getSalads() {
	return salads;
}
public  void setSalads(ArrayList<Salad> salads) {
	MenuManager.salads = salads;
}
public  ArrayList<Dessert> getDesserts() {
	return desserts;
}
public  void setDesserts(ArrayList<Dessert> desserts) {
	MenuManager.desserts = desserts;
}

	
	
}