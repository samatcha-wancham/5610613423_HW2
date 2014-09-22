/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package complexnumber;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Complexnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter complex number1:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.print("Enter complex number1:");
        double m = sc.nextDouble();
        double n = sc.nextDouble();
        complex b = new complex(x,y);
        complex c = new complex(m,n);
        complex s = b.add(c);
        complex t = b.substract(c);
        complex p = b.multiplication(c);
        complex o = new complex(); 
        complex yy = new complex(); 
        b.realpart(o);
        yy.imagpart(b);
        System.out.println(b+"+"+c+"="+s);
        System.out.println(b+"-"+c+"="+t);
        System.out.println(b+"*"+c+"="+p);
        System.out.println("Real part and Imagine part of complex number1:");
        System.out.println(b.realpart(o));
        System.out.println(yy.imagpart(b));
        System.out.println("Real part and Imagine part of complex number2:");
        System.out.println(c.realpart(o));
        System.out.println(yy.imagpart(c));
        System.out.println(b.magnitude());
        System.out.println(b.compare(c));
        
    }
    
}
