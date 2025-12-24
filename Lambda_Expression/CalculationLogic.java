package Lambda_Expression;

import java.util.function.Predicate;

class Calculate
{

}

public class CalculationLogic {

	public static void main(String[] args)
	{
		Predicate  <Integer> p1= num -> num%2==0;
		int num= Integer.parseInt(IO.readln("Enter the Number :"));
		IO.println("Number is "+num+"  Even :"+p1.test(num));
		
		Predicate <Integer> p2= GT -> num >= 10;
		int GT=10;
		IO.println("Number "+num+" is  Greater Than 10 :"+p2.test(GT));

		Predicate <Integer> p3= Num ->{
		 int count=0;
		 
		 for(int i=2; i<num/2; i++)
		 {
			 if(num%i==0)
			 {
				 count++;
			 }
		 }
		 if (count==0)
		 {
			 return true;
		 }
		 return false;
		 
		};
		IO.println("Number  "+num+" is Prime : "+testPredicate(num,p3));
	}



public static boolean testPredicate (int i, Predicate <Integer> p)
{
	return p.test(i);
	
}

}





