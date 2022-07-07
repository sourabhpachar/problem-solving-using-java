package Multithreadingex;

public class MyThread implements Runnable{
public void run() {
	//task for thread
	for(int i=0;i<10;i++) {
		System.out.println("value of i is "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public static void main(String[] args) {
	MyThread t1=new MyThread();
	Thread thr=new Thread(t1);
	myanotherthread t2=new myanotherthread();
	
	thr.start();
	//thr.run();
	t2.start();
	
}
}
