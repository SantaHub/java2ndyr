import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TCPs {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(8081);
		Socket s = ss.accept();
		
		Scanner sc = new Scanner(s.getInputStream());
		PrintStream ps = new PrintStream(s.getOutputStream());
		System.out.println("server running");
	
		String msg = sc.nextLine();
 		
		System.out.println(msg);
		ps.println(msg.toUpperCase());
	}
}
