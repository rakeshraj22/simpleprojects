package accountmanagemnet;
import java.util.Scanner;
import java.time.LocalDate;


class Accounts{
    Scanner sc = new Scanner(System.in);
    public
    int accountNumber = 001;
    String accountHolder = "Rakesh Raj";
    double accountBalance = 124509.34;

    LocalDate today = LocalDate.now();
    //deposit
    public void accountDeposit(){
        System.out.print("Enter the deposit amount : ");
        double depositAmount = sc.nextDouble();
        accountBalance += depositAmount;
        balance();
    }

    //withdraw
    public void accountWithdraw(){
        System.out.print("Enter the withdrawal amount : ");
        double withdrawalAmount = sc.nextDouble();
        accountBalance -=withdrawalAmount;
        balance();
    }

    //balance
    public void balance(){
        System.out.println("Current balance :" + accountBalance);
    }

}

class Transactions extends Accounts{
    LocalDate transactionDate = today;
    String transcationType ;
    double transcationAmount;

    //send
    public void send(){
        System.out.print("Enter the amount need to send : ");
        double sendAmount=sc.nextDouble();
        System.out.print("Enter the recipient Account no : ");
        int sendAccount =sc.nextInt();
        System.out.println("Done");
        Accounts obj = new Accounts();
        accountBalance -= sendAmount;
        balance();
    }
}

public class main{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Transactions obj = new Transactions();
        System.out.println(
            "Enter the sno for actions:-\n"+
            "1 : Deposit\n"+
            "2 : Withdraw\n"+
            "3 : Balance enquery\n"+
            "4 : Send Money"
        );
        int temp =input.nextInt();
        switch(temp){
            case 1:
            obj.accountDeposit();
            break;
            case 2:
            obj.accountWithdraw();
            break;
            case 3:
            obj.balance();
            break;
            case 4:
            obj.send();
            break;
        }
    }
}