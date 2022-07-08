import java.io.*;
public class itempurchase {

    public static void main(String[] args)throws IOException{

    System.out.println("Enter the number of items to put in stock");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    item[] items = new item[n];

    for(int i =0; i< n;i++){
        System.out.println("Enter the item_id");
        int itemid = Integer.parseInt(br.readLine());
        System.out.println("Enter Price");
        double price = Double.parseDouble(br.readLine());
        items[i] = new item(itemid, price);
    }
    System.out.println("Enter the item.id you want to purchase");
    System.out.println(items[0].getItem_id());
    int itemidd = Integer.parseInt(br.readLine());
    for(int i = 0; i< items.length; i++){
        if(items[i].getItem_id() == itemidd){
            System.out.println("Item found, Enter the Quantity");
            int quantity = Integer.parseInt(br.readLine());
            printbill(quantity, items[i].getPrice());
        }
    }
    }
    static void printbill(int quantity, double price){
        double total = price * quantity;
        System.out.println("Your total amount = " + total);

    }
    
}

class item{
    private int item_id; 
    private double price;
    public int getItem_id() {
        return item_id;
    }
    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    item(int item_id, double price){
        setItem_id(item_id);
        setPrice(price);
    }
}