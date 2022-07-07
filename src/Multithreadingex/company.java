package Multithreadingex;

public class company {
int n;
	synchronized public void produce_item(int n) {
	this.n=n;
	System.out.println("item produced- "+n);
}
	synchronized public int consume_item(int n) {
		this.n=n;
		System.out.println("item consumed- "+n);
		return n;
	}
}
