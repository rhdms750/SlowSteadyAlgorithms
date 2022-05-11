package _02_����;

import java.util.ArrayList;
import java.util.List;

public class _00_QuickSort {
	
	//�����Ͼ� ���ѹα� ���
	private static void quickSort(int[] arr) {
		quickSort(arr,0,arr.length-1);
	}

	private static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);
		if (start < part2 - 1) { //������ ��Ƽ���� ���� ��Ƽ�Ǻ��� 1�� ���� �� ���� ���̳���
			quickSort(arr, start, part2 - 1);
		}
		if (start < end) { //������ ��Ƽ���� 1�� �̻��� ��
			quickSort(arr, part2, end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];
		while (start <= end) {
			while (arr[start] < pivot) start++;
			while (arr[end] > pivot) end--;
			if (start <= end) {
				swap (arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}

	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}

	private static void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + ",");
		}
		System.out.println();
	}
	
	//�˰���� �ڷᱸ�� ���
	public static <T extends Comparable<? super T>> List<T> quicksort(List<T> list)
	{
		if (list.size() <= 1) return list;
		
		int pivot = list.size() / 2;
		
		List<T> a = new ArrayList<T>(); //lesser
		List<T> b = new ArrayList<T>(); //greater
		
		int c = 0; //same
		
		for (T number : list) {
			if (list.get(pivot).compareTo(number) < 0) //-1, number > pivot
				b.add(number);
			else if (list.get(pivot).compareTo(number) > 0) //+1, number < pivot
				a.add(number);
			else
				c++;
		}
		
		a = quicksort(a);
		for (int i = 0; i < c; i++) {
			a.add(list.get(pivot));
		}
		
		b = quicksort(b);
		
		List<T> sorted = new ArrayList<T>();
		sorted.addAll(a);
		sorted.addAll(b);
		return sorted;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
