public class Ex15_if {

	public static void main(String[] args) {
		//제어문-분기문(비교문)
		//if 문 
		//if (비교문) { 만족(true)할 때 실행할 문장들; }
		//if (비교문) {
		//    실행할 문장;
		//}
		//비교문의 결과 값은 true, false
		int num1 = 10;
		int num2 = 20;
		boolean result = num1 < num2;
		if (num1 < num2) {
			System.out.println("num1이 num2보다 작습니다.");
		}
		System.out.println("비교작업 끝");
		
		if (result) {
			System.out.println("num1이 num2보다 작습니다.");
		}
		System.out.println("=======================");
		//점수 평가 결과 : 수, 우, 미, 양, 가 출력
		//100 ~ 90 : 수
		//89 ~ 80 : 우
		//79 ~ 70 : 미
		//69 ~ 60 : 양
		//59 ~ 0 : 가
		int jumsu = 59;
		if (jumsu >= 90 && jumsu <= 100) {
			System.out.println("성적 : 수");
		}
		if (jumsu >= 80 && jumsu <= 89) {
			System.out.println("성적 : 우");
		}
		if (jumsu >= 70 && jumsu <= 79) {
			System.out.println("성적 : 미");
		}
		if (jumsu >= 60 && jumsu <= 69) {
			System.out.println("성적 : 양");
		}
		if (jumsu >= 0 && jumsu <= 59) {
			System.out.println("성적 : 가");
		}
		
		
	}
}