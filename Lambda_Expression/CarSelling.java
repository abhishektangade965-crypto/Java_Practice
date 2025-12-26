package Lambda_Expression;


import java.util.function.Predicate;

record car(String brand, Double Price, Integer mileage)
{

	public static boolean test(car c) {
		// TODO Auto-generated method stub
		return true;
	}

	
	
}


public class CarSelling {

	public static void main(String[] args) 
	{
		
		String brand=IO.readln("Enter the brand name of the Car : ");
		Double Price=Double.parseDouble(IO.readln("Enter the price of the Car : "));
		Integer mileage= Integer.parseInt(IO.readln("Enter the mileage of the Car : "));
		
		Predicate<String> Car = C -> Price < 500000 && mileage < 20;
				
		car c = new car(brand, Price, mileage);
		if(car.test(c))
		{
			IO.println(brand+"is eligible for sale");
		}
		
		else IO.println(brand+"is Not eligible for sale");
	}

}



