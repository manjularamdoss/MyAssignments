package collectionsprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
	
		
	Set<Integer>data1=new TreeSet<Integer>();
	
	for(int i=0;i<data.length;i++)
	{
		data1.add(data[i]);	
	
	}
	System.out.println("sorted data");
	System.out.println(data1);
	
	List<Integer>list=new ArrayList<Integer>(data1);
	int second=list.get(list.size()-2);
	
	System.out.println("Second Largest number:" +second);
	}
}