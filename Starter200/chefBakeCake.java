import java.util.*;
import java.lang.*;
import java.io.*;


public class chefBakeCake {

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt();
	  int x=scan.nextInt();
	  int y =scan.nextInt();
	  int cakesPerVehicle = y/ x;  
      int vehicles = (n+ cakesPerVehicle - 1)/cakesPerVehicle ;
      System.out.println(vehicles);
	  

	}
}

    
}
