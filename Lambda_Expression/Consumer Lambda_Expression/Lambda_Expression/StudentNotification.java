

import java.util.function.Consumer;

record Student(Integer id, String name, String course)
{
	
}


public class StudentNotification 
{

	public static void main(String[] args) 
	{
		Integer st= Integer.parseInt(IO.readln("Enter number of students:"));
		
		for(int i=1; i<=st; i++)
		{
			int id= Integer.parseInt(IO.readln("Enter ID:"));
			String name= IO.readln("Enter Name:");
			String course= IO.readln("Enter Course:");
			
			Student student = new Student(id, name, course); 
			
			Consumer<Student> S = S1 ->
			{
				IO.println("Hello "+name+"! Welcome to the "+course+" course.\n");
			};
			S.accept(student);
		
		}
		
		

}

}
