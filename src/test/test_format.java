package test;

public class test_format {

	public static void main(String[] args) {
		System.out.printf("Integer : %-1d%-1d\n", 15, 20);
		System.out.printf("Integer : %-2d%-2d\n", 15, 20);
		System.out.printf("Integer : %-3d%-3d\n", 15, 20);
		System.out.printf("Integer : %-4d%-4d\n", 15, 20);
		System.out.printf("Integer : %-5d%-5d\n", 15, 20);

		System.out.printf("String: %20s\n", "Hello");
	}

}
