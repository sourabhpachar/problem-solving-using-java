package Multithreadingassignment;

public class QUE1 {
	public void run ()
    {
        for (int i = 0; i <= 50; i++)
        {
            System.out.println ("Run: " + i);
        }
    }
    public static void main (String[]args)
    {
        QUE1 mt = new  QUE1 ();
        mt.run ();
        for (int i = 0; i <= 50; i++)
        {
            System.out.println ("Main: " + i);
        }
    }
}
