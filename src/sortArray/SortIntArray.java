package sortArray;

import java.util.Arrays;
import java.util.List;

public class SortIntArray {

//	public static void main(String[] args) {
//	
//	}
	  public static int maxProfitInSegment(List<Integer> pn, int k) {
	        int n = pn.size();
	        int maxProfit = Integer.MIN_VALUE;
	        int currentProfit = 0;

	        for (int i = 0; i < n; i++) {
	            currentProfit += pn.get(i);

	            if (i >= k - 1) {
	                maxProfit = Math.max(maxProfit, currentProfit);
	                currentProfit -= pn.get(i - k + 1);
	            }
	        }
	        return maxProfit;
	    }

	    public static void main(String[] args) {
	        List<Integer> pn= Arrays.asList(-3, 4, 3, -2, 2, 5);
	        int k = 4;

	        int result = maxProfitInSegment(pn, k);
	        System.out.println("Maximum net profit: " + result);
	    }
}
