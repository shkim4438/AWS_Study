package j04_연산자;

public class Operation6 {
	public static void main(String[] args) {
		/*
		 * 시험 성적을 학점으로 계산하는 프로그램.
		 * 
		 * 정수자료형 score변수 선언
		 * 88점으로 초기화
		 * 
		 * 문자자료형 grade변수 선언
		 * 
		 * 조건 
		 * score가 0점 보다 작거나 100점보다 크면 x를 출력
		 * score가 90 ~ 100점이면 A학점
		 * score가 80 ~ 89점이면 B학점
		 * score가 70 ~ 79점이면 C학점
		 * score가 60 ~ 69점이면 D학점
		 * score가 0 ~ 59점이면 F학점
		 * 
		 */
		
		
		int score = 88;
		char grade = score > 100 || score < 0 ? 'X' // score가 > 100보다 크다, score < 0보다 작다.
				: score < 60 ? 'F' 
				: score < 70 ? 'D' 
				: score < 80 ? 'C'
				: score < 90 ? 'B' : 'A';
		char plus = score > 100 || score < 60 ? '\0' : score % 10 > 4 || score == 100 ?  '+' : '\0'; 
		
		System.out.println("점수(" + score + "): " + grade + "학점");
		System.out.println("점수(" + score + "): " + grade + plus + "학점");
		
	}
}
