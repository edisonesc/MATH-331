/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machineproblem.math331.iv.nogui;

/**
 *
 * @author edies
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Act4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //size = inputs.length,
        Scanner kb = new Scanner(System.in);
        int  neg = 0, pos = 0, zer = 0;
        System.out.println("Activity 4: Plus Minus");
        System.out.println("Enter Array Elements: ");
        String in = kb.nextLine();
        String inputs[] = in.split("\\s");
        System.out.println("Enter size");
        int size = kb.nextInt();
        double ratioPos = 0.0f, ratioNeg = 0.0f, ratioZer = 0.0f;
        DecimalFormat df = new DecimalFormat("#.000000");
        for(int i=0; i < inputs.length;  i++){
            int conv = Integer.valueOf(inputs[i]);
            if(conv > 0){neg++;}
            else if(conv < 0){pos++;}
            else if(conv == 0){zer++;}
        }
        
        ratioPos = pos/Double.valueOf(size);
        ratioNeg = neg/Double.valueOf(size);
        ratioZer = zer/Double.valueOf(size);
//        System.out.println(df.format(pos/100.0) + "\n" + df.format(neg/100.0)  + "\n" + zer + "\n" + size);
       
        System.out.println(df.format(ratioNeg)
                + "\n" + 
                df.format(ratioPos)  + 
                "\n" + 
               df.format(ratioZer)  );
    }
    
}
