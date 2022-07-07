package one_dimensional_array;

public class any_base_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int sb=2;;
 int n=11101;
 any_base_to_decimal(n, sb);
	}
	// n is the number in sb{source base} andd db{destination base}
	public static void any_base_to_decimal(int n,int sb){
		
		int multiplier=1;
		int rem=0;
		int ans=0;
		while(n>0)
		{
			rem=n%10;
			ans+=rem*multiplier;
			n/=10;
			multiplier*=sb;
		}
		System.out.println(ans);
	}
}
