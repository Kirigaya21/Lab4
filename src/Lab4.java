 /**
 * Created by 1610521 on 2/28/2018.
 */

import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.FileReader;
        import java.io.StringReader;
        import java.util.Arrays;
        import java.util.Random;
        import java.util.Scanner;

 public class Lab4 {

     public static int power2(int a, int n) {
         if (n == 0)
             return 1;
         if (n % 2 == 1)
             return power2 (a, n-1) * a;
         else {
             int b = power2 (a, n/2);
             return b * b;
         }
     }
     public static double power(double a, int n) {
         double r = 1.0;
         for (int i = 0; i < n; i++) r *= a;
         return r;
     }
    public static void main(String[] args)  {
        System.out.println(power(-5,5));
        System.out.println(power2(5,6));
    }
}
