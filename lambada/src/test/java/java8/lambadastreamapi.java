package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambadastreamapi {
	public static void main(String args[])
	{
		

	List<String> strList= Arrays.asList("abc","adarsh","sai","abc","aruhi","jon","acd","atr");
	System.out.println("string starts with a and lenght is 3");
	List<String> list2 = filters(strList);
	for(String i:list2)
	
		System.out.println(i);
	


	}
	public static List<String> filters(List <String> l1)
	{
		return l1.stream().filter((str)->str.startsWith("a")&&str.length()==3).collect(Collectors.toList());
	}
}
