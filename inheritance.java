interface  x{
     default void m1(){
        System.out.println("Interface class A");
    }
    abstract void  m2();
}
interface y{
     default void m1(){
         System.out.println("Interface class B");
    }
    abstract void m2();
}
class inheritance implements x,y {
  public void m1(){
         System.out.println("Inheritance class");
       }
       public void m2(){
        System.out.println("m2");
    }

        public static void main(String[] args) {
       inheritance obj=new inheritance();
       obj.m1();
       obj.m2();
    }
}
