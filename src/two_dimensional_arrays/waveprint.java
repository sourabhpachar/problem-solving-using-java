package two_dimensional_arrays;

public class waveprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
		spiral_display(arr);

	}

	public static void spiral_display(int[][] arr) {
		int i = 0;
		int j = 0;
		for (i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			} else {
				for (j = arr[i].length - 1; j == 0; j--) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
	}

}
