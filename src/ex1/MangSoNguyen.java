package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MangSoNguyen {

	public static void main(String[] args) {
		ArrayList<Integer> arInt = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("Nhap so thu " + i + " :");
			int number = Integer.parseInt(sc.nextLine());
			arInt.add(number);
		}
		int sumDauCuoi = arInt.get(0) + arInt.get(arInt.size() - 1);

		int sumList = 0;
		for (Integer obj : arInt) {
			sumList += obj;
		}

		System.out.println("Tong cac so trong mang:" + sumList);

		System.out.println("Tong phan tu dau va cuoi: " + sumDauCuoi);

	}

}
