package _03_응용.재귀;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex02_10870_피보나치수5{
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		System.out.println(fibonacci(n));
	}	
	
	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		}else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
}
