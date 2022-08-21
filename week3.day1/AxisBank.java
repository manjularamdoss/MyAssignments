package bank;

public class AxisBank extends BankInfo {

	public void deposit() {
		super.deposit();
		System.out.println("AxisBank Deposit");

	}
	public static void main(String[] args) {
		AxisBank obj= new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();
	
}
}