package sungil2023_03_09;

import java.util.Scanner;

class sungil2023_03_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}

}
