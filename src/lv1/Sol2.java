package lv1;

import java.util.Scanner;

// ���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

public class Sol2 {
	// solution ===================================
	
	public static int solution(int n) {
		
		//���??
		// 33�� ��� = 1, 3, 11, 33
		// 10�� ��� = 1, 2, 5, 10
		// 100�� ��� = 1, 2, 4, 5, 10, 20, 25, 50, 100
		
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
