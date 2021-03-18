package s0318_2;

import java.util.Arrays;
import java.util.Scanner;

public class StringUtil {

	Scanner sc = new Scanner(System.in);

	StringUtil() {
	}

	/*
	 * char inputChar(String msg) {
	 * 
	 * System.out.println(msg); char input = sc.nextLine().charAt(0);
	 * 
	 * return input; }
	 */

	/*
	 * boolean isUpperChar() { // 하나의 문자를 입력받아 true를 반환
	 * 
	 * // bool == true;
	 * 
	 * boolean identify;
	 * 
	 * char charGet = inputChar("대문자 여부 확인: ");
	 * 
	 * int inum = (int) charGet;
	 * 
	 * if (inum >= 65 && inum <= 90) { identify = true; } else { identify = false; }
	 * 
	 * return identify; }
	 */

	boolean isUpperChar(char c) { // 1번

		boolean identify = true;

		int inum = (int) c;

		if (inum >= 65 && inum <= 90) {
			System.out.println("대문자 여부 확인: " + identify);
			identify = true;
		} else {
			identify = false;
			System.out.println("대문자 여부 확인: " + identify);
		}

		return identify;
	}

	boolean isLowerChar(char c) { // 2번

		boolean identify = true;

		int inum = (int) c;

		if (inum >= 97 && inum <= 122) {
			System.out.println("소문자 여부 확인: " + identify);
			identify = true;
		} else {
			identify = false;
			System.out.println("소문자 여부 확인: " + identify);
		}

		return identify;
	}

	int max(int i, int j) { // 3번

		int maxNum = 0;

		if (i > j) {
			maxNum = i;
			System.out.println("입력한 수 중 최대값: " + i);

		} else if (i < j) {
			maxNum = j;
			System.out.println("입력한 수 중 최대값: " + j);
		}

		return maxNum;
	}

	int min(int i, int j) { // 4번

		int minNum = 0;

		if (i < j) {
			minNum = i;
			System.out.println("입력한 수 중 최소값: " + i);

		} else if (i > j) {
			minNum = j;
			System.out.println("입력한 수 중 최소값: " + j);
		}

		return minNum;
	}

	void reverseString(String str) { // 5번

		String[] arr = str.split("");
		String[] reverseArr = new String[arr.length];

		for (int i = 5; i > 0; i--) {

			reverseArr[5 - i] = arr[i - 1];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(reverseArr));
	}

	void toUpperString(String str) { // 6번

		int inum2 = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); // str 문자열에 순서대로 접근해서 char형으로 변환
			int inum = (int) c; // 아스키 코드로 대,소문자 판별

			if (inum >= 97 && inum <= 122) { // 소문자면 대문자로 변환
				inum2 = inum - 32; // inum의 값을 대문자로 바꾸어주어야함
				char toChar = (char) inum2; // 아스키 코드 값으로 되어있는 것을 다시 문자형으로 변환
				System.out.print(toChar);
			} else if (inum >= 65 && inum <= 90) { // 대문자면 그대로 출력
				System.out.print(c);
			}

		}
		System.out.println();

	}

	void toLowerString(String str) { // 7번

		int inum2 = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int inum = (int) c;

			if (inum >= 65 && inum <= 90) { // 대문자면 소문자로 변환
				inum2 = inum + 32;
				char toChar = (char) inum2;
				System.out.print(toChar);
			} else if (inum >= 97 && inum <= 122) {
				System.out.print(c);
			}
		}

	}

	public static int checkChar(String strData, char ch) { // 8번

		int cnt = 0;

		for (int i = 0; i < strData.length(); i++) {
			char a = strData.charAt(i);
			if (a == ch) {
				cnt++;
			}
		}
		System.out.println();

		return cnt;
	}

	public static String removeChar(String oriStr, char delChar) { // 9번

		String s = new String();

		for (int i = 0; i < oriStr.length(); i++) {
			char a = oriStr.charAt(i);
			if (a != delChar) {
				s += a;
			}
		}
		return s;

	}
}
