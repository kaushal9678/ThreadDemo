/**
 * 
 */

/**
 * @author kaushlendra
 *
 */
public class RunnableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Here we use main thread that prints number 1 to 10
		 * 
		 */

		// Create an instance of RunnableInterface and pass that to Thread class
		// constructor

		RunnableInterfaceDemo runnable = new RunnableInterfaceDemo();
		Thread threadRunnable = new Thread(runnable);
		threadRunnable.start();

		Thread threadRunnable2 = new Thread(runnable);// Here we create two thread object to print value from 1 to 10
		threadRunnable2.start();
		
		
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);// by using sleep method of Thread class we
									// can sleep thread for 1second
				Thread t= Thread.currentThread();
				String threadNames= t.getName();
				
				System.out.println("Printing from Main Thread name "+" "+ threadNames+" "+"value " +i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
