package Multithreadingassignment;

public class que8 {
	public void run ()
    {
        System.out.println ("run");
    }
    public void start ()
    {
        System.out.println ("start");
    }
    public static void main (String args[])
    {
        que8 mt = new que8 ();
        mt.start ();
        System.out.println ("main");
    }

	

}
