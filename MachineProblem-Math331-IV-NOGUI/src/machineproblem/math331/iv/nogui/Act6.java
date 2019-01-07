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
import java.util.Scanner;
public class Act6 {
    /*
    MATHE
    ATHEM
    THEMA
    HEMAT
    EMATI
    MATIC
    ATICS

    */
    
    public static void main(String[] args){
        Scanner kb = new Scanner (System.in);
        System.out.print("Enter :");
        String test = "    MATHE\n" +
        "    ATHEM\n" +
        "    THEMA\n" +
        "    HEMAT\n" +
        "    EMATI\n" +
        "    MATIC\n" +
        "    ATICS";
        
        String[] e = test.split("");
        
        String[][] te = null;
        for (int i = 0; i < e.length; i++){
            for (int j = 0; j < e.length; j++){
                te[i][j] = e[i];
            }
        }
        
        
    }
    public int findTrace(int[][] ra){
        //row 1 column 1
        //row 2 column 2
        //row 3 column 3
        int sum = 0;
        if(ra.length != ra[0].length){return -1000000;}
        for(int i=0; i < ra.length; i++){
            for(int j=0; j < ra.length; j++){
                if(i == j){sum += ra[i][j];}
            }}
        return sum;
    }
    
}
