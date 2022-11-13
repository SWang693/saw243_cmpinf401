package saw243_MenuManager_v3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import saw243_MenuManager_v2.Dessert;
import saw243_MenuManager_v2.Entree;
import saw243_MenuManager_v2.Salad;
import saw243_MenuManager_v2.Side;
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
		* @return arraylist of entrees
		*/
		ArrayList<MenuItem> ent = new ArrayList<MenuItem>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length == 4) {
					MenuItem e = new MenuItem(temp[0],temp[1],Integer.parseInt(temp[2]),Double.parseDouble(temp[3]));
					ent.add(e);
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
	public static void writeMenu( tring fileName, ArrayList<Menu> menus) {
		
	}
	
	public static ArrayList<Entree> readEntrees(String filename){
		/**
		* Method create arraylists of entrees
		* @parameter file name of the entrees
		* @return arraylist of entrees
		*/
		ArrayList<Entree> ent = new ArrayList<Entree>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length ==3) {
					Entree e = new Entree(temp[0],temp[1],Integer.parseInt(temp[2]));
					ent.add(e);
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

	
	public static ArrayList<Side> readSides(String filename){
		/**
		* Method create arraylists of sides
		* @parameter file name of the sides
		* @return arraylist of sides
		*/
		ArrayList<Side> sid = new ArrayList<Side>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length ==3) {
					Side e = new Side(temp[0],temp[1],Integer.parseInt(temp[2]));
					sid.add(e);
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
		
		return sid; 
		
	}
	public static ArrayList<Salad> readSalads(String filename){
		/**
		* Method create arraylists of salads
		* @parameter file name of the salads
		* @return arraylist of sides
		*/
		ArrayList<Salad> sad = new ArrayList<Salad>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length ==3) {
					Salad e = new Salad(temp[0],temp[1],Integer.parseInt(temp[2]));
					sad.add(e);
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
		
		return sad; 
	
	}
	public static ArrayList<Dessert> readDesserts(String filename){
		/**
		* Method create arraylists of desserts
		* @parameter file name of the desserts
		* @return arraylist of desserts
		*/
		ArrayList<Dessert> des = new ArrayList<Dessert>();
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr); 
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] temp = line.split("@@");
				if(temp.length ==3) {
					Dessert e = new Dessert(temp[0],temp[1],Integer.parseInt(temp[2]));
					des.add(e);
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
		
		return des; 
	
	}


}