package Multithreadingassignment;

public class que4 extends Thread {
	 public void run ()
	    {
	        for (int i = 0; i <= 5; i++)
	        {
	        System.out.println ("Run: " + i);
	        
	        }

	    }
	public static void main (String[]args)
	{
	    que4 mt = new que4();
	    mt.start ();
	    mt.run ();
	    for (int i = 0; i <= 5; i++)
	    {
	        System.out.println ("Main: " + i);
	    }
	}
}
