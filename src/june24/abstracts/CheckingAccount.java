package june24.abstracts;

public class CheckingAccount extends BankAccount {

	
		public void bankAccount () {
		
		System.out.println("Your Bank Balance is :"+" Rs.200000 ");
	}

		@Override
		public void calculateInterest() {
		System.out.println("Your Interest is :"+" 3% ");
		}

}
