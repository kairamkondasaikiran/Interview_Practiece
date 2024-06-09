package practice;

public class MyRunnable implements Runnable{
    
	  private String name;

	    public MyRunnable(String name) {
	        this.name = name;
	    }

	    @Override
	    public void run() {
	        System.out.println("Thread " + name + " is running.");
	        // Add your thread's logic here
	        System.out.println("Thread " + name + " is finished.");
	    }
    
}
