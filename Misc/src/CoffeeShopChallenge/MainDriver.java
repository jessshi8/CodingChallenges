package CoffeeShopChallenge;

import java.util.ArrayDeque;
import java.util.List;

public class MainDriver {
	public static void main(String[] args) {
		CoffeeShop coffeeShop = new CoffeeShop("Java Coffee", new MenuItem[10], new ArrayDeque<String>());
		
		MenuItem cafeLatte = new MenuItem("Cafe Latte", "Drink", 4.25);
		MenuItem cafeMocha = new MenuItem("Cafe Mocha", "Drink", 4.85);
		MenuItem espresso = new MenuItem("Espresso", "Drink", 2.50);
		MenuItem americano = new MenuItem("Americano", "Drink", 2.95);
		MenuItem cappuccino = new MenuItem("Cappuccino", "Drink", 3.50);
		MenuItem macchiato = new MenuItem("Macchiato", "Drink", 2.50);
		MenuItem brownie = new MenuItem("Brownie", "Food", 2.35);
		MenuItem cookie = new MenuItem("Cookie", "Food", 1.95);
		MenuItem sandwich = new MenuItem("Sandwich", "Food", 3.75);
		MenuItem panini = new MenuItem("Panini", "Food", 6.45);
		
		coffeeShop.setMenu(new MenuItem[]{cafeLatte, cafeMocha, espresso, americano, 
			cappuccino, macchiato, brownie, cookie, sandwich, panini});
		System.out.println("========================");
		
		// Returns cheapest item on menu (should be Cookie)
		String cheapest = coffeeShop.cheapestItem();
		System.out.println("Cheapest Item: " + cheapest);
		System.out.println("========================");
		
		// Returns drink-only items from menu
		List<String> drinks = coffeeShop.drinksOnly();
		System.out.println("Drinks:");
		for (String d : drinks) {
			System.out.println(d);
		}
		System.out.println("========================");
		
		// Returns food-only items from menu
		List<String> food = coffeeShop.foodOnly();
		System.out.println("Food:");
		for (String f : food) {
			System.out.println(f);
		}
		System.out.println("========================");
		
		// Lists orders taken (should be empty) and attempts to fulfill an order
		System.out.println("Orders taken: " + coffeeShop.listOrders());
		System.out.println(coffeeShop.fulfillOrder());
		System.out.println("========================");
		
		// Adding a few orders 
		System.out.println(coffeeShop.addOrder("Water")); // Not in menu
		System.out.println(coffeeShop.addOrder("Cookie"));
		System.out.println(coffeeShop.addOrder("Cafe Latte"));
		System.out.println(coffeeShop.addOrder("Panini"));
		System.out.println("========================");
		
		// Lists orders taken and returns amount due
		System.out.println("Orders taken: " + coffeeShop.listOrders());
		System.out.format("Amount due: $%.2f\n", coffeeShop.dueAmount());
		System.out.println("========================");
		
		// Fulfills an order, returns remaining orders and amount due
		System.out.println(coffeeShop.fulfillOrder());
		System.out.println("Orders remaining: " + coffeeShop.listOrders());
		System.out.format("Amount due: $%.2f\n", coffeeShop.dueAmount());
		System.out.println("========================");
		
		// Fulfills all orders
		while(coffeeShop.getOrders().size() != 0) {
			System.out.println(coffeeShop.fulfillOrder());
		}
		System.out.println(coffeeShop.fulfillOrder());
		System.out.println("Orders remaining: " + coffeeShop.listOrders());
		System.out.format("Amount due: $%.2f\n", coffeeShop.dueAmount());
		System.out.println("========================");
	}
}
