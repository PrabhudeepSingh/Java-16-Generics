//This program shows the Communication of Generic Code with Non-Generic Code.
import java.util.*;
class GenericDemo3
{
	public static void main(String[] args)
	{	
		//Generic Area Starts
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		//arrayList.add(10); -> CE: incompatible DataTypes.
		mth(arrayList);
		System.out.println(arrayList);
		//arrayList.add(10); -> CE: incompatible DataTypes.	
		//Generic Area Ends
	}
	
	public static void mth(ArrayList arrList)
	{
		//Non-Generic Area Starts
		arrList.add(10);
		arrList.add(10.5);
		arrList.add(true);
		//Non-Generic Area Ends
	}
}