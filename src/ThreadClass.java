/**
 * 
 */

/**
 * @author kaushlendra
 * This class is used to create a sub thread using Thread Class. 
 * in this class we override thread run() method and print number from 1 to 10 
 *
 */
public class ThreadClass extends Thread {

	/**
	 * @param args
	 * 
	 * Here we override run method of Thread class and print numbers from 1 to 10
	 */
	
	@Override
	
	public void run(){
		for(int i=0;i<=10;i++){
			try {
				Thread.sleep(1000);
				Thread t= Thread.currentThread();
				String threadNames= t.getName();
				
				System.out.println("Printing from sub Thread name "+" "+ threadNames+" "+"value " +i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
