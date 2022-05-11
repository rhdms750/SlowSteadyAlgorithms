package _01_���ʹ���;

import java.util.Scanner;

public class _02_��� {
	//0~n������ ���� ������ ���ϴ� �Լ�
	public static int sum(int n) {
		if (n == 0) { //base case 
			return 0; 
		}else {
			return n + sum(n-1); //recursion case
		}
	}
	
	//factorial : 1~n������ ���� ������ ���ϴ� �Լ�
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
	//�Ǻ���ġ �ѹ� *n�� ������ �ƴ� ����
	//f0 = 0, f1 = 1, fn = fn-1 + fn-2 (n > 1)
	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	//�ִ�����(enclid method) * m > n
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
	
	//���ڿ��� ���� ���
	public static int length(String str) {
		if (str.equals("")) {
			return 0;
		}else {
			return 1+length(str.substring(1));
		}
	}
	
	//���ڿ��� ����Ʈ
	public static void printchars(String str) {
		if(str.length()==0) {
			return;
		}else {
			System.out.println(str.charAt(0));
			printchars(str.substring(1));
		}
	}
	
	//���ڿ��� ������ ����Ʈ
	public static void printCharsReverse(String str) {
		if(str.length()==0) {
			return;
		}else {
			printCharsReverse(str.substring(1));
			System.out.println(str.charAt(0));
		}
	}
	
	//2������ ��ȯ�Ͽ� ���
	public static void printInBinary(int n) {
		if(n < 2) {
			System.out.print(n);
		}else {
			printInBinary(n/2);
			System.out.println(n%2);
		}
	}
	
	//�迭�� �� ���ϱ�
	public static int sum(int n, int[] data) {
		if (n <= 0) {
			return 0;
		}else {
			return sum(n-1, data) + data[n-1];
		}
	}
	
	//���������Ϸκ��� n���� ���� �о����
	public void readFrom(int n, int[] data, Scanner in) {
		if (n == 0) {
			return;
		}else {
			readFrom(n-1, data, in);
			data[n-1] = in.nextInt();
		}
	}
	
	//recursion vs iteration(�ݺ���)
	//��� ��ȯ�Լ��� �ݺ������� ���� �����ϸ�,
	//��� �ݺ����� ��ȯ�Լ��� ǥ�� �����ϴ�.
	//������ �˰����� �ܼ��ϰ� ����� �� ����Լ��� ����.

}
