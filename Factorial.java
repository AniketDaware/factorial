import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			  int i,fact=1;  
			  System.out.println("Enter Number");
			  int number=sc.nextInt();//It is the number to calculate factorial    
			  for(i=1;i<=number;i++){    
			      fact=fact*i;    
			  }    
			  System.out.println("Factorial of "+number+" is: "+fact);    
			 }  
		 
        
	}

