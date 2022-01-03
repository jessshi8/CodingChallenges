package CoffeeShopChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class CoffeeShop {
	
	private String name;
	private MenuItem[] menu;
	private Queue<String> orders;
	
	public CoffeeShop() {
		// TODO Auto-generated constructor stub
	}
	
	public CoffeeShop(String name, MenuItem[] menu, Queue<String> orders) {
		super();
		this.name = name;
		this.menu = menu;
		this.orders = orders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MenuItem[] getMenu() {
		return menu;
	}

	public void setMenu(MenuItem[] menu) {
		this.menu = menu;
	}

	public Queue<String> getOrders() {
		return orders;
	}

	public void setOrders(Queue<String> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "CoffeeShop [name=" + name + ", menu=" + Arrays.toString(menu) + ", orders=" + orders
				+ "]";
	}

	public String addOrder(String name) {
		int currSize = this.getOrders().size();
		for (MenuItem m : menu) {
			if (m.getItem().equals(name)) {
				this.getOrders().add(name);
			}
		}
		if (this.getOrders().size() == currSize) {
			return "This item is currently unavailable";
		} else {
			return "Order for " + name + " was placed";
		}
	}
	
	public String fulfillOrder() {
		if (this.getOrders().size() == 0) {
			return "All orders have been fulfilled!";
		} else {
			String readyOrder = this.getOrders().poll();
			return "The [" + readyOrder + "] is ready!";
		}	
	}
	
	public Queue<String> listOrders() {
		return this.getOrders();
	}
	
	public double dueAmount() {
		double amount = 0;
		if (this.getOrders().size() == 0) {
			return 0;
		} else {
			for (String s : this.getOrders()) {
				for (MenuItem m : this.getMenu()) {
					if (m.getItem().equals(s)) {
						amount += m.getPrice();
					}
				}
			}
			return amount;
		}
	}
	
	public String cheapestItem() {
		double minPrice = Integer.MAX_VALUE;
		String item = "";
		for (MenuItem m : this.getMenu()) {
			if (m.getPrice() < minPrice) {
				minPrice = m.getPrice();
				item = m.getItem();
			}
		}
		return item;
	}
	
	public List<String> drinksOnly() {
		List<String> drinkMenu = new ArrayList<String>();
		for (MenuItem m : this.getMenu()) {
			if (m.getType().equals("Drink")) {
				drinkMenu.add(m.getItem());
			}
		}
		return drinkMenu;
	}
	
	public List<String> foodOnly() {
		List<String> foodMenu = new ArrayList<String>();
		for (MenuItem m : this.getMenu()) {
			if (m.getType().equals("Food")) {
				foodMenu.add(m.getItem());
			}
		}
		return foodMenu;
	}
}
