package s0318_2;

import java.util.Scanner;

public class StringUtilMain {

	public static void main(String[] args) {
				
		StringUtil a= new StringUtil ();
		
		//boolean b =a.isUpperChar();
		//System.out.println(b);
		
		
		a.isUpperChar('C');
		a.isLowerChar('C');
		a.max(3,9);
		a.min(3,9);
		a.reverseString("Hello");
		a.toUpperString("hello");
		a.toLowerString("HELLO");
		
		int checkPrint =a.checkChar("Hello World Java", 'o');
		System.out.println(checkPrint);

		
		
		
		String checkRemove = a.removeChar("Hello World Java",'l');
		System.out.println(checkRemove);
		
		
		//System.out.println("대문자 여부 확인: ");
		//char input = sc.nextLine().charAt(0);  //String으로 입력 받아서 이걸로 charAt(i)를
		
		
		
		
		//System.out.println(input);
		
		
		
		//nextLine(), next() 
		
		//a.isUpperChar('문자열 입력');
		
		
	}

}
