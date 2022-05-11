package _01_���ʹ���;

public class _02_���2 {
	//��ȯ�� �˰��� ����
	//1. ��� �ϳ��� base case�� �ʿ��ϴ�.
	//2. �Ͻ��� �Ű������� ����� �Ű������� �ٲپ��.(implicit - > explicit)
	
	//���� Ž�� (sequential search, linear search)
	public static int search(int[] data, int n, int target) {
		for (int i = 0; i < n; i++) {
			if (data[i] == target) {
				return i;
			}
		}
		return -1;
	}
	//mission : data[0]���� data[n-1]���̿��� target�� �˻��ϴ� ��.
	//������ �˻� ������ ���� �ε��� 0�� ���� �����Ѵ�. �� n�� �Ͻ��� �Ű������̴�.
	
	public static int search(int[] data, int begin, int end, int target) {
		if (begin > end) {
			return -1;
		}else if (target == data[begin]) {
			return begin;
		}else {
			return search(data, begin+1, end, target);
		}
	}
	//���� ��ġ�� �� ��ġ�� ��������� �ۼ��Ǿ� ����
	
	//���� Ž�� : �ٸ� ����(�ݴ��)
	public static int search2(int[] data, int begin, int end, int target) {
		if (begin > end) {
			return -1;
		}else if (target == data[end]) {
			return begin;
		}else {
			return search2(data, begin, end-1, target);
		}
	}
	
	//�Ű������� ���ȭ : �ִ밪 ã��
	public static int findMax(int[] data, int begin, int end) {
		if (begin == end) {
			return data[begin];
		}else {
			return Math.max(data[begin], findMax(data, begin+1, end));
		}
	}
	
	//���� Ž�� 
	public static int binarySearch(String[] items, String target, int begin, int end) {
		if (begin > end) {
			return -1;
		}else {
			int middle = (begin + end)/2;
			int compResult = target.compareTo(items[middle]);
			if(compResult == 0) {
				return middle;
			}else if(compResult < 0) {
				return binarySearch(items, target, begin, middle-1);
			}else {
				return binarySearch(items, target, middle+1, end);
			}
		}
	}

}
