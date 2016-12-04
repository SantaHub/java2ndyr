public class PC3 {
	public static void main(String[] args) {
		Q3 q = new Q3();
		ProducerConsumer3 t1 = new ProducerConsumer3("Producer", q);
		ProducerConsumer3 t2 = new ProducerConsumer3("Consumer1", q);
		ProducerConsumer3 t3 = new ProducerConsumer3("Consumer2", q);
	}
}

class ProducerConsumer3 implements Runnable {
	Q3 q;
	Thread t;

	ProducerConsumer3(String name, Q3 q) {
		t = new Thread(this, name);
		this.q = q;
		t.start();
	}

	public void run() {
		if (t.getName().equals("Producer")) {
			for (int i = 1; i <= 5; i++) {
				q.put(i);
			}
		} else {
			for (int i = 1; i <= 5; i++) {
				q.get();
			}
		}
	}
}

class Q3 {
	int i;

	synchronized void get() {
		if (i != 0)
			System.out.println("get :" + i + Thread.currentThread());
		i = 0;
		notify();

		try {
			wait();
		} catch (Exception e) {

		}
	}

	synchronized void put(int a) {
		this.i = a;
		System.out.println("put :" + i);
		notify();
		try {
			wait();
		} catch (Exception e) {

		}
	}
}