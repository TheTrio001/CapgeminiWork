import java.util.*;
public class Discount{

     public static void main(String []args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter Name");
         String name =  scanner.next();
         System.out.println("Enter Price");
         int mrp = scanner.nextInt();
         System.out.println("Enter selling Price");
         int price =  scanner.nextInt();
         int discount =  ((mrp - price)*100)/mrp;
        System.out.println("sr \t product name \t mrp \t selling price \t discount");
        System.out.println("1\t"+name+"\t"+mrp+"\t"+price+"\t"+discount);
        scanner.close();
        }
}