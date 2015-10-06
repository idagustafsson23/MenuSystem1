package menusystem;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu {
	public ArrayList<String> alternativs;
	public Scanner scan;
	
	public Menu(ArrayList<String> alternativs) {
		scan = new Scanner(System.in);
		this.alternativs = alternativs;
	}
	
	public void printMenu(){
		for(int i = 0; i < alternativs.size(); i++){
			System.out.println((i+1) + ". " + alternativs.get(i));
		}
	}
}
