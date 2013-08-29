/**
 * 
 */
package TaskManager;

import java.rmi.Remote;

/**
 * @author SSG
 *
 */
public class SimpleTaskHere implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	
	String _taskName;
	
	SimpleTaskHere(){
		System.out.println("Next empty task created.");
	}
	
	SimpleTaskHere(String name){
		_taskName = name;
		System.out.println("Task" + _taskName + " created.");
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
