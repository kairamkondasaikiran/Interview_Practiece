package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainClassForThreadSequence {

	 public static void main(String[] args) {
	        // Creating a single-threaded executor service
	        ExecutorService executorService = Executors.newSingleThreadExecutor();

	        // Creating three runnables
	        MyRunnable runnable1 = new MyRunnable("Thread 1");
	        MyRunnable runnable2 = new MyRunnable("Thread 2");
	        MyRunnable runnable3 = new MyRunnable("Thread 3");

	        // Submitting runnables to the executor service in sequence
	        executorService.submit(runnable1);
	        executorService.submit(runnable2);
	        executorService.submit(runnable3);

	        // Shutting down the executor service
	        executorService.shutdown();

	        try {
	            // Waiting for all threads to finish
	            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("All threads have finished.");
	    }
}
