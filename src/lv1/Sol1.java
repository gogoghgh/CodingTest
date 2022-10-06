package lv1;

public class Sol1 {

	public String solution(int num) {

		String answer = "";

		answer = (num % 2 == 0) ? "Even" : "Odd";

		return answer;
	}

	
	
	public static void main(String[] args) {
		
		Sol1 s = new Sol1();
		System.out.println("solution(3): " + s.solution(3));
		System.out.println("solution(4): " + s.solution(4));
		System.out.println("solution(0): " + s.solution(0));

	}

}
