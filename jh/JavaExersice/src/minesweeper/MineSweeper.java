package minesweeper;

public class MineSweeper {

	public static void main(String[] args) {
		boolean[][] board = new boolean[10][10];
		int mineCounter = 0;
		for(int i=0 ; i<10 ; i++) {
			for(int k=0 ; k<10 ; k++) {
				if( Math.random() < 0.3) {
					board[i][k] = true;
				}
			}
		}
		for(int i=0 ; i<10 ; i++) {
			for(int k=0 ; k<10 ; k++) {
				if(board[i][k]) {
					System.out.print("# ");
				}else {
					//이제 이부분에 주변에 지뢰가 있으면 개수 카운트 해야됨
					System.out.print(". ");
				}
			}
			System.out.println();
		}

	}

}
