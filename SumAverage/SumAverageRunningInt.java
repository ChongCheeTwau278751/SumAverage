
public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	Define variables
		//	int sum = 0;	//The accumulated sum, init to 0
		//	double average;		//average in double		
		//	int lowerbound = 1;
		//	int upperbound = 100;
		
		//Compute average in double.
		//Print sum and average
		
		//Use a for-loop to sum from lowerbound to upperbound(take as 1)
		int sum1 = 0;
		double average1;
		int lowerbound1 = 1;
		int upperbound1 = 100;
		System.out.println("For Loop");
		for (int number1 = lowerbound1; number1 <= upperbound1; ++number1) {
			//The loop index variable number = 1, 2, 3, ..., 99, 100
			sum1 += number1;	//same as "sum = sum + number"
		}
			average1 = sum1/100;
			System.out.println("The sum of 1 to 100 is "+ sum1);
			System.out.println("The average is " + average1);
			System.out.println();
		
		//Use a while-do loop to sum from lowerbound to upperbound(take as 2)
		int sum2 = 0;
		double average2;
		int lowerbound2 = 1;
		int upperbound2 = 100;
		System.out.println("While-do Loop");
	      int number2 = lowerbound2;       
	      while (number2 <= upperbound2) {  
	         sum2 += number2;
	         ++number2;  
	      }
	         average2 = sum2/100;
	        System.out.println("The sum of 1 to 100 is "+ sum2);
			System.out.println("The average is " + average2);
			System.out.println();
	      
	      //Use a do-while loop to sum from lowerbound to upperbound(take as 3)
	      int sum3 = 0;
	      double average3;
	      int lowerbound3 = 1;
	      int upperbound3 = 100;
	      System.out.println("Do-while Loop");
	      int number3 = lowerbound3;         
	      do {
	         sum3 += number3;
	         ++number3;   
	      
	      } while (number3 <= upperbound3); 
	      average3 = sum3/100;
	      	System.out.println("The sum of 1 to 100 is "+ sum3);
			System.out.println("The average is " + average3);
			System.out.println();
	}
			

}
