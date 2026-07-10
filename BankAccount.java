import java.util.Scanner;

class BankAcount{
    private int accountnumber;
    private String holdername;
    private float balance;
    public BankAcount(int accountnumber,String holdername,float balance){
        this.accountnumber=accountnumber;
        this.holdername=holdername;
        this.balance=balance;
    }
    public void deposit(float amount){
       if(amount>0){
        balance=amount+balance;
        System.out.println("Successfully deposited");
       }
       else{
        System.out.println("--INVALID--");
       }
    }
    public void withdraw(float amount){
       if(amount<=balance&& amount>0){
        balance=amount-balance;
        System.out.println("Successfully withdraw");
       }
       else{
        System.out.println("--INVALID--");
       }
    }
    public void displayAccount(){
        System.out.println("Account number: "+accountnumber);
        System.out.println("Holder Name: "+holdername);
        System.out.println("Balance: "+balance);
    }
    public int getaccountnumber(){
        return accountnumber;
    }
    public String getholdername(){
        return holdername;
    }
    public float getbalance(){
        return balance;
    }
    public void setbalance(float amount){
         this.balance=balance;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Account number: ");
    int accountnumber=sc.nextInt();
    System.out.println("Enter the Holder name:");
    String holdername=sc.next();
    System.out.println("Enter the Intial Balance: ");
    float balance=sc.nextFloat();
    float amount=0;
     System.out.println("---Available Services---\n1.Deposit\n2.Withdraw\n3.Display Account\n4.Exit");
    System.out.println("Enter your choice:");
    int choice=sc.nextInt();

    BankAcount obj=new BankAcount(accountnumber, holdername, balance);
    while(choice!=4&&choice<=4){
        if(choice==1){
            System.out.println("Enter the amount you want to deposit:");
            amount=sc.nextFloat();
            obj.deposit(amount);
        }
        if(choice==2){
           System.out.println("Enter the amount you want to withdraw:");
            amount=sc.nextFloat();
            obj.withdraw(amount); 
        }
        if(choice==3){
            obj.displayAccount();
        }
     System.out.println("---Available Services---\n1.Deposit\n2.Withdraw\n3.Display Account\n4.Exit");
    System.out.println("Enter your choice:");
    choice=sc.nextInt();
    }
    }
}