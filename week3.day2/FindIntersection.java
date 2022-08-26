package collectionsprograms;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	
	public static void main(String[] args) {
		int[] a= {3,2,11,4,6,7};//Declare An Array for {3,2,11,4,6,7};	
		int[] b= {1,2,8,4,9,7};//Declare another Array for {1,2,8,4,9,7};

		List<Integer> arrayList1=new ArrayList<Integer>();//create a two empty Lists - list1 & list2
		for(int i:a)
			arrayList1.add(i);//Declare for loop iterator from 0 to array a.length and add into list1
		List<Integer> arrayList2=new ArrayList<Integer>();
		for(int i:b)
			arrayList2.add(i);//Declare for loop iterator from 0 to array b.length and add into another list2
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<b.length;j++) {
				 if(a[i]==b[j]) {//Compare Both list1 & list2 using a nested for loop
					 System.out.println(a[i]);//Print the matching number
				 }
			 }
		 }
	}
	}
		
		 
		