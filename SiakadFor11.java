import java.util.Scanner;

public class SiakadFor11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double grade;
        double highestGrade = 0;
        double lowestGrade = 100;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Enter The Grade Of The " + i + " Student:    ");
            grade = sc.nextDouble();
            if (grade >  highestGrade) {
                highestGrade = grade;
            }   if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }   System.out.println("The Highest Grade Is:   " + highestGrade);
            System.out.println("The Lowest Grade Is:    " + lowestGrade );

            sc.close();
    }
}   