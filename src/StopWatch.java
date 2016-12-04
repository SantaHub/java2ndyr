import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopWatch extends Applet implements Runnable, ActionListener {

	int hr=0,min=0,sec=-1;
	Font f = new Font("Arial",Font.MONOSPACED , 40);
	
	public void init(){
		setBackground(Color.LIGHT_GRAY);
		setSize(500, 600);
	}
	public void start(){
		Thread t = new Thread(this);
		t.start();
		
		Button b1 = new Button("RESET");
		b1.setBackground(Color.MAGENTA);
		b1.setBounds(200, 100, 40, 40);
		add(b1);
		b1.addActionListener(this);
	}

	public void paint(Graphics g){
		g.setFont(f);
	
		if(sec==60){
			sec=0;
			min++;
		}
		if(min==60){
			min=0;
			hr++;
		}
		sec++;
		String str = hr+":"+min+":"+sec;
		g.drawString(str, 200, 100);
	}
	public void run(){
		
		while(true){
		repaint();
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("caught an exception");
		}
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		hr=0;min=0;;sec=-1;
	}

}
