package Multithreadingex;

public class threadOP  {
public static void main(String[] args) {
	
	System.out.println("program started......");
	
	int x=55+66;
	System.out.println("the sum is  "+x);
	Thread t=Thread.currentThread();
	String tname=t.getName();
	System.out.println("the current executing thread is...."+tname);
	//set name
	t.setName("yeh bhai main thread hai");
	System.out.println("after changing thread name- "+t.getName());
	try {
		Thread.sleep(2000);
	}
	catch(Exception e) {
		
	}
	System.out.println(t.getId());
	System.out.println("program ended.....");
}
}
