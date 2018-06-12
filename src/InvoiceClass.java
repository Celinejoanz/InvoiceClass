import java.util.Scanner;
public class InvoiceClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LineItem lineitem = new LineItem();

        System.out.println("Item number: ");
        int itemNumber=scan.nextInt
                ();
        lineitem.setItemNumber(itemNumber);


        System.out.println("Description: ");
        String description=scan.next();
        lineitem.setDescription(description);
        System.out.println("");

        System.out.println("Quantity: ");
        int quantity=scan.nextInt();
        lineitem.setQuantity(quantity);
        System.out.println("");

        System.out.println("Price: ");
        int price=scan.nextInt();
        lineitem.setPrice(price);


        System.out.println("Item number"+ "\t" +"Description"+ "\t" +"Quantity" +"\t" +"Price" );
        System.out.println(lineitem.getItemNumber()+ "\t" + lineitem.getDescription() + "\t" + lineitem.getQuantity() + "\t" + lineitem.getPrice());

        System.out.println("--------------");

        int subTotal=price*quantity;
        System.out.println("Subtotal: " + subTotal);
        lineitem.setTaxRate(0.4);
        double result = lineitem.getTaxRate()*subTotal;

        System.out.println("Tax: " + result);
        double grandTotal= result+subTotal;
        System.out.println("Grand total: " +grandTotal);
    }
}
