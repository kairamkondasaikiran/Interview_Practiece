package practice;

public class DeadLockExample {

	static class Resource{
		
		public synchronized void method1(Resource otherResource) {
			
			System.out.println(Thread.currentThread().getName()+" Lock on Resource1");
			
			try {
				
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 System.out.println(Thread.currentThread().getName() + " waiting to acquire lock on Resource 2");
	            otherResource.method2(this);
		}
		
	public synchronized void method2(Resource otherResource) {
			
			System.out.println(Thread.currentThread().getName()+" Lock on Resource2");
			
			try {
				
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			 System.out.println(Thread.currentThread().getName() + " waiting to acquire lock on Resource 2");
	            otherResource.method1(this);
		}
	}
}
