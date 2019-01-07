/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machineproblem.math331.iv.nogui;
import java.util.Scanner;
/**
 *
 * @author edies
 */
public class Act5 {
    
    public static void main(String[] args){
       Scanner kb = new Scanner(System.in);
       System.out.println("Activity 5: Mini-Max Sum");
       System.out.println("Enter Array Elements: ");
       String inputs[] = kb.nextLine().split("\\s");
       // 3 5 7 9 = maximum
       // 1 3 5 7 = minimum
       int minimumSum = 0, maximumSum = 0;
       for (int i = 0; i < inputs.length; i++){
           if(i < inputs.length - 1)
           minimumSum += Integer.valueOf(inputs[i]);
           if(i > 0){
           maximumSum += Integer.valueOf(inputs[i]);}
       }
       System.out.println(minimumSum + " " + maximumSum);
    }
    
}
