package Multithreadingassignment;

public class que5 extends Thread {
	public void run ()
    {
        for (int i = 0; i <= 50; i++)
        {
            System.out.println ("Run: " + i);
        }
    }
    public static void main (String[]args)
    {
        que5 mt = new que5();
        mt.start ();
        mt.start ();
        for (int i = 0; i <= 50; i++)
        {
            System.out.println ("Main: " + i);
        }
    }
}
