package utp2;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a=3,b=3.5,c=2,d=4;
        
        System.out.println("Krabby patty        : $" + a);
        System.out.println("Double Patty Patty  : $" + b);
        System.out.println("Krabby Junior Junior: $" + c);
        System.out.println("Jumbo Small Patty   : $" + d);
        
        double e,f,g,h,i,j,k,l;
        
        System.out.print("membeli krabby patty sebanyak :" );
        e =input.nextDouble();   
        f = (a*(20/100)*e);
        System.out.print("membeli krabby patty sebanyak :" );
        g =input.nextDouble();
        h = (a*(15/100)*e);
        System.out.print("membeli krabby patty sebanyak :" );
        i =input.nextDouble();
        j = (a*(10/100)*e);
        System.out.print("membeli krabby patty sebanyak :" );
        k = input.nextDouble();
        l = (a*(5/100)*e);
        if (e > 2){                
            System.out.print("harga Krabby patty : " + f);            
        }       
        else if (f > 2){    
            System.out.println("harga Double Patty Patty : " + h);    
            f=input.nextDouble();
        }
        else if (g > 2){      
            System.out.println("harga Krabby Junior Junior : " + j);
            e=input.nextDouble();
        }
        else if (h > 2){  
            System.out.println("harga Small Patty  : " + l);         
        }
        else {
           System.out.println("Tidak mendapatkan diskon");
        }
    }    
}
