
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int numWaysTraverseGraph(int w, int h) {
		
		int[][] square = new int[h][w];
		
		for(int i = 0; i < square[0].length; i++)
			square[0][i] = 1;
		for(int i = 0; i < square.length; i++) 
			square[i][0] = 1;
		
		for(int row = 1; row < h; row++) {
			for(int col = 1; col < w; col++) {
				square[row][col] = square[row - 1][col] + square[row][col - 1];
			}
		}
		
		printSquare(square);
		
		return square[h - 1][w - 1];
	}
	
	public static void printSquare(int[][] square) {
		for(int x = 0; x < square[0].length; x++) {
			for(int y = 0; y < square.length; y++) {
				System.out.print(square[y][x] + " ");
			}
		}
		System.out.println();
	}
}
