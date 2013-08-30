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
	RemoteTask _remoteTask;
	private boolean _emptyName;
	private boolean _needRemoteExecution;
	
	SimpleTaskHere(){
		System.out.println("Next empty task created.");
		_emptyName = true;
		_needRemoteExecution = false;
	}
	
	SimpleTaskHere(String name){
		_taskName = name;
		System.out.println("Task" + _taskName + " created.");
		_emptyName = false;
		_needRemoteExecution = false;
	}
	
	SimpleTaskHere(String name, RemoteTask remoteTask){
		_taskName = name;
		_remoteTask = remoteTask;
		_emptyName = false;
		_needRemoteExecution = true;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (!_emptyName) Thread.currentThread().setName(_taskName);
		if (_needRemoteExecution){
			/**
			 * here need to implement call remote functions,
			 * as RMI 
			 */
			;
		} else {
			/**
			 *  ordinary call local routine
			 */
			;
		}



}
