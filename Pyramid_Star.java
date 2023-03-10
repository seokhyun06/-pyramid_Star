package sungil2023_03_09;

import java.util.Scanner;
public class Pyramid_Star {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단 삼각형이십니까? : "); 
		int num = sc.nextInt(); // n = 4 가정
		System.out.println(); // 줄 바꿈
		
		for(int n = 1; n <= num; n++) { // n(현재 단)이 num(전체단)보다 작거나 같을때까지 증가
		for(int i = 1; i <= num-n; i++) { // 공백 출력
			System.out.print(" "); 
		}
			for(int j = 0; j < (n-1)*2+1; j++){ // 별 출력
				System.out.print("*");; 
		}
			System.out.println(); // 줄 바꿈
		}

	}
}