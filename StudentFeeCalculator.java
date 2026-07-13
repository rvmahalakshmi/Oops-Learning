import java.util.Scanner;
class StudentFeeCalculator{
    public void calculatefee(int tuitionFee){
        System.out.println("Total fee: "+tuitionFee); 
    }
    public void calculatefee(int tuitionFee,int busFee){
                System.out.println("Total fee: "+tuitionFee+busFee);
    }
    public void calculatefee(int tuitionFee,int busFee,int hostelFee){
                System.out.println("Total fee: "+tuitionFee+busFee+hostelFee);
    }
    void calculatefee(int tuitionFee,int busFee,int hostelFee,float discountPercent){
        float totalfee=tuitionFee+busFee+hostelFee;
          float discount=(discountPercent/100)*totalfee;
         totalfee=totalfee-discount;
                 System.out.println("Total fee: "+totalfee);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" 1.Tuition Fee\n2.Tuition Fee + Bus Fee\n3.Tuition Fee + Bus Fee +Hostel Fee\n4.Total Fee with Discount");
        StudentFeeCalculator obj= new StudentFeeCalculator();
        System.out.println("Enter your choice:");
        int choice= sc.nextInt();
        int tuitionFee=0;
        int hostelFee=0;
        int busFee=0;
        int discountPercent=0;
        switch(choice){
            case 1:
                System.out.println("Enter Tution Fee:");
                 tuitionFee=sc.nextInt();
                 obj.calculatefee(tuitionFee);
                 break;
            case 2:  
                System.out.println("Enter Tution Fee:");
                 tuitionFee=sc.nextInt();
                 System.out.println("Enter Bus Fee: ");
                 busFee=sc.nextInt();
                 obj.calculatefee(tuitionFee,busFee);
                 break;
            case 3:
                System.out.println("Enter Tution Fee:");
                 tuitionFee=sc.nextInt();
                 System.out.println("Enter Bus Fee: ");
                 busFee=sc.nextInt();
                 System.out.println("Enter Hostel Fee: ");
                 hostelFee=sc.nextInt();
                 obj.calculatefee(tuitionFee,busFee,hostelFee);
                 break;
            case 4:
                System.out.println("Enter Tution Fee:");
                 tuitionFee=sc.nextInt();
                 System.out.println("Enter Bus Fee: ");
                 busFee=sc.nextInt();
                 System.out.println("Enter Hostel Fee: ");
                 hostelFee=sc.nextInt();
                 System.err.println("Enter Discount Percentage: ");
                 discountPercent=sc.nextInt();
                 obj.calculatefee( tuitionFee,busFee, hostelFee,discountPercent);
                 break;
            default:
                System.out.println("Invalid");
        }
    }
}