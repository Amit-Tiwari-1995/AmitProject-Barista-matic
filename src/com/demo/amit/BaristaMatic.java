package com.demo.amit;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BaristaMatic {

	private static LinkedHashMap<String, Integer> inventory = new LinkedHashMap<>();

	private static LinkedHashMap<Integer, ArrayList<Object>> menu = new LinkedHashMap<>();

	private static LinkedHashMap<String, Integer> restockInventory = new LinkedHashMap<>();

	private static LinkedHashMap<Integer, ArrayList<Object>> resetMenu = new LinkedHashMap<>();

	static {
		inventory.put("Cocoa", 10);
		inventory.put("Coffee", 10);
		inventory.put("Cream", 10);
		inventory.put("Decaf Coffee", 10);
		inventory.put("Espresso", 10);
		inventory.put("Foamed Milk", 10);
		inventory.put("Steamed Milk", 10);
		inventory.put("Sugar", 10);
		inventory.put("Whipped Cream", 10);

	}

	static {
		menu.put(1, new ArrayList<>());
		menu.put(2, new ArrayList<>());
		menu.put(3, new ArrayList<>());
		menu.put(4, new ArrayList<>());
		menu.put(5, new ArrayList<>());
		menu.put(6, new ArrayList<>());

		menu.get(1).add("Caffe Americano");
		menu.get(1).add("$3.30");
		menu.get(1).add(true);

		menu.get(2).add("Caffe Latte");
		menu.get(2).add("$2.55");
		menu.get(2).add(true);

		menu.get(3).add("Caffe Mocha");
		menu.get(3).add("$3.35");
		menu.get(3).add(true);

		menu.get(4).add("Cappuccino");
		menu.get(4).add("$3.30");
		menu.get(4).add(true);

		menu.get(5).add("Coffee");
		menu.get(5).add("$2.90");
		menu.get(5).add(true);

		menu.get(6).add("Decaf Coffee");
		menu.get(6).add("$2.75");
		menu.get(6).add(true);

	}

	static {
		restockInventory.put("Cocoa", 10);
		restockInventory.put("Coffee", 10);
		restockInventory.put("Cream", 10);
		restockInventory.put("Decaf Coffee", 10);
		restockInventory.put("Espresso", 10);
		restockInventory.put("Foamed Milk", 10);
		restockInventory.put("Steamed Milk", 10);
		restockInventory.put("Sugar", 10);
		restockInventory.put("Whipped Cream", 10);

	}

	static {
		resetMenu.put(1, new ArrayList<>());
		resetMenu.put(2, new ArrayList<>());
		resetMenu.put(3, new ArrayList<>());
		resetMenu.put(4, new ArrayList<>());
		resetMenu.put(5, new ArrayList<>());
		resetMenu.put(6, new ArrayList<>());

		resetMenu.get(1).add("Caffe Americano");
		resetMenu.get(1).add("$3.30");
		resetMenu.get(1).add(true);

		resetMenu.get(2).add("Caffe Latte");
		resetMenu.get(2).add("$2.55");
		resetMenu.get(2).add(true);

		resetMenu.get(3).add("Caffe Mocha");
		resetMenu.get(3).add("$3.35");
		resetMenu.get(3).add(true);

		resetMenu.get(4).add("Cappuccino");
		resetMenu.get(4).add("$3.30");
		resetMenu.get(4).add(true);

		resetMenu.get(5).add("Coffee");
		resetMenu.get(5).add("$2.90");
		resetMenu.get(5).add(true);

		resetMenu.get(6).add("Decaf Coffee");
		resetMenu.get(6).add("$2.75");
		resetMenu.get(6).add(true);

	}

	/*
	 * Author: @AmitTiwari - modifyOrder() method handles all the orders by user and
	 * its also update the inventory according to that.It is also check whether
	 * current inventory is enough to make the order
	 */

	public static void modifyOrder(int value) {

		System.out.println();

		if (value == 1) {

			if (inventory.get("Espresso") >= 3) {
				System.out.println("Dispensing: " + menu.get(value).get(0));
				System.out.println();

				inventory.put("Espresso", inventory.get("Espresso") - 3);

			} else {

				System.out.println("Out of stock: " + menu.get(value).get(0));
				System.out.println();

			}

		}

		else if (value == 2) {

			if (inventory.get("Espresso") >= 2 && inventory.get("Steamed Milk") >= 1) {
				System.out.println("Dispensing: " + menu.get(value).get(0));
				System.out.println();

				inventory.put("Espresso", inventory.get("Espresso") - 2);
				inventory.put("Steamed Milk", inventory.get("Steamed Milk") - 1);

			} else {

				System.out.println("Out of stock: " + menu.get(value).get(0));
				System.out.println();

			}

		}

		else if (value == 3) {

			if (inventory.get("Espresso") >= 1 && inventory.get("Cocoa") >= 1 && inventory.get("Steamed Milk") >= 1
					&& inventory.get("Whipped Cream") >= 1) {

				System.out.println("Dispensing: " + menu.get(value).get(0));
				System.out.println();

				inventory.put("Espresso", inventory.get("Espresso") - 1);
				inventory.put("Cocoa", inventory.get("Cocoa") - 1);
				inventory.put("Steamed Milk", inventory.get("Steamed Milk") - 1);
				inventory.put("Whipped Cream", inventory.get("Whipped Cream") - 1);

			} else {

				System.out.println("Out of stock: " + menu.get(value).get(0));
				System.out.println();

			}

		}

		else if (value == 4) {

			if (inventory.get("Espresso") >= 2 && inventory.get("Steamed Milk") >= 1
					&& inventory.get("Foamed Milk") >= 2) {

				System.out.println("Dispensing: " + menu.get(value).get(0));
				System.out.println();

				inventory.put("Espresso", inventory.get("Espresso") - 2);
				inventory.put("Steamed Milk", inventory.get("Steamed Milk") - 1);
				inventory.put("Foamed Milk", inventory.get("Foamed Milk") - 1);

			} else {

				System.out.println("Out of stock: " + menu.get(value).get(0));
				System.out.println();

			}

		} else if (value == 5) {

			if (inventory.get("Coffee") >= 3 && inventory.get("Sugar") >= 1 && inventory.get("Cream") >= 1) {

				System.out.println("Dispensing: " + menu.get(value).get(0));
				System.out.println();

				inventory.put("Coffee", inventory.get("Coffee") - 3);
				inventory.put("Sugar", inventory.get("Sugar") - 1);
				inventory.put("Cream", inventory.get("Cream") - 1);
			} else {

				System.out.println("Out of stock: " + menu.get(value).get(0));
				System.out.println();

			}

		}

		else if (value == 6) {

			if (inventory.get("Decaf Coffee") >= 3 && inventory.get("Sugar") >= 1 && inventory.get("Cream") >= 1) {

				System.out.println("Dispensing: " + menu.get(value).get(0));
				System.out.println();

				inventory.put("Decaf Coffee", inventory.get("Decaf Coffee") - 3);
				inventory.put("Sugar", inventory.get("Sugar") - 1);
				inventory.put("Cream", inventory.get("Cream") - 1);

			} else {

				System.out.println("Out of stock: " + menu.get(value).get(0));
				System.out.println();

			}

		}

		if (inventory.get("Espresso") < 3) {

			menu.get(1).set(2, false);

		}

		if (inventory.get("Espresso") < 2 || inventory.get("Steamed Milk") < 1) {
			menu.get(2).set(2, false);

		}
		if (inventory.get("Espresso") < 1 || inventory.get("Cocoa") < 1 || inventory.get("Steamed Milk") < 1
				|| inventory.get("Whipped Cream") < 1) {
			menu.get(3).set(2, false);

		}
		if (inventory.get("Espresso") < 2 || inventory.get("Steamed Milk") < 1 || inventory.get("Foamed Milk") < 2) {
			menu.get(4).set(2, false);

		}
		if (inventory.get("Coffee") < 3 || inventory.get("Sugar") < 1 || inventory.get("Cream") < 1) {
			menu.get(5).set(2, false);

		}
		if (inventory.get("Decaf Coffee") < 3 || inventory.get("Sugar") < 1 || inventory.get("Cream") < 1) {
			menu.get(6).set(2, false);

		}

		displayInventory();
		displayMenu();

	}

	/*
	 * Author: @AmitTiwari - restockInventory() This method is use to re-stock
	 * Inventory and Menu.
	 */
	public static void restockInventory() {

		inventory = new LinkedHashMap<>(restockInventory);
		menu = new LinkedHashMap<>(resetMenu);
		System.out.println("Inventory Restock Done!!!");

		System.out.println();
		System.out.println("Inventory: ");
		for (Map.Entry<String, Integer> m : inventory.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
		System.out.println();
		System.out.println("Menu: ");

		for (Map.Entry<Integer, ArrayList<Object>> m : menu.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

	/*
	 * Author: @AmitTiwari - displayInventory() This method is use to display
	 * Inventory
	 */

	public static void displayInventory() {
		System.out.println("Inventory: ");
		for (Map.Entry<String, Integer> m : inventory.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println();

	}

	/*
	 * Author: @AmitTiwari - displayMenu() This method is use to display Menu
	 */

	public static void displayMenu() {
		System.out.println("Menu: ");

		for (Map.Entry<Integer, ArrayList<Object>> m : menu.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println();

	}

	/*
	 * Author: @AmitTiwari - main() method int this method we are selecting are
	 * choices of operation we need to perform with Inventory.
	 */

	public static void main(String[] args) {

		displayInventory();
		displayMenu();

		Scanner scan = new Scanner(System.in);
		String choice;

		while (true) {
			choice = scan.nextLine();

			if (choice.isEmpty()) {
				continue;
			}

			if (choice.equals("R") || choice.equals("r")) {
				restockInventory();

			}

			else if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")
					|| choice.equals("5") || choice.equals("6")) {

				int value = Integer.parseInt(choice);
				modifyOrder(value);

			}

			else if (choice.equals("Q") || choice.equals("q")) {
				System.out.println("Quitting Application...");
				break;
			}

			else {
				System.out.println("Invalid selection: " + choice);
			}

		}

	}

}
