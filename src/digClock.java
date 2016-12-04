import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class digClock extends Applet implements Runnable{
	
	String time="";
	Date date = new Date();
	Calendar cal;

	public void init(){
		setBackground(Color.LIGHT_GRAY);
		setSize(400, 200);
	}
	public void start(){
		new Thread(this).start();
		
	}
	
	public void run(){
		while(true){
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
		}
		repaint();
		}
	}

	public void paint(Graphics g){
		cal = Calendar.getInstance();
		date = cal.getTime();
		
		SimpleDateFormat dat = new SimpleDateFormat("hh:mm:ss");
		time = dat.format(date);
		
		g.drawString(time, 75, 50);
	}
}