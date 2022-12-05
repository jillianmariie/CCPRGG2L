package Monday;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		
        double distance;
     
        System.out.println("Enter x1 and y1 value: ");
        double x1=scan.nextDouble();
        double y1=scan.nextDouble();
        
        
        System.out.println("Enter x2 and y2 value: ");
        double x2=scan.nextDouble();
        double y2=scan.nextDouble();
       
        
        distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));    
      
        System.out.println("Distance between two points "+ distance);
		
        scan.close();
	}

}
