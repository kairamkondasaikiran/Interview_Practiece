package splanLabs;

import java.util.function.UnaryOperator;

public class FindSqureUsingLambda {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> x=(a)-> a*a;
		
		int square =x.apply(3);
		
		System.out.println(square);
	}
}
