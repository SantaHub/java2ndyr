import java.applet.Applet;

public class mousee  extends Applet {

	test fw ;
	
	@Override
	public void init(){
		fw = new test();
	}
	
	@Override
	public void start(){
		fw.setVisible(true);
		fw.setSize(300,400);

	}

}
