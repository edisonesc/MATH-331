/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machineproblem.math331.ii;

/**
 *
 * @author IT-301
 */
import java.util.Scanner;
public class MachineProblemMath331II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner in = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        if((a*d - b*c) == 0){
            System.out.println("The equation has no solution.");
        }else{
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

            System.out.printf("x is %.1f and y id %.1f", x, y);
        }
    }
    
}
