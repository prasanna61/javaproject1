# javaproject1
#First execute CarModels.java
#then CarSelected.java and after that execute Carprice.java




#otherwise execute below code

import java.util.Scanner;
import java.lang.Math;
public class CarInformation {
    public static void main(String[] args) {
        String [] Car_models= {"Polo Trendline","Polo Highline","Virtus Trendline","Virtus Highline","Taigun Trendline","Taigun Highline","Taigun Topline"};
		System.out.println("carmodels are");
        for(int i=0;i<Car_models.length;i++)
		{
			System.out.println(Car_models[i]);
        }	
    }
}
class SelectedCar  extends CarInformation{
	int cost;
	
	public int Price() {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Select the car model : ");
	String model=sc.nextLine();
	switch(model) {
	case "Polo Trendline"->cost=870000;
	case "Polo Highline"->cost=1009000;
	case "Virtus Trendline"->cost=1105000;
	case "Virtus Highline"->cost=1308000;
	case "Taigun Trendline"->cost=1489000;
	case "Taigun Highline"->cost=1542000;
	case "Taigun Topline"->cost=1771000;
	default->cost=0;
	}
	return cost;
	
	}    
}

class PriceOfCar extends SelectedCar {
	int dis;
	int ins;
	int access;
	private final int rto = 113990;
	private final int tcs_char = 11000;
	int total_amount;
	Scanner sc = new Scanner(System.in);

	public void discount() {
		System.out.println("Enter discount type whether percentage or amount");
		String dis_type = sc.next();
		if (dis_type.equals("percentage")) {
			System.out.println("Enter discount : ");
			int dis_perc = sc.nextInt();
			double dis_val = (cost * dis_perc) / 100;
			int dis_amount = (int) (dis_val);
			dis = Math.min(dis_amount, 30000);

		} else {
			System.out.println("Enter discount : ");
			dis = Math.min(sc.nextInt(), 30000);
		}

	}

	public void totalCost() {
		total_amount = (cost + rto + ins + tcs_char + access) - dis;
		System.out.println("Total cost: " + total_amount);

	}

	public void accessoriesAndinsurence() {
		System.out.print("Do you need insurence: ");
		String Insurence_need = sc.next();
		System.out.println();
		System.out.print("Do you need Additional Accessories: ");
		String accessories_need = sc.next();
		if (Insurence_need.equals("no") && accessories_need.equals("no")) {
			discount();
			ins= 0;
			access = 0;
			totalCost();

		} else if (Insurence_need.equals("no") && accessories_need.equals("yes")) {
			discount();
			ins = 0;
			access = 15000;
			totalCost();

		} else if (Insurence_need.equals("yes") && accessories_need.equals("no")) {
			discount();
			ins= 47300;
			access= 0;
			totalCost();
		} else {
			discount();
			ins = 47300;
			access= 15000;
			totalCost();

		}
	}

	public static void main(String args[]) {
		PriceOfCar c = new PriceOfCar();
		//c.model();
		c.Price();
		c.accessoriesAndinsurence();

	}

}
