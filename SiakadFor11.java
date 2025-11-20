import java.util.Scanner;

public class SiakadFor11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pass = 0;
        int fail = 0;
        double grade;
        double highestGrade = 100;
        double lowestGrade = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Enter The Grade Of The " + i + " Student:    ");
            grade = sc.nextDouble();
            if (grade >  highestGrade) {
                highestGrade = grade;
            }   if (grade < lowestGrade) {
                lowestGrade = grade;
            } if (grade >= 60) {
                pass++;
            } else {
                fail++;
            }
        }   System.out.println("The Highest Grade Is:   " + highestGrade);
            System.out.println("The Lowest Grade Is:    " + lowestGrade );
            System.out.println("Number of Student Pssed:   " + pass );
            System.out.println("Number of Student Failed:   " + fail );
    
            sc.close();
    }
}   