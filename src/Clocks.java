import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;


public class Clocks extends Applet implements Runnable{

	
	Date d;
	public void init(){
		new Thread(this).start();
	}
	
	
	public void paint(Graphics g){
		g.drawString(d.toString(), Font.BOLD, 40);
		
	}
	
	public void run(){
		while(true){
			d=new Date();
			repaint();
			try{
				Thread.sleep(1000);
				}catch(InterruptedException e){
					System.out.println();
				}
		}
	}

}
