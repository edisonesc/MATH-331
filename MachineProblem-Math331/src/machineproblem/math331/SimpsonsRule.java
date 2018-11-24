/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machineproblem.math331;

/**
 *
 * @author IT-301
 */
public class SimpsonsRule {
    
public static double f(double x) {
      return Math.exp(- x * x / 2) / Math.sqrt(2 * Math.PI);
   }

  /**********************************************************************
   * Integrate f from a to b using Simpson's rule.
   * Increase N for more precision.
   **********************************************************************/
   public static double integrate(double a, double b, int c, int en) {
      int N = en;                    // precision parameter
      double h = (b - a) / (N - 1);     // step size
 
      // 1/3 terms
      double res = 0.0;
      double sum = 1.0 / 3.0 * (f(a) + f(b));
      switch(c){
          case 1:
              res = sum;
              break;
          case 2:
                for (int i = 2; i < N - 1; i += 2) {
                double x = a + h * i;
                sum += 2.0 / 3.0 * f(x);
                   }
                res = sum;
              break;
      
      }
      

      // 4/3 terms
//      for (int i = 1; i < N - 1; i += 2) {
//         double x = a + h * i;
//         sum += 4.0 / 3.0 * f(x);
//      }

      // 2/3 terms
   

      return res * h;
   }
}