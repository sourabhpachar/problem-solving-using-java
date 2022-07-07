package Multithreadingassignment;

public class que7 extends Thread {
	public void run ()
    {
        System.out.println ("run");
    }
    public void start ()
    {
        System.out.println ("start");
    }
    public static void main(String[] args) {
		que7 mt=new que7();
		mt.run();
	}
}
