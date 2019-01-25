import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LabNum9 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		Map<String, Double> menu = new HashMap<String, Double>();
		System.out.println("Welcome to Lauren's Market!");
		System.out.println();
		System.out.println("        Items");
		System.out.println("       -------");

	
		
		for (String name : menu.keySet()) {
			System.out.println(name + "\t\t" + menu.get(name));

			if (menu.containsKey(name)) {

				System.out.println("What item would you like to order?");
			}

			populateMenu();
			printMenu();

			scnr.close();
		}
	}

	private static void printMenu() {
		Map<String, Double> menu = new HashMap<String, Double>();
		menu.put("Apple", 0.99);
		menu.put("Orange", 0.59);
		menu.put("Grapes", 1.59);
		menu.put("Cheese", 2.99);
		menu.put("Bread", 2.59);
		menu.put("Chicken", 10.59);
		menu.put("Chips", 1.99);
		menu.put("Milk", 4.59);

	}

	private static void populateMenu() {
		Map<String, Double> menu = new HashMap<String, Double>();

	}
}
