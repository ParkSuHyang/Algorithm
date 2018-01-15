package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class problem_1026 {

	// 보물
	/*
	 * 길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자. S = A[0]*B[0] + ... +
	 * A[N-1]*B[N-1] S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자.
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum=0;

		int[] A = new int[N];
		int[] B = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i=0; i<N; i++){
			sum += A[i]*B[N-1-i];
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
