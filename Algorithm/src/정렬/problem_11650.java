package 정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class problem_11650 {
	
	// 좌표 정렬하기
	/* 2차원 평면 위의 점 N개가 주어진다. 
	 * 좌표를 x좌표가 증가하는 순으로, 
	 * x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램.
	*/
	public static void main(String args[]){	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int coordinateArray[][] = new int[N][2];
		
		for(int i=0; i<N ; i++){
			coordinateArray[i][0] = sc.nextInt();
			coordinateArray[i][1] = sc.nextInt();
		}
		
		
		Arrays.sort(coordinateArray, new Comparator<int []>(){
			public int compare(int a[], int b[]){
				if(a[0] == b[0])
					return Integer.compare(a[1], b[1]);
				else
					return Integer.compare(a[0], b[0]);
			}
		});
		
		for(int i=0; i<N ; i++)
			System.out.println(coordinateArray[i][0]+" "+coordinateArray[i][1]);
		
		sc.close();
	}

}
