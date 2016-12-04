import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class trafficLight extends Applet implements Runnable {

	int x,y,dx,dy;
	public void init(){
		
	}
	public void start(){
	
	}
	@Override
	public void run()  {
		
	}

	public void paint(Graphics g){
		
		g.setColor(Color.black);

		g.fillRect(50, 50, 100, 350);
		
		g.setColor(Color.yellow);
		g.fillOval(50, 50, 100, 100);
		g.fillOval(50, 170, 100, 100);
		g.fillOval(50, 300, 100, 100);

	}

}
