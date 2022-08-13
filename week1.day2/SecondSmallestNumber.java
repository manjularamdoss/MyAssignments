package week1.day2;
import java.util.Arrays;

	public class SecondSmallestNumber {

		public static void main(String[] args) {
			int[] n= {23,45,67,32,89,22};
			int length = n.length;
			System.out.println("length is "+length);
			Arrays.sort(n);
			System.out.println("Second Smallest Number is "+n[length-5]);
				
		}

	}

