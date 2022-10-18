package lv1;

import java.util.Scanner;

// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

public class Sol2 {
	// solution ===================================
	
	public static int solution(int n) {
		
		//약수??
		// 33의 약수 = 1, 3, 11, 33
		// 10의 약수 = 1, 2, 5, 10
		// 100의 약수 = 1, 2, 4, 5, 10, 20, 25, 50, 100
		
		int answer = 0;
		
		for (int i = 1; i <= n; i++) {
		
			if (n % i == 0) {
				System.out.println("i: " + i);
				
				answer += i;
			}
			
		}// for
		
		return answer;
		
	}
	// solution ===================================
	
	
	public static void main(String[] args) {
		int result = solution(12);
		
		System.out.println("result: " + result);

	} // main

} // class 
