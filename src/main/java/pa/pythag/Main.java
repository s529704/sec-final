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
        //Scanner scan = new Scanner(System.in);        Old code; would take an int argument,  
        //System.out.print("Enter a number: ");         but breaks (throws inputmismatchexception)
        //int number = scan.nextInt();                  if the user goes rogue (or dumb) and enters 
        //triple(number);                               something that isn't an int
        boolean intCheck = false;
        while (intCheck == false){
           try {
                Scanner scan = new Scanner(System.in);  //New code, will check and handle rogue/dumb users and send them 
                System.out.println("Enter a an integer to see if it is a pythagorean triple: "); //back to the beginning and try again
                int number = scan.nextInt();
                boolean tripleCheck = false;
                while(tripleCheck == false){
                    tripleCheck = triple(number);
                    System.out.println("That was not apart of a pythagorean triple. Try again.");
                    number = scan.nextInt();
                }
                intCheck = true;
            } 
            catch (Exception e) {
                System.out.println("You did not enter an integer. Please try again, entering an integer this time dingus.");
            } 
        }
        
    }
    public static boolean triple(int c){
        //int num  = n/5;
        //int sideOne = num * 3;
        //int sideTwo = num * 4;            old code; would only actually return the correct output/calculation
        //int oneSq = sideOne * sideOne;    if the pythagorean triple followed the "3 4 5" rule (multiples of 3, 4, and 5
        //int twoSq = sideTwo * sideTwo;    work if multiplied by the same matching multiple) but there are triples
        //int thrSq = n*n;                  that exist that do not follow that rule, therefore there was an availability
        //if(oneSq + twoSq == thrSq){       issue.
        //    System.out.print("true: ");
        //    System.out.print(sideOne + " ");
        //    System.out.print(sideTwo + " ");
        //}
        //else
        //    System.out.println("false");
        int a = 0;
        int b = 0;
        for (int i = 0; i<c; i++){
            for(int j = 0; j<c; j++){
                if((a*a)+(b*b)==(c*c)){
                System.out.println("True");
                System.out.println("Other numbers in triple: " + a + " " + b);
                
                b++;            
                }
            return true;
            }
            a++;
            b=0;
        }
        return false;
    }
}


