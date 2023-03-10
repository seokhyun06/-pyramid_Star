package sungil2023_03_09;

import java.util.Scanner;

public class Pyramid_Star {

	public static void main(String[] args) {
		int n;
		int i;
		int j;
		int num; // 4
	
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단 삼각형이십니까? : "); 
		num = sc.nextInt();
		System.out.println(); // 줄바꿈
		
		for(n = 1; n <= num; n++) { // n(현재 단)이 num(전체단)보다 작거나 같을때까지 증가
		for(i = 1; i <= num-n; i++) { // i(공백)이 num(전체단)-n(현재단)보다 작거나 같을때까지 증가
			System.out.print(" "); 
		}
			for(j = 0; j < (n-1)*2+1; j++){ // (n-1)*2+1 개의 '*'을 출력
				System.out.print("*");; 
		}
			System.out.println(); // 줄바꿈
		}

	}
}