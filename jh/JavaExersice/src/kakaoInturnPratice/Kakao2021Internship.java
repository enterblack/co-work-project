package kakaoInturnPratice;

public class Kakao2021Internship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	class Solution {
	    public int solution(String s) {
	        //zero, one, two, three, four, five, six, seven, eight, nine
	        int answer = 0;
	        String tempStr = "";
	        String tempInt = "";
	        for(int i=0 ; i<s.length() ; i++){
	            if(s.charAt(i) - '0' <= 9 && s.charAt(i) -'0' >= 0){
	                tempInt += s.charAt(i);
	            }else{
	                tempStr += s.charAt(i);
	                switch(tempStr){
	                    case "one" : tempInt += "1";
	                        tempStr = "";
	                        break;
	                    case "two" : tempInt += "2";
	                        tempStr = "";
	                        break;
	                    case "three" : tempInt += "3";
	                        tempStr = "";
	                        break;
	                    case "four" : tempInt += "4";
	                        tempStr = "";
	                        break;
	                    case "five" : tempInt += "5";
	                        tempStr = "";
	                        break;
	                    case "six" : tempInt += "6";
	                        tempStr = "";
	                        break;
	                    case "seven" : tempInt += "7";
	                        tempStr = "";
	                        break;
	                    case "eight" : tempInt += "8";
	                        tempStr = "";
	                        break;
	                    case "nine" : tempInt += "9";
	                        tempStr = "";
	                        break;
	                }
	            }
	        }
	        answer = Integer.parseInt(tempInt);
	        return answer;
	    }
	}
	
	////1번 문제 
	
	
	
	class Solution2 {
	    public int[] solution2(String[][] places) {
	    	int[] answer = {};
	        //5개의 대기실을 검사
	        String[] tempStr = new String[5];
	        for(int i=0 ; i<places.length ; i++){
	            //1차 데이터에서 하나의 String으로 받기
	            for(int j=0 ; j<places[i].length ; j++){
	                tempStr[i] += places[i][j] ;
	            }
	            tempStr[i] = "";
	        }
	        //하다가 지운 코드
//	        int tempInt = 0;
//	        String[][] tempArr = new String[5][5];
//	        for(int i=0 ; i<tempStr.length ; i++){
//	            if(i%5 == 0){
//	                tempInt++;
//	                tempArr[tempInt][i%5] = tempStr[i];
//	            }else{
//	                tempArr[tempInt][i%5] = tempStr[i];
//	            }
//	            
//	        }
	        System.out.println();
	        return answer;
	        
	    }
	}
	
	///3번 문제
	class Solution3 {
	    public String solution(int n, int k, String[] cmd) {
	        String answer = "";
	        String rememberNumber = "";
	        for(int i=0 ; i<n ; i++){
	            answer += "O";
	        }
	        for(int i=0 ; i<cmd.length ; i++){
	        
	            if(cmd[i].matches("D ^[0-9]")){
	                cmd[i].replaceAll("[^0-9]","");
	                int tempInt = Integer.parseInt(cmd[i].charAt(0)+"");
	                k = k + tempInt;
	                System.out.println(k);
	            }else if(cmd[i].matches("U ^[0-9]")){
	                cmd[i].replaceAll("[^0-9]","");
	                int tempInt = Integer.parseInt(cmd[i].charAt(0)+"");
	                k = k - tempInt;
	            }else if(cmd[i] == "C"){
	                answer.replace(answer.charAt(i), 'X');
	                //되돌리기를 위해서 그때의 K를 알고 있어야하고
	                //삭제가 되면 그다음 숫자들이 다 -1 씩 해주면 되는구나
	                //되돌리기를 하면 그때에 k에 다시 넣고 그 밑 에 있는 숫자들은 다시 +1
	                rememberNumber +=  (k+"") ;
	                n--;
	                //끝항 삭제시 k 값 -1
	                if(k > n ){
	                    k--;
	                }
	            }else if(cmd[i] == "Z"){
	                answer.replace(answer.charAt(i), 'O');
	                
	                n++;
	            }
	        }
	        return answer;
	    }
	}
	
	
	
	
}
