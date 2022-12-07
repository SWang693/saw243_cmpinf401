package saw243_MenuManager_v3;

import java.util.ArrayList;

public class testerrr extends FileManager{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MenuItem> hi = readItems("data\\dishes.txt");
		for(int i = 0; i < hi.size(); i++) {
			System.out.println(hi.get(i).getDescription());
		}
	}

}
