package Multithreadingassignment;

public class QUE2 extends Thread {
	 public void run ()
	    {
	        for (int i = 0; i <= 50; i++)
	        {
	            System.out.println ("Run: " + i);
	            
	        }
	    }
	public static void main (String[]args)
	{
	    QUE2 mt = new QUE2();
	    mt.start ();
	    mt.run ();
	    for (int i = 0; i <= 50; i++)
	    {
	        System.out.println ("Main: " + i);
	        
	    }
	    
	}
}
