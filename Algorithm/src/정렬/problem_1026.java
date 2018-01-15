package ����;

import java.util.Arrays;
import java.util.Scanner;

public class problem_1026 {

	// ����
	/*
	 * ���̰� N�� ���� �迭 A�� B�� �ִ�. ������ ���� �Լ� S�� ��������. S = A[0]*B[0] + ... +
	 * A[N-1]*B[N-1] S�� ���� ���� �۰� ����� ���� A�� ���� ��迭����.
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
