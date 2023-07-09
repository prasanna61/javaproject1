package Miniproject;

import java.util.Scanner;
import java.lang.Math;

public class CarPrice extends CarSelected {
	int discount;
	int insurence;
	int accessories;
	private final int rto = 113990;
	private final int tcs_charges = 11000;
	int total_cost;
	Scanner sc = new Scanner(System.in);

	public void discount_amount() {
		System.out.println("Enter discount type");
		String discount_type = sc.next();
		if (discount_type.equals("percentage")) {
			System.out.println("Enter discount : ");
			int discount_percentage = sc.nextInt();
			double discount_value = (cost * discount_percentage) / 100;
			int discount_amount = (int) (discount_value);
			discount = Math.min(discount_amount, 30000);

		} else {
			System.out.println("Enter discount : ");
			discount = Math.min(sc.nextInt(), 30000);
		}

	}

	public void totalCost() {
		total_cost = (cost + rto + insurence + tcs_charges + accessories) - discount;
		System.out.println("Total cost: " + total_cost);

	}

	public void accessoriesAndinsurence() {
		System.out.print("Do you need insurence: ");
		String Insurence_need = sc.next();
		System.out.println();
		System.out.print("Do you need Additional Accessories: ");
		String accessories_need = sc.next();
		if (Insurence_need.equals("no") && accessories_need.equals("no")) {
			discount_amount();
			insurence = 0;
			accessories = 0;
			totalCost();

		} else if (Insurence_need.equals("no") && accessories_need.equals("yes")) {
			discount_amount();
			insurence = 0;
			accessories = 15000;
			totalCost();

		} else if (Insurence_need.equals("yes") && accessories_need.equals("no")) {
			discount_amount();
			insurence = 47300;
			accessories = 0;
			totalCost();
		} else {
			discount_amount();
			insurence = 47300;
			accessories = 15000;
			totalCost();

		}
	}

	public static void main(String args[]) {
		CarPrice c = new CarPrice();
		c.model();
		c.carPrice();
		c.accessoriesAndinsurence();

	}

}
