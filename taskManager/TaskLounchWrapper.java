package taskManager;

public class TaskLounchWrapper implements Runnable {

	@Override
	public void run() {
		
		try{
			// here must be usefull code of our task
		}
		catch(Exception exception){
			System.out.println(exception.getStackTrace().toString());
			
		}


	}

}
