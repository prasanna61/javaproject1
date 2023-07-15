# javaproject1
#First execute CarModels.java
#then CarSelected.java and after that execute Carprice.java




#otherwise execute below code

import java.util.Scanner;
import java.lang.Math;
public class CarModels {
    public static void main(String[] args) {
        String [] model= {"Polo Trendline","Polo Highline","Virtus Trendline","Virtus Highline","Taigun Trendline","Taigun Highline","Taigun Topline"};
		System.out.println("carmodels are");
        for(int i=0;i<model.length;i++)
		{
			System.out.println(model[i]);
        }	
    }
}
public class CarSelected  extends CarModels{
	int cost;
	
	public int carPrice() {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Select car model : ");
	String carmodel=sc.nextLine();
	switch(carmodel) {
	case "Polo Trendline":
		cost=870000;
		break;
	
	case "Polo Highline":
		cost=1009000;
		break;
	case "Virtus Trendline":
		cost=1105000;
		break;
	case "Virtus Highline":
		cost=1308000;
		break;
	case "Taigun Trendline":
		cost=1489000;
		break;
	case "Taigun Highline":
		cost=1542000;
		break;
	case "Taigun Topline":
		cost=1771000;
		break;
	default:
		System.out.println("Enter valid car model");
		cost=0;
		break;
	}
	return cost;
	
	}    
}

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
