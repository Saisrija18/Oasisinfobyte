import java.util.*;
public class Main {
        String User;
        String Password;
        String Name;
        String AccountNo;
        float balance=0;
        int Transactions=0;
        String TransactionsHistory="";
        public void register()
		{
		    Scanner in=new Scanner(System.in);
		    System.out.println("Enter your Name: ");
		    this.Name=in.nextLine();
		    System.out.println("Enter Account Number:");
		    this.AccountNo=in.nextLine();
		    System.out.println("Enter your User:");
		    this.User=in.nextLine();
		    System.out.println("Enter Password:");
		    this.Password=in.nextLine();
		    System.out.println();
		    System.out.println("Registration completed");
		}
		public void login(){
		    int flag=0;
		    Scanner in=new Scanner(System.in);
		    while(flag==0){
		        System.out.println("Enter your User:");
		        String User=in.nextLine();
		        if(User.equals(User)){
		            System.out.println("\nEnter Password:");
		            String Pass=in.nextLine();
		            if(Pass.equals(Password)){
		                System.out.println("\nLogin successfull");
		                flag=1;
		            }
		            else
		            System.out.println("\nIncorrect Password");
		        }
		        else
		        System.out.println("\n User not Found");
		        
		    }
		}
		public void deposit(){
		    Scanner in=new Scanner(System.in);
		     System.out.println("\nEnter the money you want to deposit money:");
			float Amount=in.nextFloat();
			if(Amount>0){
			    balance=balance+Amount;
			    System.out.println("\n Amount successfully deposited");
			Transactions++;
			String tran=Amount+"deposited\n";
			TransactionsHistory=TransactionsHistory.concat(tran);
			}
			else
			System.out.println("Enter valid Amount to be deposited\n");
		
		}
		public void withdraw(){
		     Scanner in=new Scanner(System.in);
		     System.out.println("\nEnter the money you would like to withdraw");
			float Amount=in.nextFloat();
			if(balance>=Amount){
			    balance=balance-Amount;
			    System.out.println("\n withdraw successfull");
			Transactions++;
			String tran=Amount+"withdraw from your Account\n";
			TransactionsHistory= TransactionsHistory.concat(tran);
			}
			else
			System.out.println("\n Insufficient Balance");
		}
		
		public void transfer(){
		    Scanner in=new Scanner(System.in);
		     System.out.println("\nEnter Receipent's Name:");
			String rec=in.nextLine();
			System.out.println("\nEnter Amount to transfer:");
			float Amount=in.nextFloat();
			if(Amount<=balance){
			    balance=balance-Amount;
			    System.out.println("\n successfully transfered");
			Transactions++;
			String tran=Amount+"transfered to"+rec+"\n";
			TransactionsHistory=TransactionsHistory.concat(tran);
			}
			else
			System.out.println("\n Insufficient balance\n");
		}
		public void checkbalance(){
		    System.out.println("your account balance is"+balance+"\n");
		}
		public void TransactionsHistory(){
		    System.out.println("\n"+TransactionsHistory);
		}
		public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    System.out.println("\n WELCOME TO THE ATM SYSTEM");
		    System.out.println();
		    System.out.println();
		    System.out.println(" ENTER:1)register\n      2)exit");
		    System.out.println("\nEnter your preference");
		    int input=in.nextInt();
		    if(input==1){
		    Main ba = new Main();
		    ba.register();
		    System.out.println();
		    System.out.println("enter the login details:");
		    ba.login();
		    boolean exit=false;
		    while(!exit){
		     System.out.println("1.Withdraw cash ");
			System.out.println("2.Deposit money");
			System.out.println("3.Transfer money");
			System.out.println("4.Balance ");
			System.out.println("5.Transactions History");
			System.out.println("6.Exit");
			System.out.println("\nEnter your preference");
			System.out.println("Enter your option ");
			int x=in.nextInt();
			if(x<7 && x>0){
			switch(x) 
			{
			case 1: ba.withdraw();
			        break;
			case 2: ba.deposit();
				break;
		    case 3: ba.transfer();
				break;
			case 4: ba.checkbalance();
			    break;
			    case 5:ba.TransactionsHistory();
			    break;
			    case 6:exit=true;
			    break;
			}
			}
		}
		}
    }		
}
