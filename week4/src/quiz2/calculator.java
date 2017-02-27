package quiz2;
import java.util.Scanner;
public class calculator {
public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
			
		    double tuition; 
			double percent;
			double sum = 0;
			
			System.out.println("Welcome to use tuition fee calculator");
			
			System.out.println("Please enter your first year tuition fee: ");
		    
			tuition= reader.nextInt();
		    
		    System.out.println("How many percents you expect that tuition fee increasing every year:");
		    
		    percent = reader.nextInt();
		    
		    for(int i = 0; i < 4; i++) {
		    	
		    	sum = sum + (tuition * (Math.pow(1+(0.01*percent),i)));
		    reader.close();
		    }
			
		    
		    System.out.printf("The total cost to complete your degree is: $%.2f \n", +sum);
			}
}
