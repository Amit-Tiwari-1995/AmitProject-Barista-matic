package com.demo.amit;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultMenuInventory {

	public static void defaultInventoryMenuDisplay() {

		LinkedHashMap<String, Integer> defaultInventory = new LinkedHashMap<>();

		LinkedHashMap<Integer, ArrayList> defaultMenu = new LinkedHashMap<>();

		defaultInventory.put("Cocoa", 10);
		defaultInventory.put("Coffee", 10);
		defaultInventory.put("Cream", 10);
		defaultInventory.put("Cocoa", 10);
		defaultInventory.put("Decaf Coffee", 10);
		defaultInventory.put("Espresso", 10);
		defaultInventory.put("Foamed Milk", 10);
		defaultInventory.put("Steamed Milk", 10);
		defaultInventory.put("Sugar", 10);
		defaultInventory.put("Whipped Cream", 10);
		
		defaultMenu.put(1, new ArrayList<>());
		defaultMenu.put(2, new ArrayList<>());
		defaultMenu.put(3, new ArrayList<>());
		defaultMenu.put(4, new ArrayList<>());
		defaultMenu.put(5, new ArrayList<>());
		defaultMenu.put(6, new ArrayList<>());

		defaultMenu.get(1).add("Caffe Americano");
		defaultMenu.get(1).add(3.30);
		defaultMenu.get(1).add(true);

		defaultMenu.get(2).add("Caffe Latte");
		defaultMenu.get(2).add(2.55);
		defaultMenu.get(2).add(true);

		defaultMenu.get(3).add("Caffe Mocha");
		defaultMenu.get(3).add(3.35);
		defaultMenu.get(3).add(true);

		defaultMenu.get(4).add("Caffe Americano");
		defaultMenu.get(4).add(3.30);
		defaultMenu.get(4).add(true);

		defaultMenu.get(5).add("Cappuccino");
		defaultMenu.get(5).add(2.90);
		defaultMenu.get(5).add(true);

		defaultMenu.get(6).add("Decaf Coffee");
		defaultMenu.get(6).add(2.75);
		defaultMenu.get(6).add(true);
		
		System.out.println("Inventory: ");
		
		for(Map.Entry<String, Integer> m : defaultInventory.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		System.out.println();
		

		System.out.println("Menu: ");
		
		for(Map.Entry<Integer, ArrayList> m : defaultMenu.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
			
		}


		
		
		

	}

}
