import java.util.Scanner;
class ATM{
	String name,password,username;
	int accountNo;
public void register()
 {
	
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your Name :-");
        this.name = sc.nextLine();
        System.out.println("\nEnter your Username :-");
        this.username = sc.nextLine();
        System.out.println("\nEnter your Password :-");
        this.password = sc.nextLine();
        System.out.println("\nEnetr Your Account Number :-");
        this.accountNo = sc.nextInt();
        System.out.println("\n Registration Completed... Now You Can Login...");

    }

    public boolean Login() {
        boolean isLogin = false;
        Scanner sc = new Scanner(System.in);
        while (!isLogin) {
            System.out.println("\nEnter Your Username :- ");
            String Username = sc.nextLine();
            if (Username.equals(Username)) {
                while (!isLogin) {
                    System.out.println("\nEnter Your Password :- ");
                    String Password = sc.nextLine();
                    if (Password.equals(password)) {
                        System.out.println("\nLogin Successful!!");
                        isLogin = true;
                    } else {
                        System.out.println("\nIncorrect Password");
                    }
                }
            } else {
                System.out.println("\nUsername not found");
            }
        }
        return isLogin;

    }
}
	
public class ATM_Transaction
{ 
    int balance = 500000, withdraw, deposit,transaction=0;
	String transactionHistory = "";
    public static void main(String args[] )
    { 
	    ATM a=new ATM();
	     a.register();
		 a.Login();
		
        int balance = 500000, withdraw, deposit,transaction=0;
		String transactionHistory = "";
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Transaction History");
			System.out.println("Choose 5 for Quit:");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
					transactionHistory = transactionHistory.concat("str");
					transaction++;
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
			    transactionHistory = transactionHistory.concat("str");
				transaction++;
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
				
				case 4:
				System.out.println("Transaction History:");
				
                if (transaction == 0) 
				{
                    System.out.println("\n Empty ");
                 }
				 else
					 {
                       System.out.println("\n" + transactionHistory);
                   }
				
				
 
                case 5:
                System.exit(0);
            }
        }
    }
}
