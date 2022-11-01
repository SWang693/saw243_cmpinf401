package saw243_MenuManager_v2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	public static ArrayList<Entree> readEntrees(String filename){
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