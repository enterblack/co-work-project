package minesweeper;

public class MineSweeper {

	public static void main(String[] args) {
		char[][] board = new char[10][10];
		//주변 지뢰  개수 파악을 위한 확장된 배열 선언
		
		int[][] direct = {{-1,-1},{0,-1},{1,-1},{-1,0},{1,0},{-1,1},{-0,1},{1,1}};
		int mineCounter = 0;
		for(int i=0 ; i<10 ; i++) {
			for(int k=0 ; k<10 ; k++) {
				if( Math.random() < 0.3) {
					board[i][k] = '#';
					//이때 지뢰를 설치를 하게되면 그전값이 0보다 커야되고 (x,y둘다) 그전값이 지뢰이면 continue, 아 아니다 어차피 8방향을 다 찾아서 스캔해야되는구나.
					
				}
			}
		}
		 
		
		//출력 하는 부분 (주변에 숫자 표기하기 포함)
		for(int i=0 ; i<10 ; i++) {
			for(int k=0 ; k<10 ; k++) {
				if(board[i][k] == '#') {
					System.out.print("# ");
					continue;
				}else if(board[i][k] - '0' <9 && board[i][k] - '0' > 0){
					System.out.print(board[i][k] + " ");
					continue;
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
