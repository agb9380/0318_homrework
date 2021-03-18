package s0318;

public class StringMain01 {

	public static void main(String[] args) {

		String str = new String("hello");
		String str2 = new String("Hello");

		// String str = "hello";
		// String str2 = "hello"; //위에 결과가 다름, 주소를 비교하기 때문임

		// 주소비교
		/*
		 * if( str == str2 ) { System.out.println("str==str2"); }else {
		 * System.out.println("str !=str2"); }
		 */

		// 문자열 비교

		str.equals("hello"); // str의 문자열과 "hello"에 들어있는 문자열이 같은지 물어보는 것, 같으면 true, 다르면 false
		// "hello".equals(str);

		boolean bool = str.equals(str2);

		if (bool == true) {
			System.out.println("equals(): str==str2");
		} else {
			System.out.println("equals(): str!=str2");
		}

		bool = str.equalsIgnoreCase(str2); // 문자열 비교시 대소문자 무시하는 것

		if (bool == true) {
			System.out.println("equalsIgnoreCase(): str==str2");
		} else {
			System.out.println("equalsIgnoreCase(): str!=str2");
		}

		str = "hello!!!";
		str2 = "hello wrold"; // str str2 가 hello로 시작되는지 알고 싶음

		String sub = "hello";

		bool = str.startsWith(sub);

		if (bool == true) {

			System.out.println("[" + str + "]은 [" + sub + "]문자열로 시작합니다.");

		} else {
			System.out.println("[" + str + "]은 [" + sub + "]문자열로 시작하지 않습니다.");
		}

		// endsWith
		str = "hello.txt"; // 확장자 테스트.. txt인지 jpg인지 이렇게 판단할 때 사용

		bool = str.endsWith(".txt");
		if (bool == true) {
			System.out.println("[" + str + "]은 텍스트 파일 입니다.");
		} else
			System.out.println("[" + str + "]은 텍스트 파일이 아닙니다.");

		// int compareTo~

		str = "boat"; // 길이는 전혀 상관없음
		str2 = "board";

		int compare = str.compareTo(str2);

		if (compare == 0) {
			System.out.println(str + "==" + str2);

		} else if (compare < 0) { // 앞쪽에 나오려면 유니코드가 더 적어야하니까 음수
			System.out.println(str + "<" + str2);

		} else { // compare>0 양수이면 사전에서 str이 str2에 비해 더 뒤에 있음
			System.out.println(str + ">" + str2);
		}

		String[] names = { "강길동", "홍길동", "홍길순", "김홍동", "윤길동", "박철홍", "홍길동" };
		// 이름이 홍길동인 사람찾기
		System.out.println("<이름이 홍길동인 사람 찾기>");

		// 배열이니까 반복해야함, 인덱스를 이용해서 접근하거나 1.5버전, ArraytoString은 안됨.

		for (int i = 0; i < names.length; i++) { // names가 배열이니까 길이 구할 때 괄호치면 안됨
			if ((names[i].equals("홍길동")) == true) { // equals의 값이 true일 때 찍어내기
				System.out.println(names[i]);
			}
		}

		System.out.println("<홍씨 성을 가진 사람 검색>"); // startWith를 이용할 수 있음

		for (String name : names) { // 이럴때는 1.5버전이 편하다.. names에 들어있는 값이 각각 String형
			if ((name.startsWith("홍")) == true) {
				System.out.println(name);
			}
		}

		System.out.println("<이름이 길동인 사람만 검색하기>");

		for (String name : names) {
			if ((name.endsWith("길동")) == true) {
				System.out.println(name);
			}
		}

		System.out.println("<홍이 포함된 사람 검색>");

		for (String name : names) {
			if (name.contains("홍")) { // 앞이든 뒤든 상관없이 "홍"을 포함하고 있는 이름 출력
				System.out.println(name);
			}
		}

		str = "hello world";

		// 문자열 o가 몇번째 부터 시작하는지 알고싶음

		int searchIdx = str.indexOf("o");
		System.out.println("\"o\" 시작위치: " + searchIdx);

		searchIdx = str.indexOf("o", 5);   // (찾을 특정 문자, 시작할 위치)
		System.out.println("\"o\" indexOf(5) 위치: " + searchIdx);

		searchIdx = str.lastIndexOf("o");
		System.out.println("\"o\" lastIndexOf()위치: " + searchIdx);

		str = "hello world";

		System.out.println("<" + str + "에서 \"l\" 위치 >");
		char ch = 'l'; // 문자형으로도 가능

		searchIdx = str.indexOf(ch); // 없으면 -1값..

		while (searchIdx != -1) { // 찾는 문자가 존재한다는 것
			System.out.println("검색된 위치: " + searchIdx);
			searchIdx = str.indexOf(ch, searchIdx + 1);
		}

		// ===============================================================

		searchIdx = -1; // 서치 인덱스를 -1로 초기화해서 배열의 첫 순서부터 확인하도록함

		while ((searchIdx = str.indexOf(ch, searchIdx + 1)) != -1) { // 못찾으면 -1, 찾으면 양수 값 ,, 우선 서치 인덱스에 대입을 한 후 -1인지
																		// 물어보는 것
			System.out.println("검색된 위치: " + searchIdx); // 찾은 위치를 9,3,2로 나오게 하려면 lastIndexOf

		}

	}

}
