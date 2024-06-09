package sortArray;

import java.util.Scanner;

public class FabinacciSeries {

	 public static void main(String[] args) {
	        int n = 5; // You can change 'n' to generate a different number of Fibonacci numbers

	        System.out.println("Fibonacci Series up to " + n + " terms:");
	        printFibonacciSeries(n);
	        
	        
	        Scanner sc = new Scanner(System.in);
	      int a=  sc.nextInt();
	      int first=0;
	      int second=1;
	      
	      for(int i=0;i<a;i++) {
	    	  
	    	  System.out.println(first);
	    	  int next=first+second;
	    	  first=second;
	    	  second=next;
	    	  
	    	  
	      }
	    }
	 
	 
	 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	    // Method to calculate and print Fibonacci series using iteration
	    public static void printFibonacciSeries(int n) {
	        int firstTerm = 0, secondTerm = 1;

	        for (int i = 0; i < n; i++) {
	            System.out.print(firstTerm + " ");

	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	    }
}
