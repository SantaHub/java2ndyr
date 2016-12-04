import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FIle {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileWriter fw =new FileWriter("fil.txt"); 
		PrintWriter pw = new PrintWriter(fw);
		
		FileReader fr = new FileReader("fil2.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!= null){
			pw.println(str);
		}

	}

}
