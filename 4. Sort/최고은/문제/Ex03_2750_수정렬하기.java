package _02_��������;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2750

public class Ex03_2750_�������ϱ� {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int[] arr = new int[scann.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scann.nextInt();
		}
		
		//��������
		int tmp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		//���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
