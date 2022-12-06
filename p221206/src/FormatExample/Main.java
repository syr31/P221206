package FormatExample;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		double num = 1234567.89;

		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));

		df = new DecimalFormat("#");
		System.out.println(df.format(num));

		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));

		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.# %");		// x 100을 한 숫자
		System.out.println(df.format(num));

		df = new DecimalFormat("\u00A4 #.###");	// 원화마크
		System.out.println(df.format(num));

	}

}
