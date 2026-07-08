

public class protectedmodifier extends member {
    public static void main(String[] args){
        member a= new member();
        a.m1();
        protectedmodifier p=new protectedmodifier();
        p.m1();
        member a1= new protectedmodifier();
        a1.m1();
    }
}
class member{
    protected void  m1(){
        System.out.println("Member class protected method");
    }
}
