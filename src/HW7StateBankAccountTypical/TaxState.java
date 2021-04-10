package HW7StateBankAccountTypical;

public class TaxState extends State{
	private boolean taxStateFlag = false;

	 public TaxState( ){
	   state = TAXSTATE;
   }

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if( amount>0 ){
	           balance = context.getBalance();
	           balance = balance + amount*(1-BankContext.TRANS_FEE_TAX);
	           context.updateBalance(balance);
	           changeState();
		     }
		     else{
			   System.out.println("Deposit amount cannot be 0 or negative");
		    }
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if( amount>0 ){
			 if ((context.getBalance() - amount) > BankContext.OVERDRAW_LIMIT) {
				balance = context.getBalance();
				balance = balance - amount;
				context.updateBalance(balance);
				changeState();
			  }
			  else{
				 taxStateFlag = true;
			  }
	      }
	      else{
		  	  System.out.println("withdraw amount cannot be 0 or negative");
		  }

	}

	@Override
	public boolean isOverDrawnLimitReached() {
		// TODO Auto-generated method stub
		return false;
	}

}
