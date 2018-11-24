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
  public class TrapezoidalRule {

    double f(double x) {
      return Math.exp(- x * x / 2) / Math.sqrt(2 * Math.PI);
   }


   double integrate(double a, double b, int N) {
      double h = (b - a) / N;             
      double sum = 0.5 * (f(a) + f(b));    
      for (int i = 1; i < N; i++) {
         double x = a + h * i;
         sum = sum + f(x);
      }

      return sum * h;
   }
  }
    