import java.util.Scanner;

abstract class FoodItem{
    private int itemid;
    private String itemname;
    private float price;
    public FoodItem(int itemid,String itemname,float price){
        this.itemid=itemid;
        this.itemname=itemname;
        this.price=price;
    }
    public int getitemid(){
        return itemid;
    }
    public String getitemname(){
        return itemname;
    }
    public float getprice(){
        return price;
    }
     public void setprice(float price) {
        this.price = price;
     }
    public void displayItem(){
    }
    abstract void calculateDiscount();
}
 interface Delivery{
      public void deliver();
      public void trackOrder();
}

public class pizza extends FoodItem implements Delivery{
    public float disc=1;
   public pizza(int itemid, String itemname, float price) {
    super(itemid, itemname, price);
}
    @Override
    void calculateDiscount() {
        float price=getprice();
        if(price>500){
             disc=0.20f*price;
        }
        else{
              disc=0.10f*price;
             
            }
            setprice(price-disc);
    }
    @Override
public void displayItem() {
    System.out.println("-----details-----");
    System.out.println("Item ID: " + getitemid());
    System.out.println("Item Name: " + getitemname());
    System.out.println("Price: " + getprice());
    System.out.println("Discount: " + disc);
}
    @Override
    public void deliver() {
        System.out.println("Order is out of delivery.");
    }
    @Override
    public void trackOrder() {
        System.out.println("Tracking Order");
    }
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the item id:");
        int itemid=sc.nextInt();
        System.out.println(" Enter item name:");
        String itemname=sc.next();
        System.out.println("Enter the price of pizza:");
        float price=sc.nextFloat();
        pizza p = new pizza(itemid, itemname, price);
        p.calculateDiscount();
        p.displayItem();
        p.deliver();
        p.trackOrder();

    }
}

