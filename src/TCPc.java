import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class TCPc {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost",8081);
		
		Scanner sc= new Scanner(s.getInputStream());
		Scanner in = new Scanner(System.in);
		PrintStream ps = new PrintStream(s.getOutputStream());
		
		System.out.println("Enter the msg : ");
		String ip= in.nextLine();
		
		ps.println(ip);
		
		//reply
		String rep = sc.nextLine();
		System.out.println(rep);

	}

}
