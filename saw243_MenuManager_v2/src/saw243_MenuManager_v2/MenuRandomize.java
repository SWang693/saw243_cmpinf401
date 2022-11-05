package saw243_MenuManager_v2;
import java.util.Random;	
import java.util.ArrayList;
/**
 * Class MenuRandomize
 * @author : Sam
 * @created: 10/28/2022
 */

public class MenuRandomize {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		/**
		* Method create arraylists of food
		* @parameter entreeFile a string
		* @parameter sideFile a string
		* @parameter saladFile a string
		* @parameter dessertFile a string
		* @return nothing
		*/
		this.entrees = FileManager.readEntrees(entreeFile);
		this.sides = FileManager.readSides(sideFile);
		this.salads = FileManager.readSalads(saladFile);
		this.desserts = FileManager.readDesserts(dessertFile);
	}
	public Menu randomMenu() {
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
		Menu randomMenu = new Menu("yourRandomMenu", e, s, sS, d);
		return randomMenu;
	}
}
