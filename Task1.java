import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int person = 0, tiketsSold = 0, tiketsSales;
        int tiketsPrice = 50000;
        int i = 0;
        int tikets = 0;
        double pricePerPerson, Discount1, Discount2;
        

        System.out.print("Enter The Number Of Person: ");
        person = sc.nextInt(); 

        while (i < person) {
            System.out.print("Enter The Number Of Tikets Sold By Person " + (i + 1) + ":    ");
            tikets = sc.nextInt();
            
        if (tikets >= 0 && tikets <= 4) {
            pricePerPerson = tikets * tiketsPrice;         
            System.out.println("The Number Of Tikets Sold By Person " + (i + 1) + " Is: " + pricePerPerson );
            
        } else if (tikets > 4 && tikets <= 10 ) {
            Discount1 = tikets * tiketsPrice * 0.9;
            System.out.println("The Number Of Tikets Sold By Person " + (i + 1) + " With 10% Discount1 Is: " + Discount1);
        } else if (tikets > 10) {
            Discount2 = tikets * tiketsPrice * 0.85;
            System.out.println("The Number Of Tikets Sold By Person " + (i + 1) + " With 15% Discount1 Is: " + Discount2);
        }else {   
                System.out.println("~~~~~~ Invalid Number. Re-enter a valid number! ~~~~~~");
                continue;
                }
                i++;
            
        }  
    }
    }
