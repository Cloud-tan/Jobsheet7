import java.util.Scanner;   

public class SiakadWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade, total = 0;
        int i = 0;

        while (i < total) {
            i++;
        }
        System.out.print("Enter The Number Of Students:   ");
        total = sc.nextInt();
        
        while (i < total) {
            System.out.print("Enter The Grade Of The " + (i + 1) + " Student:    ");
            grade = sc.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("~~~~~~ Invalid Grade. Re-enter a valid grade! ~~~~~~");
            continue;
            
        } if (grade > 80 && grade <= 100) {
            System.out.println("The Grade of the " + (i + 1) + " Student Is A ");
            System.out.println("~~~~~~~~~ Good, keep the grade! ~~~~~~~~~"); // Added motivational message  
        } else if (grade > 73 && grade <= 80) {
            System.out.println( "The Grade of the " + (i + 1) + " Student Is B+ " );
        } else if (grade > 65 && grade <= 73) {
            System.out.println( "The Grade of the " + (i + 1) + " Student Is B " );
        } else if (grade > 60 && grade <= 65) {
            System.out.println( "The Grade of the " + (i + 1) + " Student Is C+ " );
        } else if (grade > 50 && grade <= 60) {
            System.out.println( "The Grade of the " + (i + 1) + " Student Is C " );
        } else if (grade > 39 && grade <= 50) {
            System.out.println( "The Grade of the " + (i + 1) + " Student Is D " );
        } else {
            System.out.println( "The Grade of the " + (i + 1) + " Student Is E " );
        } i++;
        } 
    
        sc.close();
    }
}
