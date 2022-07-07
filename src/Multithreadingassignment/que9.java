package Multithreadingassignment;

public class que9 extends Thread {
	public void run ()
    {
        System.out.println ("run");
    }
    public void start ()
    {
        System.out.println ("start");
        run();
    }
    public static void main (String args[])
    {
        que9 mt = new que9 ();
        mt.start ();
        System.out.println ("main");
    }
}
