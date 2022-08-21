package college;

public class department extends College{

	   public void id() {
		   super.id();
			System.out.println("Department id is 10");
		}
		
		public void name(String name) {
			System.out.println(name);
		}
		
		
		public static void main(String[] args) {
			
			department overriding=new department();
			
			overriding.id();
			overriding.name("Information Technology");
	}

}
