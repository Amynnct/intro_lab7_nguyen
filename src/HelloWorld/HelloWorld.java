package HelloWorld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world, this is Amy Nguyen!");
		Scanner scnr = new Scanner(System.in);
	    double x = scnr.nextDouble();
	    double y = scnr.nextDouble();
	    double z = scnr.nextDouble();
	    
	    double xPowerz = Math.pow(x,z);
	    double xPowerYToZ = Math.pow(x, Math.pow(y,z));
	    double absoluteY = Math.abs(y);
	    double squareRootXYPowerZ = Math.sqrt(Math.pow((x*y),z));
	    System.out.println(xPowerz + " " + xPowerYToZ + " " + absoluteY + " " + squareRootXYPowerZ);
	      
	}

}


