abstract class  class1{
     abstract void m1();
     abstract void m2();
}
public class abstractclass extends class1 {
     void m1(){
         System.out.println("m1 method");
    }
     void m2(){
         System.out.println("m2 method");
    }
    public static void main(String[] args){
    abstractclass a= new abstractclass();
    a.m1();
    a.m2();
    }
}
