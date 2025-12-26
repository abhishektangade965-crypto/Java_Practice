
import java.util.function.Consumer;






public class ValueModifier {

	public static void modifyValue (int value, Consumer<Integer> consumer)
	{
		consumer.accept(value);
	}
	public static void main(String[] args)
	{
		Integer i= Integer.parseInt(IO.readln("Original value: "));
		Consumer<Integer> D = D1 -> IO.println("After doubling the value:"+(D1*D1));
		Consumer <Integer> I = I1 -> IO.println("After incrementing the value by 3:"+(I1+3));	
		Consumer <Integer> S = S1 -> IO.println("After squaring the value:"+S1*S1);

	
	modifyValue(i,D);
	modifyValue(i,I);
	
	
	if(i > 0) 
	{
		modifyValue(i,S);
	}
	
	}

}

