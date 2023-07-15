package Mainproject;
import java.util.Scanner;

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
