package leetCode;

public class TwoSum {

	public static void main(String[] args) {

		int[] ar= {2,7,11,15};
		int target = 26;
		int[] c=twoSum(ar,target);
		System.out.println(c[0]+" "+c[1]);
	}

	public static int[] twoSum(int[] nums, int target) {

		int[] addTwo=new int[2];
		
		try {
			for(int i=0;i<nums.length;i++){

				int value1=nums[i];
				for(int j=i+1;j<nums.length;j++) {

					int value2=nums[j];
					if(value1+value2==target) {
						addTwo[0]=i;
						addTwo[1]=j;
						break;
					}
				}
			} 
			return addTwo;
		} catch (Exception e) {

			return addTwo;
		}


	}
}
