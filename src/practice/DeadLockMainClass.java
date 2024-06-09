package practice;

import practice.DeadLockExample.Resource;

public class DeadLockMainClass {

	public static void main(String[] args) {
		
		
		final Resource resource1= new Resource();
		final Resource resource2= new Resource();
		
		Thread t1= new Thread(()-> resource1.method1(resource2),"Thread1");
		Thread t2= new Thread(()-> resource2.method1(resource1),"Thread2");
		
		t1.start();
		t2.start();
		
	}
}
