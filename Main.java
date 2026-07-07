abstract class A{
    abstract void show();
}
public class Main extends A {
    void show(){
        System.out.println("Abstract method example");
    }
     public static void main(String[] args){
        Main m= new Main();
        m.show();
     }
}