/**
 * Class: 44-242 Data Structures
 * Author: Dawson McConnell
 * Description: Programming App 9
 * Due: 11-13-22
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any other student.
   I have not given my code to any other student and will not share this code
   with anyone under any circumstances.
*/
package pa.pythag;
import java.util.Scanner;
/**
 *
 * @author nathan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        triple(number);
    }
    public static void triple(int n){
        int num  = n/5;
        int sideOne = num * 3;
        int sideTwo = num * 4;
        int oneSq = sideOne * sideOne;
        int twoSq = sideTwo * sideTwo;
        int thrSq = n*n;
        if(oneSq + twoSq == thrSq){
            System.out.print("true: ");
            System.out.print(sideOne + " ");
            System.out.print(sideTwo + " ");
        }
        else
            System.out.println("false");
    }
}

