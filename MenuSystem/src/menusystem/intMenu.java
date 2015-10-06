package menusystem;

import java.util.ArrayList;

public class intMenu extends Menu {

	public intMenu(ArrayList<String> alternativs, ArrayList<Altmenu> theClassOfChoise) {
		super(alternativs);
		printMenu();
		int choise = scan.nextInt();
		choise--;
		theClassOfChoise.get(choise).makeThis();
	}

	@Override
	public void printMenu() {
		System.out.println("Make a choise!");
		super.printMenu();
	}
	
}
