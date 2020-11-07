package simplilearn;

public class RectangularArray {

	public static void main(String[] args) {
		//int[][] twoDim = new int[5][5];
		
		int[][] twoDim = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		for (int i = 0; i < twoDim.length; i++) {
			for (int j = 0; j < twoDim[i].length; j++) {
				System.out.print(twoDim[i][j] + " ");
			}
			System.out.println();
			
		}

	}

}
