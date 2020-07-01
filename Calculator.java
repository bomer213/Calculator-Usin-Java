/******************************************************************************
                Simple Calculater :addition subraction, multiplication and division
                Author: Wilder J Gomez 
                Description: This simple calculator will do simple Arithmitic,
                using "While loop", "Methods", "Case statements"  
*******************************************************************************/
import java.util.*;

public class Main{   
	public static void main(String[] args) {
	    char answer ='n';
	    int num1;
	    int num2;
	
		
		Scanner numInput1 = new Scanner(System.in);
		Scanner numInput2 = new Scanner(System.in);
		
	    while (answer != 'y'){	
	        int choice =0;
	        System.out.println("Please enter num1 and num2: ");
	        
	        num1 = numInput1.nextInt(); 
	    	num2 = numInput2.nextInt();
	      
	        System.out.println(" Enter 1 for sum: \n Enter 2 for Subtraction: \n Enter 3 for multiplication: \n Enter 4 for division:\n");
	        Scanner choiceInput = new Scanner(System.in);
	        choice = choiceInput.nextInt();
//using cases to call the Methods  	        
	        switch(choice){
	            case 1:
		            addition(num1,num2);
		            break;   
		        case 2:
		            subtraction(num1,num2);
		            break;
		        case 3:  
		            multiplication(num1,num2);
		            break;
		        case 4:
		           division(num1, num2);
		            break;
		      default:
		            System.out.println("Thats not an option:");
		            //break;
	        }// switch end 
	    }
	    

	} // end of main method 
//*****************************addittion fn***********************************
	public static void addition(int num1, int num2){
	    int sumResult =0 ;
        	sumResult = num1 + num2;
        	
        	System.out.println("The sum of the two number is: " + sumResult);
	}
//*****************************subtraction fn***********************************	
	public static void subtraction(int num1,int num2){
	    int subResult= 0;
	    subResult = num1 - num2;
	    
	    System.out.println("The Subtraction of the two number is: " + subResult);
	}
//*****************************multiplication fn***********************************

    public static void multiplication(int num1,int num2){
        int multResult =0;
        multResult = num1 *num2;
        System.out.println("The multiplication of the two number is: " + multResult);
    }
//*****************************division fn***********************************
	
    public static void division(double num1, double num2){
        double divResult =0;
        divResult = num1 / num2; 
        System.out.println("The division of the two number is: " + divResult);
    } 	
}