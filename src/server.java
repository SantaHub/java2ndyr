import java.util.Scanner;
import java.net.*;
import java.io.IOException;
import java.io.PrintStream;

class server{
	public static void main(String args[])throws IOException{
		ServerSocket soc = new ServerSocket(2000);
		Socket sockt = soc.accept();
		
		Scanner sc = new Scanner(sockt.getInputStream());
		String inp = sc.nextLine();
		PrintStream ret = new PrintStream(sockt.getOutputStream());
		ret.println(inp.toUpperCase());
	}
}