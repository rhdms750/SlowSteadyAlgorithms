package _03_����.���;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex01_10872_���丮�� {

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
