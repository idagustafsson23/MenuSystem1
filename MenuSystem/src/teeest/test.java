package teeest;

import java.util.ArrayList;

import menusystem.*;

public class test {
	public static void main(String[] args) {
		ArrayList<String> alternatives = new ArrayList<String>();
		alternatives.add("do this");
		alternatives.add("or do this");
		ArrayList<Altmenu> choises = new ArrayList<Altmenu>();
		choises.add(new Opt1());
		choises.add(new Opt2());
		
		intMenu theMenu = new intMenu(alternatives, choises);
	}
}
