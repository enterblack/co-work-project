package kakaoInturnPratice;

import java.util.Stack;

class Solution20210418 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        //스택 선언
        stack.push(0);
        //스택 초기값 삽입
        
        for(int move : moves) {
        //여기서 왜 0부터 시작하는 for문이 안되는지 조금은 생각해보기
        	for(int j=0 ; j<board.length ; j++) {
        		//나는 왜 i랑 j가 서로 바뀌어야되는지 아직 이해를 못하는 상태이다 그래서 이걸 다시본다면 다시 생각해보자.
        		//내가 배열에대해서 많이 부족한건가 그래서 모르겠다.
        		if(board[j][move-1] != 0) {
        			if(stack.peek() == board[j][move-1]) {
        				stack.pop();
        				answer += 2;
        			}else {
        				stack.push(board[j][move-1]);
        			}
        			board[j][move-1] = 0;
        			break;
        				
        		}
        	}
        }   
        return answer;
	}
}
