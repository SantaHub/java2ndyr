
public class sub extends Thread{

	int a =10;

	public void subme(){
		a = a-10;
		display();
	}
	public void run(){
		subme();
	}
	
	public void display(){
		System.out.print(a);
	}
}
