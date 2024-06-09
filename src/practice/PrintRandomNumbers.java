package practice;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintRandomNumbers {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		random.ints(100000,1000000).limit(10).forEach(System.out::println);
		
		  int randomNumber = IntStream.range(0, 6)
                  .mapToObj(i -> random.nextInt(10))
                  .collect(Collectors.collectingAndThen(
                      Collectors.toList(),
                      list -> Integer.parseInt(list.stream()
                                                  .map(String::valueOf)
                                                  .collect(Collectors.joining())
                  )));

		  System.out.println(randomNumber);
	}
}
