package _03_ÀÀ¿ë.Àç±Í;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex01_10872_ÆÑÅä¸®¾ó {

	public static void main(String[] args) throws Exception{
		InputStreamReader st = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(st);
		
		int N = Integer.parseInt(reader.readLine());
		
		System.out.println(factorial(N));
		
	}
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}

}
