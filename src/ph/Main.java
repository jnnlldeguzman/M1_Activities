/**
 * 
 */
package ph.com.bpi.hello;

import java.util.Scanner;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	
	
	
	
	public static void main(String[] args) {
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
	/* Activity 1	
		Syste.out.print("What is your name: ");
		String name = input.nextLine();
		
		System.out.println("Hello " + name + "!");
	*/	
		
		
		
		
		
	/* Activity 3	
        //Read input1
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
 
        //Read input2
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
 
 
        int sum = num1 + num2;
        int difference = num1 - num2;
        int prod = num1 * num2;
        int quo = num1 / num2;
        int remainder = num1 % num2;
 
        // output
        System.out.println("Sum:  " + sum);
        System.out.println("Difference:  " + difference);
        System.out.println("Product:  " + prod);
		
	*/
		
	/* Activity 4
	 
		//Read input1
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		
		if(age < 18) {
			System.out.println("Minor");
		} else if (age >= 18 && age<=59 ) {
			System.out.println("Adult");
		} else {
			System.out.println("Senior");
		}
		
		
		*/
		
		int sum = 0;
		
		for (int i=1; i<=50; i++) {
			
			sum += i;
			
		} 
		
		System.out.println("sum : " + sum); // display value of variable
		
		
		
  input.close();		
  
	}

}
