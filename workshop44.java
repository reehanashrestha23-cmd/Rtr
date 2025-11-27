import java.util.Scanner;

/**
 * Write a description of class workshop44 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop44
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("Divisible by both");
        } else {
            System.out.println("Not divisible");
        }
    }
}