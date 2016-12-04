import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;

public class client {
	public static void main(String args[]) throws UnknownHostException, IOException{
		Socket sockt = new Socket("localhost",2000);
		PrintStream out= new PrintStream(sockt.getOutputStream());
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(sockt.getInputStream());
		
		System.out.println("Enter the string : ");
		String sr = sc.nextLine();
		out.println(sr);
		System.out.println(in.nextLine());		
	}
}
