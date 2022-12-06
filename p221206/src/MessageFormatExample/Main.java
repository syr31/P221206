package MessageFormatExample;

import java.text.MessageFormat;

public class Main {
	public static void main(String[] args) {
		String id = "java";
		String name = "홍길동";
		String tel = "010-123-1234";

		String text = "회원 ID : {0} \n 회원 이름 : {1} \n회원 전화 : {2}";
		String result1 = MessageFormet.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();

		String sql = "insert into member values({0}, {1}, {2})";
		Object[] arguments = { "java", "홍길동", "010-123-1234" };
		String result2 = MessageFormet.format(sql, arguments);
		System.out.println(result2);

	}

}
