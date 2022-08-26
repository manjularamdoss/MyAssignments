package collectionsprograms;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	public class MissingNumber {

		public static void main(String[] args) {

			int[] arr = {1,3,4,5,7,6,8,9,10};
			Arrays.sort(arr);
			 List<Integer>newlist=new ArrayList<Integer>();
			 for (int i = 1; i < arr.length; i++) {
				 newlist.add(arr[i]);
				 if(i!=arr[i-1]) {
					 System.out.println("Missing number from 1 to 10 is : "+ i);
					
		             break;
			}
			
			 }
		}
	}