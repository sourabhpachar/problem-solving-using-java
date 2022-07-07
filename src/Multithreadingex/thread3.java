package Multithreadingex;

public class thread3 extends Thread {
public void run() {
	int sum=0;
	for(int i=0;i<=10;i++)
	{
		sum+=i;
		System.out.println("Thread 3 value:-"+sum);
	}
	System.out.println("Thread 3 sum- "+sum);
}
public static void main(String[] args) {
	//thread1 t1=new thread1();
	//t1.run();
}
}
