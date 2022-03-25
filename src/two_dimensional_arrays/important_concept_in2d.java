package two_dimensional_arrays;

public class important_concept_in2d {
	
	public static void main(String[] args) {
		//int [][] arr=new int[][4];
		int [][] arr=new int[3][];
		arr[0]=new int[4];
		arr[2]=new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		display(arr);
	}
	
	public static void display(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}

	}
}
