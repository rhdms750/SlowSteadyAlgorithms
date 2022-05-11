package _01_기초문법;

public class _02_재귀2 {
	//순환적 알고리즘 설계
	//1. 적어도 하나의 base case가 필요하다.
	//2. 암시적 매개변수를 명시적 매개변수로 바꾸어라.(implicit - > explicit)
	
	//순차 탐색 (sequential search, linear search)
	public static int search(int[] data, int n, int target) {
		for (int i = 0; i < n; i++) {
			if (data[i] == target) {
				return i;
			}
		}
		return -1;
	}
	//mission : data[0]에서 data[n-1]사이에서 target을 검색하는 것.
	//하지만 검색 구간의 시작 인덱스 0은 보통 생략한다. 즉 n은 암시적 매개변수이다.
	
	public static int search(int[] data, int begin, int end, int target) {
		if (begin > end) {
			return -1;
		}else if (target == data[begin]) {
			return begin;
		}else {
			return search(data, begin+1, end, target);
		}
	}
	//시작 위치와 끝 위치가 명시적으로 작성되어 있음
	
	//순차 탐색 : 다른 버전(반대순)
	public static int search2(int[] data, int begin, int end, int target) {
		if (begin > end) {
			return -1;
		}else if (target == data[end]) {
			return begin;
		}else {
			return search2(data, begin, end-1, target);
		}
	}
	
	//매개변수의 명시화 : 최대값 찾기
	public static int findMax(int[] data, int begin, int end) {
		if (begin == end) {
			return data[begin];
		}else {
			return Math.max(data[begin], findMax(data, begin+1, end));
		}
	}
	
	//이진 탐색 
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
