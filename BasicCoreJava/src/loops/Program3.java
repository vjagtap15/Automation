package loops;

public class Program3 {

	public static void main(String[] args) {
		
		   for (int i=4; i>=1; i--) 
	        {
	            //Printing i spaces at the beginning of each row
	             
	            for (int j=1; j<i; j++) 
	            {
	                System.out.print(" ");
	            }
	             
	            //Printing i to rows value at the end of each row
	             
	            for (int j = i; j<=4; j++)
	            {
	                System.out.print(j);
	            }
	             
	            System.out.println();
	        }

	}

}
