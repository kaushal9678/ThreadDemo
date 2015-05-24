/**
 * 
 */

/**
 * @author kaushlendra
 *
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Here we create instance of ThreadClass to create a sub thread that
		 * prints number 1 to 10
		 */

		ThreadClass thread1 = new ThreadClass();
		thread1.start();
		
		ThreadClass thread2=new ThreadClass();
		thread2.start();
		
		/**
		 * Here we use main thread that prints number 1 to 10
		 * 
		 */

		for (int i = 0; i < 10; i++) {
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
