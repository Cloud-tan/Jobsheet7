import java.util.Scanner;

public class KafeDoWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffe, tea, bread, totalPrice;
        String customerName;
        int coffeePrice = 12000;
        int teaPrice = 7000;
        int breadPrice = 20000;
        

        do {
            System.out.print("Enter Customer Name (type 'cancel' to exit):  ");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction Cancelled.");
                break;
            }

            System.out.print("Enter The Number Of Coffees:   ");
            coffe = sc.nextInt();
            System.out.print("Enter The Number Of Teas:  ");
            tea = sc.nextInt();
            System.out.print("Enter The Number Of Breads:   ");
            bread = sc.nextInt();
            
            totalPrice = (coffe * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);
            System.out.println("Total To Be Paid: Rp " + totalPrice);
            sc.nextLine();
        } while (true); 

        System.out.println("All Transactions Completed.");
        
        sc.close(); 
    }
}