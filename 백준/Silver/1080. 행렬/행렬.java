import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static int row;
	public static int col;
	public static int[][] A;
	public static int[][] B;
	public static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		row = sc.nextInt();
		col = sc.nextInt();
		A = new int [row][col];
		B = new int [row][col];

		//기본 map 세팅
		for(int i = 0 ; i <row; i ++) {
			String str = sc.next();
			for(int j = 0 ; j < col ; j++) 
				A[i][j] = Integer.parseInt(str.substring(j,j+1));
		}

		//바꾸고 싶은 map 세팅
		for(int i = 0 ; i <row; i ++) {
			String str = sc.next();
			for(int j = 0 ; j < col ; j++) 
				B[i][j] = Integer.parseInt(str.substring(j,j+1));
		}

		cnt = 0;
		//탐색 시작(배열 범위 넘어가지않게 row-2 , col-2 까지만 돌림
		for(int i = 0 ; i < row-2; i++) {
			for(int j = 0 ; j < col-2; j++) {
				// i,j 가 다르다면 뒤집는다(이 지점은 다시뒤집을수 없는 지점이므로 무조건 뒤집음)
				if(A[i][j] != B[i][j]) {
					change(i,j);
					cnt++;
				}
			}
		}

		//A,B배열이 같은지 확인
		int flag = 0;
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				if(A[i][j] == B[i][j])
					flag ++;
			}
		}

		if(flag == row*col)
			System.out.println(cnt);
		else 
			System.out.println(-1);

	}

	
	//i,j 기준으로 3*3 크기만큼 비트 뒤집기
	public static void change(int x , int y) {
		for(int i = x ; i <x+3 ; i++) {
			for(int j = y; j<y+3 ; j++) {
				A[i][j] = A[i][j] ^ 1 ;
			}
		}
	}


}