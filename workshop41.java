import java.util.Scanner;

/**
 * Write a description of class workshop41 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop41
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}