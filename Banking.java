
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BankAccount ba1 = new BankAccount(1001, "Rakesh", 100000, "8490047711");
		BankAccount ba2 = new BankAccount(1002, "Jay", 0, "7777766666");
		System.out.println(ba1);
		System.out.println("====================");
		
		BankAdmin bankAdmin = new BankAdmin();
		bankAdmin.authorizedToChangeMobile(ba1, "9998887776");
		bankAdmin.authorizedToChangeAcctName(ba1, "Mahesh");
		bankAdmin.authorizedToDeposit(ba1, 20000);
		bankAdmin.authorizedToWithdraw(ba1, 10000);
		bankAdmin.authorizedToTransferBalance(ba1, ba2, 50000);
		System.out.println(ba1.getAccountHolderName());
		System.out.println(ba2.toString());
		
		
	}

}
