
public class BankAdmin {
	
	void authorizedToChangeMobile(BankAccount ref, String newNumber)
	{
		ref.setMobileNumber(newNumber);
		System.out.println("Mobile No. Changed..");
	}
	
	void authorizedToChangeAcctName(BankAccount ref, String newName)
	{
		ref.setAccountHolderName(newName);
		System.out.println("New Name Chages..");
	}
	
	void authorizedToDeposit(BankAccount ref, double amtDep)
	{
		double currentBalance = ref.getAccountBalance();
		double newBalance = currentBalance + amtDep;
		ref.setAccountBalance(newBalance);
		System.out.println("New Balance added..");
	}
	
	void authorizedToWithdraw(BankAccount ref, double amtWithdraw)
	{
		double currentBalance = ref.getAccountBalance();
		double newBalance = currentBalance - amtWithdraw;
		ref.setAccountBalance(newBalance);
		System.out.println("Amount Withdrawn..");
	}
	
	void authorizedToTransferBalance(BankAccount src,BankAccount trg, double amtToTransfer)
	{
		double srcBalance = src.getAccountBalance() - amtToTransfer;
		double trgBalance = trg.getAccountBalance() + amtToTransfer;
		src.setAccountBalance(srcBalance);
		trg.setAccountBalance(trgBalance);
		System.out.println("Mobile No. Changed..");
	}
	

}
