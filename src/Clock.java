import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clock extends Applet implements Runnable, ActionListener {

    Font font=new Font("Arial",Font.BOLD,40);
    int hr=0,min=0,sec=-1;
    
    @Override
    public void init() {
        setBackground(Color.DARK_GRAY);  
    }

    @Override
    public void start() {
        Thread t=new Thread(this); //for the repaint function
        t.start();
        
        setSize(700,500);
        
        Button b1;
        b1=new Button("RESET");
        b1.setBackground(Color.white);
        b1.setBounds(300, 400, 40,40);
        add(b1);
        b1.addActionListener(this);
    }
    @Override
    public void run() {
        while(true){
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                    System.out.println("Exc");
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setFont(font);
        g.setColor(Color.BLUE);
        sec++;
        if(sec==60){
            sec=0;
            min++;
        }
        if(min==60){
            min=0;
            hr++;
        }
        String str= hr+" : "+ min + " : " + sec;
        g.drawString(str, 50, 100);
}

	@Override
    public void actionPerformed(ActionEvent e) {
        hr=0;min=0;sec=-1;
    }


}
