package utp3;
import java.util.Scanner;
public class NewClass1 {
        public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        double jam ,min;
        
        jam=input.nextDouble();
        min=input.nextDouble();
        
        min = min/5;
        if (jam>=0 && jam<=12 && min>=0 && min<60 && jam>=min) {
        double sudut = (jam-min)*30;
	System.out.printf("%.0f" , sudut);
        }
	else if (jam>=0 && jam<=12 && min>=0 && min<60 && min>=jam) {
        double sudut = (min-jam)*30;
	System.out.printf("%.0f" , sudut);
        } 
    }
}
        
