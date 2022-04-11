import java.util.*;
public class Account {
    static int accno=10001;
    int amount;
     public Account()
     {
         amount=1000;
         //System.out.println("Account no: "+accno);
         accno++;
     }

     public void Display()
     {
        System.out.println("Account No: "+accno);
        System.out.println("Current Balance: "+amount);
     }

     public void CurrentBalance()
     {
        System.out.println("Current Balance: "+amount);
     }

     public void withdraw(int x)
     {
        if(amount<=x)
        {
            System.out.println("Cannot Withdraw");
        }
        else{
            amount=amount-x;
            System.out.println("Amount Withdrawn: "+x);
            CurrentBalance();
        }
     }

     public void deposit(int x)
     {
         if(x==0)
         {
             System.out.println("Cannot Deposit");
         }
         else{
             amount=amount+x;
             System.out.println("Amount Deposited: "+x);
             CurrentBalance();
         }
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         //int amt = sc.nextInt();
         System.out.println("1.Deposit  2.Withdraw  3.Current Balance  4.Display Account Details");
         int choice=sc.nextInt();
         Account a = new Account();
         switch(choice)
         {
             case 1:
                int amt=sc.nextInt();
                a.deposit(amt);
                break;

            case 2:
                int wtd=sc.nextInt();
                a.withdraw(wtd);
                break;

            case 3:
                a.CurrentBalance();
                break;

            case 4:
                a.Display();
                break;
         }
     }
}
