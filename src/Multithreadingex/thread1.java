package Multithreadingex;

public class thread1 extends Thread {
public void run() {
	int sum=0;
	for(int i=0;i<=10;i++)
	{
		sum+=i;
		System.out.println("Thread 1 value:-"+sum);
	}
	System.out.println("Thread 1 sum- "+sum);
	
}
public static void main(String[] args) {
	thread1 t1=new thread1();
	thread2 t2=new thread2();
	thread3 t3=new thread3();
	t1.run();
	t2.run();
    t3.run();	
}
}
