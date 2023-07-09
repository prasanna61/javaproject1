import java.util.Scanner;

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

