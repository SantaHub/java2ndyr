
public class add extends Thread{

	int a =10;
	
	public void addme(){
		a = a+10;
		display();
	}
	public void run(){
		addme();
	}
	
	public void display(){
		System.out.print(a);
	}
}
