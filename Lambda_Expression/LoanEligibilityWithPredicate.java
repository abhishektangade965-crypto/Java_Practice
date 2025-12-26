package Lambda_Expression;



import java.util.function.Predicate;

record Customer (String name, Double salary, Integer creditScore, Integer Age)
{
	public boolean checkLoanEligibility()
	{
		if(salary > 25000 && creditScore > 700 && Age > 21)
		{
			return true;
		}
		else return false;
		
	}
}




public class LoanEligibilityWithPredicate 
{

	public static void main(String[] args) 

	{
		String name = IO.readln("Enter Customer Name:");
		Double sal =Double.parseDouble(IO.readln("Enter Salary: "));
		Integer Credit =Integer.parseInt(IO.readln("Enter Credit Score: "));
		Integer Age =Integer.parseInt(IO.readln("Enter Your Age : "));
		
		Customer c1 = new Customer(name, sal, Credit, Age);
		
		Predicate <Customer> cust = C -> 
		{
			return C.checkLoanEligibility();
		};
		
		if(cust.test(c1))
		{
			IO.println(name+" is Eligible for Loan...");
		}
		else IO.println(name+" is Not Eligible for Loan..");
		
	}

}



