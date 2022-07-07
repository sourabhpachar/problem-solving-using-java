package Multithreadingassignment;

public class que10  extends Thread{
	public void run ()
    {
        System.out.println ("custom");
    }
    public void start ()
    {
        System.out.println ("start");
        run();
        super.start ();
    }
    public static void main (String args[])
    {
        que10 mt = new que10 ();
        mt.start();
        System.out.println ("main");
    }
}
