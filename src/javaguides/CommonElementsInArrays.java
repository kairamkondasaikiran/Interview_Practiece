package javaguides;

public class CommonElementsInArrays {

	public static void main(String[] args) {
		
		int[] a= {2,3,4,5,6};
		int[] b= {2,8,7,5,6};
		
		for(int i=0;i<a.length;i++) {
			int v1=a[i];
			int count=0;
			for(int j=0;j<b.length;j++) {
				
				int v2=b[j];
				if(v1==v2) {
					count++;
				}
			}
			if(count >= 1) {
				System.out.println(v1);
			}
		}
		
	}
}
