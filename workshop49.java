import java.util.Scanner;

/**
 * Write a description of class workshop49 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop49
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gpa = sc.nextDouble();
        int att = sc.nextInt();
        int atti = sc.nextInt();

        if(gpa >= 3.2){
            if(att > 80){
                if(atti < 5){
                    System.out.println("Eligible");
                } else {
                    System.out.println("Not Eligible");
                }
            } else {
                System.out.println("Not Eligible");
            }
        } else {
            System.out.println("Not Eligible");
        }
    }
}