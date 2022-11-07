/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        System.out.println(triple(number));
    }
    public static boolean triple(int n){
        int num = (n*n)-((n-1)*(n-1));
        System.out.println(num);
        //double check = Math.sqrt(num);
        //if(check - Math.floor(num) != 0){
        //    return false;
        //}
        //else 
            return true;
    
}
}

