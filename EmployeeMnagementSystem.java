//parent class

import java.util.Scanner;

class Employee{
    private int employe_id;
    private String employe_name;
    private float basicsalary;
    public Employee(int employe_id,String employe_name,float basicsalary){
        this.employe_id=employe_id;
        this.employe_name=employe_name;
        this.basicsalary=basicsalary;
    }
    public int getemploye_id(){
        return employe_id;
    }
    public String getemploye_name(){
           return employe_name;
    }
    public float getbasicsalary(){
        return basicsalary;
    }
    public void displayDetails(){
    }
    public float claculateSalary(){
        return basicsalary;
    }
}
class Developer extends Employee{
    String programminglanguage;
    float bonus;
    float salary;
    public Developer(int employe_id,String employe_name,float basicsalary,String programminglamguage,float bonus){
    super( employe_id,employe_name,basicsalary);
    this.programminglanguage=programminglamguage;
    this.bonus=bonus;
    this.salary=0;
    }
    public float claculateSalary(){
        salary=getbasicsalary()+bonus;
        return salary;
    }
    public void displayDetails(){
     System.out.println("\n----- Employee Details -----");
        System.out.println("ID            : " + getemploye_id());
        System.out.println("Name          : " + getemploye_name());
        System.out.println("Role          : Developer");
        System.out.println("Language      : " + programminglanguage);
        System.out.println("Basic Salary  : " + getbasicsalary());
        System.out.println("Bonus         : " + bonus);
        System.out.println("Total Salary  : " + salary);
    }
}
class Manager extends Employee{
    int teamsize;
    float allowance;
    float salary=0;
    Manager(int employe_id,String employe_name,float basicsalary,int teamsize,float allowance){
    super( employe_id,employe_name,basicsalary);
    this.teamsize=teamsize;
    this.allowance=allowance;
    this.salary=0;
    }
    public float claculateSalary(){
           salary=getbasicsalary()+allowance;
           return salary;    
    }
 public void displayDetails(){
     System.out.println("\n----- Employee Details -----");
        System.out.println("ID            : " + getemploye_id());
        System.out.println("Name          : " + getemploye_name());
        System.out.println("Role          : Manager");
        System.out.println("Team Size     : " + teamsize);
        System.out.println("Basic Salary  : " + getbasicsalary());
        System.out.println("Allowance     : " + allowance);
        System.out.println("Total Salary  : " + salary);
}
}
 class EmployeeMnagementSystemn{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Developer\n2.Manager");
         int choice=sc.nextInt();
         
        if(choice==1){
          System.out.println("Enter ID:");
            int employe_id=sc.nextInt();
            System.out.println("Enter Name: ");
            sc.nextLine();
            String employe_name=sc.nextLine();
            System.out.println("Enter basic salary: ");
            float basicsalary=sc.nextFloat();
            System.out.println("Enter Programming Language:");
            sc.nextLine();
            String programminglamguage=sc.nextLine();
            System.out.println("Enter bonus: ");
            float bonus=sc.nextFloat();
            Developer obj1= new Developer(employe_id,employe_name,basicsalary,programminglamguage,bonus);
                    obj1.claculateSalary();
                    obj1.displayDetails();
                }
                else if(choice==2){
            System.out.println("Enter ID:");
            int employe_id=sc.nextInt();
            System.out.println("Enter Name: ");
            sc.nextLine();
            String employe_name=sc.nextLine();
            System.out.println("Enter basic salary: ");
            float basicsalary=sc.nextFloat();
            System.out.println("Enter Team Size:");
            int teamsize=sc.nextInt();
            System.out.println("Enter allowance: ");
            float allowance=sc.nextFloat();
            Manager obj2= new Manager(employe_id,employe_name,basicsalary,teamsize,allowance);
                    obj2.claculateSalary();
                    obj2.displayDetails();
                }
                else{
                    System.out.println("Invalid choice");
                }
            }        
}
