package week3.day2;
public class IntersectionOfTwoArrays {
	
	public static void main(String args[]) {
      int array1[] = {3,2,11,4,6,7};//Declare An array for {3,2,11,4,6,7};	 
      int array2[] = {1,2,8,4,9,7};//Declare another array for {1,2,8,4,9,7};
      System.out.println("Intersection of the two arrays :");
     
      for(int i = 0; i<array1.length; i++ ) {//Declare for loop iterator from 0 to array length
         for(int j = 0; j<array2.length; j++) {//Declare a nested for another array from 0 to array length
            if(array1[i]==array2[j]) {//Compare Both the arrays using a condition statement
               System.out.println(array1[i]);//Print the first array (shoud match item in both arrays)
            }
         }
      }
   }
}