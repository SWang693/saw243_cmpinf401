package saw243_MenuManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import saw243_MenuManager.Dessert;
import saw243_MenuManager.Entree;
import saw243_MenuManager.Salad;
import saw243_MenuManager.Side;
/**
 * Class FileManager
 * @author : Sam
 * @created: 10/28/2022
 */
public class FileManager {
	
	public static ArrayList<MenuItem> readItems(String filename){
		
		/**
		* Method: reads all types of dishes from a single file in which each line can be an entree, a side, a salad or a dessert
		* @parameter file name of the the dishes
		* @return arraylist of menu items
		*/
		ArrayList<MenuItem> ent = new ArrayList<MenuItem>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				
				String[] temp = line.split("@@");
				if(temp.length == 5) {
					// System.out.println(line);
					if(temp[1].equalsIgnoreCase("entree")) {
						Entree e = new Entree(temp[0],temp[2],Integer.parseInt(temp[3]),Double.parseDouble(temp[4]));
						
						ent.add(e);
					}
					else if(temp[1].equalsIgnoreCase("salad")) {
						Salad s = new Salad(temp[0],temp[2],Integer.parseInt(temp[3]),Double.parseDouble(temp[4]));
						ent.add(s);
					}
					else if(temp[1].equalsIgnoreCase("side")) {
						Side ss = new Side(temp[0],temp[2],Integer.parseInt(temp[3]),Double.parseDouble(temp[4]));
						ent.add(ss);
					}
					else if(temp[1].equalsIgnoreCase("dessert")) {
						Dessert d = new Dessert(temp[0],temp[2],Integer.parseInt(temp[3]),Double.parseDouble(temp[4]));
						ent.add(d);
					}
				}
				else {
					System.out.println("One of the rows in your dataset is missing values");
				}
				
			
			}
			br.close();
			fr.close();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ent; 
	    
	}
	public static void writeMenu(String fileName, ArrayList<Menu> menus) {
		try {
			FileWriter fr = new FileWriter(fileName);
			BufferedWriter br = new BufferedWriter(fr);
			int priceCounter = 0;
			for(int i = 0; i < menus.size(); i++) {
				// priceCounter += menus.get(i).
				if(menus.get(i).getSalad() != null) {
					priceCounter += menus.get(i).getSalad().getPrice();
				}
				if(menus.get(i).getDessert() != null) {
					priceCounter += menus.get(i).getDessert().getPrice();
				}
				if(menus.get(i).getEntree() != null) {
					priceCounter += menus.get(i).getEntree().getPrice();
				}
				if(menus.get(i).getSide() != null) {
					priceCounter += menus.get(i).getSide().getPrice();
				}
				br.write(menus.get(i).getName() + ": " + menus.get(i).description() + " totalCalories: " + menus.get(i).totalCalories());
				br.write(" total price is " + priceCounter + "\n");
			}
			br.close();
			fr.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
