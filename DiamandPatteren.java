import java.util.Scanner;

public class DiamandPatteren {
     public static void main(String args[]){
    int m, i, j, n = 1;  
    System.out.print("Enter the number of rows you want to print: ");  
    Scanner sc = new Scanner(System.in);  
    m= sc.nextInt();  
    n= m- 1;  
    for (j = 1; j<= m; j++){
    	for (i = 1; i<= n; i++){
    		System.out.print(" ");
    	}  
        n--;  
        for (i = 1; i <= 2 * j - 1; i++){
        	System.out.print("*");
        }  
        System.out.println("");  
        }  
        n= 1;  
        for (j = 1; j<= m - 1; j++){
        	for (i = 1; i<= n; i++){
        		System.out.print(" ");
        	}
        	n++;
        	for (i = 1; i<= 2 * (m- j) - 1; i++){
        		System.out.print("*");
        	}
        	System.out.println("");
        }
    }
}

