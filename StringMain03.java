package s0318;

public class StringMain03 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		String str = "";
		int sum = 0;
		for (int i = 0; i < 100000; i++) {
			sum += i;
		} // 숫자는 금방 처리가능, Strig이 오래걸리는 이유 .. "01", "012"... 이런식으로 메모리를 추가적으로 계속 만들고있음

		/*
		 * for (int i = 0; i < 100000; i++) { str += i; // 결과는 "0123456789..." String으로
		 * 했더니 시간이 엄청 오래걸림.. }
		 */

		long end = System.currentTimeMillis();
		System.out.println("소요시간: " + (end - start) / 1000.0 + "초");

		System.out.println("===================================");
		// =====================================================

		StringBuffer sb = new StringBuffer(); // 비어있는 스트링버퍼 문자열 형태 생성

		for (int i = 0; i < 100000; i++) {
			sb.append(i); // 변하는 문자열인 스트링버퍼, str +=i; 이것처럼 업데이트가 필요없음!
		}

		end = System.currentTimeMillis();
		System.out.println("소요시간: " + (end - start) / 1000.0 + "초");

	}

}