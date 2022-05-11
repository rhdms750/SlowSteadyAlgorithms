package _02_����;

public class _01_MergeSort {
	
	//[[�ν�Ʈ �ڽ� ���]]
	static int[] array, temp;
	
	public static void mergeSort(int[] arr) {
		array = arr;
		temp = new int[array.length];
		split(0, array.length-1);
	}
	
	//����Ʈ�� 1���� ���� ������ ������.
	private static void split(int low, int high) {
		if (low == high) return; //���� �ϳ��� ������ ������ �ʿ� ����
		int mid = high + low / 2;
		split(low, mid);
		split(mid+1,high);
		merge(low,mid,high);
	}
	
	//��� �� �� ������ �°� �����Ѵ�.
	private static void merge(int low, int mid, int high) {
		int i = low, j = mid+1, tempposn = low;
		
		//���� ����Ʈ�� ��� �񱳿� ����
		while (i <= mid && j <= high) {
			if (array[i] <= array[j]) {
				temp[tempposn++] = array[i++];
			}
			else {
				temp[tempposn++] = array[j++];
			}
		}
		
		//i�� mid�� ����, j�� high�� �� ������ �ݺ�
		while (i <= mid) temp[tempposn++] = array[i++];
		while (j <= high) temp[tempposn++] = array[j++];
		
		//���� �迭�� �ٽ� ����
		for (tempposn = low; tempposn <= high; tempposn++)
			array[tempposn] = temp[tempposn];
		
	}
	
	//[[�����Ͼ� ���ѹα� ���]]
	private static void mergeSort2(int[] arr2) {
		int[] tmp = new int[arr2.length];
		mergeSort2(arr2, tmp, 0, arr2.length - 1);
	}
	
	private static void mergeSort2(int[] arr2, int[] tmp, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort2(arr2, tmp, start, mid);
			mergeSort2(arr2, tmp, mid+1, end);
			merge2(arr2, tmp, start, mid, end);
		}
	}
	
	private static void merge2(int[] arr, int[] tmp, int start, int mid, int end) {
		for (int i = start; i <= end; i++) {
			tmp[i] = arr[i];
		}
		int part1 = start;
		int part2 = mid + 1;
		int index = start;
		while (part1 <= mid && part2 <= end) {
			if (tmp[part1] <= tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			}else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		for (int i = 0; i <= mid - part1; i++) {
			arr[index+i] = tmp[part1+i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
