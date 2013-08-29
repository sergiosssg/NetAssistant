import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class EchoServerSample {

	public static void main(String[] args) {
		try{
			// Создание сокета на стороне сервера
			ServerSocket s = new ServerSocket(8189);
			
			// Ожидание обращения клиента
			Socket incomming = s.accept();
			try{
				InputStream inStream = incomming.getInputStream();
				OutputStream outStream = incomming.getOutputStream();
				
				Scanner in = new Scanner(inStream);
				PrintWriter out = new PrintWriter(outStream, true);
				    /*  автоматическая передача оставшихся данных */
				
				out.println("Hello ! Enter BYE to exit.");
				
				// Передача клиенту полученных от него данных
				boolean done = false;
				while (!done && in.hasNextLine()){
					String line = in.nextLine();
					out.println("Echo : " + line);
					if (line.trim().equals("BYE"))
						done = true;
				}
			}
			finally{
				incomming.close();
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}

	}

}
