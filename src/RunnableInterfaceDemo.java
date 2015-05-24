/**
 * 
 */

/**
 * @author kaushlendra
 *
 */
public class RunnableInterfaceDemo implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++){
			try {
				// by using sleep method of Thread class we
				// can sleep thread for 1second
				Thread.sleep(1000); 
			Thread t= Thread.currentThread();
			String threadName= t.getName();
				System.out.println("Printing from Sub Thread name "+" "+ threadName+" "+"value " +i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
