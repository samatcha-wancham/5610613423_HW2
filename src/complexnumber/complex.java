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
public class complex {
    
    private double Re;
    private double Im;
    
    complex(double x,double y)
    {
        this.Re = x;
        this.Im = y;
    }
    complex()
    {
        Re = 0;
        Im = 0;
    }
    public complex add(complex a)
    {
        double r = Re+a.Re;
        double i = Im+a.Im;
        return new complex(r,i);
    }
    public complex substract(complex a)
    {
        double r = Re-a.Re;
        double i = Im-a.Im;
        return new complex(r,i);
    }
    public complex multiplication(complex a)
    {
         
        return new complex(Re*a.Re-Im*a.Im,Re*a.Im+a.Re);
    }
    public complex add(double x)
    {
       
        return new complex(Re + x,Im);
    }
    public complex substract(double x)
    {
        return new complex(Re-x,Im);
    }
    public complex multiplication(double x)
    {
         
        return new complex(Re*x,Im*x);
    }
    public complex realpart(complex a)
    {
        return new complex(Re,a.Re);
    }
    public complex imagpart(complex a)
    {
        return new complex(Im,a.Im);
    }
    public double magnitude()
    {
        return Math.sqrt((Re*Re)+(Im*Im));
    }
    public boolean compare(complex a)
    {
        return Math.sqrt((Re*Re)+(Im*Im)) == Math.sqrt((a.Re*a.Re)+(a.Im*a.Im));
    }

    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
        return "("+Re+"+"+Im+"i)";
    }

   
    
}
