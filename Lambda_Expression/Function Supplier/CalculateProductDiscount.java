import java.util.function.Function;

record Product (Integer id, String name, Double Price)
{
	
}




public class CalculateProductDiscount
{

	public static void main(String[] args) 
	{
		Integer id= Integer.parseInt(IO.readln("Enter Product Id :"));
		String name =IO.readln("Enter Product Name :");
		Double Price= Double.parseDouble(IO.readln("Enter Product Price :"));
	
		Product p = new Product(id, name, Price);
		
	Function<Product, Double> P = P1 ->  
	{
		if(P1.Price()>=5000)
		{
			return p.Price()-p.Price()*0.10;
			
		}
		else if (P1.Price()<5000)
		{
			return p.Price()-p.Price()*0.05;
		}
		 return Price;
	};
	
	IO.println("Final Price is : "+P.apply(p));
	
	
	
	
	
	}

}
