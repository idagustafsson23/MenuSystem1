package menusystem;

import java.util.ArrayList;

public class intMenu extends Menu {

	public intMenu(ArrayList<String> alternativs, ArrayList<Altmenu> theClassOfChoise) {
		super(alternativs);
		int choise;
		do{
			printMenu();
			choise = scan.nextInt();
			choise--;
			if(choise < alternativs.size()){
				theClassOfChoise.get(choise).makeThis();
			}
		}while(choise < alternativs.size());
	}

	@Override
	public void printMenu() {
		System.out.println("Make a choise!");
		super.printMenu();
	}
	
}
