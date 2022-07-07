package Multithreadingex;
//creating thread using thread class
public class myanotherthread extends Thread{
public void run() {
	for(int i=0;i<10;i++)
	{
		System.out.println("the value for i of another thread "+i);
	}
}
public static void main(String[] args) {
	myanotherthread t1=new myanotherthread();
	t1.run();
	//t1.start();
}
}
