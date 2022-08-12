package week1.day2;

public class PrimeOrNot {
	
	public static void main(String[] args) {
			
	    int a = 13;
	    boolean flag = false;
	    for (int i=2; i<=a/2; i++) {
		if (a % i ==0 ) {
			flag = true;
			break;
		}
		
	}
	    if(flag != true) {
		System.out.println("It is a Prime Number");
	}
	    else
	{
		System.out.println("It is not a Prime Number");
	}
	}

	}
