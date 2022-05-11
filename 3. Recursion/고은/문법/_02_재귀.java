package _01_기초문법;

import java.util.Scanner;

public class _02_재귀 {
	//0~n까지의 양의 정수를 합하는 함수
	public static int sum(int n) {
		if (n == 0) { //base case 
			return 0; 
		}else {
			return n + sum(n-1); //recursion case
		}
	}
	
	//factorial : 1~n까지의 양의 정수를 곱하는 함수
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
	//피보나치 넘버 *n은 음수가 아님 가정
	//f0 = 0, f1 = 1, fn = fn-1 + fn-2 (n > 1)
	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	//최대공약수(enclid method) * m > n
	public static double gcd(int m, int n) {
		if (m < n) {
			int tmp = m; m = n; n = tmp; //swap
		}
		if (m % n == 0) {
			return n;
		}else {
			return gcd(n, m % n);
		}
	}
	
	public static int gcd2(int p, int q) {
		if (q == 0) {
			return p;
		}else {
			return gcd2(q, p % q);
		}
	}
	
	//문자열의 길이 계산
	public static int length(String str) {
		if (str.equals("")) {
			return 0;
		}else {
			return 1+length(str.substring(1));
		}
	}
	
	//문자열의 프린트
	public static void printchars(String str) {
		if(str.length()==0) {
			return;
		}else {
			System.out.println(str.charAt(0));
			printchars(str.substring(1));
		}
	}
	
	//문자열을 뒤집어 프린트
	public static void printCharsReverse(String str) {
		if(str.length()==0) {
			return;
		}else {
			printCharsReverse(str.substring(1));
			System.out.println(str.charAt(0));
		}
	}
	
	//2진수로 변환하여 출력
	public static void printInBinary(int n) {
		if(n < 2) {
			System.out.print(n);
		}else {
			printInBinary(n/2);
			System.out.println(n%2);
		}
	}
	
	//배열의 합 구하기
	public static int sum(int n, int[] data) {
		if (n <= 0) {
			return 0;
		}else {
			return sum(n-1, data) + data[n-1];
		}
	}
	
	//데이터파일로부터 n개의 정수 읽어오기
	public void readFrom(int n, int[] data, Scanner in) {
		if (n == 0) {
			return;
		}else {
			readFrom(n-1, data, in);
			data[n-1] = in.nextInt();
		}
	}
	
	//recursion vs iteration(반복문)
	//모든 순환함수는 반복문으로 변경 가능하며,
	//모든 반복문은 순환함수로 표현 가능하다.
	//복잡한 알고리즘을 단순하게 사용할 때 재귀함수를 쓴다.

}
