package core_java;

public class strings {
public static void main(String[] args) {
	String first="java";
	String second="python";
	String third ="javascript";
	System.out.println(first);
	System.out.println(first.length());
	String joined=first.concat(second);//joining two strings
	System.out.println(joined);
   boolean comp=first.equals(second);
   System.out.println(comp);
   System.out.println(first.charAt(2));
   System.out.println(first.toUpperCase());
   System.out.println(first.startsWith("j"));
   System.out.println(first.endsWith("t"));
}
}
