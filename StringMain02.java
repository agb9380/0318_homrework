package s0318;

import java.util.Arrays;

public class StringMain02 {

	public static void main(String[] args) {


		String str = "hello world";
		
		System.out.println("str: "+ str);
		
		String subStr =str.substring(1,5);
		System.out.println("substring: "+ subStr );   // 이거한다고해서 원본이 변경되지 않음.. String은 한 번 만들면 변화하지 않음

		subStr= str.substring(6); //6번부터 맨 마지막까지 (6,str.length) 에서 length가 생략됨
		System.out.println("substring 6번부터: "+ subStr );
		
		
		System.out.println("합쳐주기");
		String str1= "hello";
		String str2="!!!";
		
		
		str = str1.concat(str2); // str1에 str2를 붙이기
		
		System.out.println("concat str: "+ str );
		
		
		str = "hello world";
		
		
		System.out.println("replace() 전: " + str);
		
		str = str.replace("ll","dsfq"); // 문자 l을 문자 r로 치환하고 싶음.그러나 원본이 변경된게 아님! 그래서 str에 다시 넣어줌, 문자 '', 문자열 " " 둘 다 가능
		
		System.out.println("replace() 후: " + str);
		
		
		str= "    hello    "; //좌우의 공백 지워버리기, 중간 공백은 상관없음!! 좌우의 공백만 제거하는 것
		System.out.println("str의 길이: " + str.length());
		
		str = str.trim();
		System.out.println("str의 길이: " + str.length());
		
		
		str = "Hello World!!!";
		System.out.println("str: "+ str);
		
		System.out.println("toLowerCase(): "+ str.toLowerCase());
		System.out.println("toLowerCase(): "+ str.toUpperCase()); // 원본은 바뀌지 않음, 바꾸려면 str = str.toUpperCase()
	
		
		str ="홍길동전:허균:조선시대"; // split을 이용해서 :을 기준으로 따로 추출하기
		
		String[] strArr= str.split(":");
		
		System.out.println(Arrays.toString(strArr));
		
		
		String ip= "192.168.5.203";
		String[] ipArr= ip.split("\\.");
		System.out.println(Arrays.toString(ipArr));
		
		
		System.out.println(" <형의 변환> "); // valueOf 어떤 값이 나오든지 문자열(String형)으로 변경
		
		
		int num =123;
		//String strNum = num +""; //일반적인 방법.. 꼼수
		
		String strNum = String.valueOf(num);
		
		System.out.println(strNum+100);
		
		
		
		
		
		
	}

}
