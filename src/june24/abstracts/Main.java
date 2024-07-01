package june24.abstracts;

public class Main {

	public static void main(String[] args) {
		
		SavingAccount s = new SavingAccount () ;
		
		s.typeOfAccount();
		s.calculateInterest();
		
		System.out.println();
		
		
		CheckingAccount c = new CheckingAccount ();
		
		c.bankAccount();
		System.out.println();
		
		c.calculateInterest() ;
		
				

	}

}
