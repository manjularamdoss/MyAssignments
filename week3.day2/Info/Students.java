package student.Info;

public class Students {
	
		public void getStudentInfo(int id) {
			System.out.println(id);

		}
		public void getStudentInfo(int id, String name) {
			System.out.println(id);
			System.out.println(name);
		
		}
		public void getStudentInfo(String email,long phoneNumber) {
			System.out.println(email);
			System.out.println(phoneNumber);
		
		}

		public static void main(String[] args) {
		Students  obj =new Students();
		obj.getStudentInfo(11);
		obj.getStudentInfo(11, "Manjula");
		obj.getStudentInfo("manjulam.2410@gmail.com", 1234567890);

		}

	}

