package test;

public class title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] strArray = {
				{"띵글 스톡 체험판 이렇게 사용하세요~ [1]" ,  "라온 정달",  "2020.09.02", "264", "3"},
				{"[공지] 일요일 오후 9시 방송 시작합니다." ,  "프로그",  "2020.09.02", "35", "0"},
				{"[필독] 2020년 12월 신규 탐험대를 모집합니다." ,  "라온 정달",  "2020.09.02", "55", "0"},
				{"[공지] 프로그 지분 15구좌 양도합니다." ,  "프로그",  "2020.09.02", "250", "0"},
				{"[공지] 프로그 차트 특허 등록이 결정되었습니다." ,  "프로그",  "2020.09.02", "263", "20"},
				{"[필독] 신입 회원 필독사항입니다. [123]" ,  "라온 정달",  "2020.09.02", "1,731", "31"},
				{"[공지] 주식 양도 절차 [3]" ,  "프로그",  "2020.09.02", "199", "3"},
		};
		
	
		for(int i = 0; i<strArray.length; i++) {
			for (int k = 0; k<strArray[i].length; k++ ) {
				System.out.println(strArray[i][k] + "\t");
			}
			
		}	

	}		//"strArray["+i+"]["+k+"]= " + 
}	//"strArray[i]"+ "strArray[k]" +"\t"
//("strArray[i][k]" +"\t");
                              