package gC_lab2;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class labTwo_03 {

	public static void main(String[] args) {
		double length;
		double width;
		double height;
		String choice = "y";

		    while (choice.equalsIgnoreCase("y")) {

		    	System.out.println("Welcome to Grand Circus' Room Detail Generator");
				System.out.println("");
				System.out.print("Enter Length: ");
				Scanner scnr = new Scanner(System.in);
				
				length = scnr.nextDouble();
				
				System.out.print("Enter Width: ");
				
				width = scnr.nextDouble();
				
				System.out.print("Enter height: ");
				
				height = scnr.nextDouble();				
				
// time delay for fun
		        try {
		            Thread.sleep(1000);

		        }
		        catch(InterruptedException e) {
		            System.err.println(e.getMessage());
		        }
// end time delay				
				
				float Area =  (float) (width * length);
				float Perimeter = (float) (2*(width + length));
				float Volume = (float) (length * width * height);

// round to max of 2 decimal places 
				
				DecimalFormat df = new DecimalFormat("0.0000");
				
				System.out.println("");
				
				System.out.println("Area: " + (df.format(Area)));
				System.out.println("Perimeter: " + (df.format(Perimeter)));
				System.out.println("Volume: "+ (df.format(Volume)));
				System.out.println("");

		    System.out.print("To use the calculator again, press Y, then return.");
		        choice = scnr.next();
		    }
		    System.out.println("The end! Please go away now.");

	}

}
