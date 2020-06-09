package ex_dung;

import java.util.ArrayList;
import java.util.Scanner;

import exception.NumberException;

public class Bai1 {

	public static ArrayList<Integer> inputData() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		boolean cont = false;
		int n = 0, num = 0;
		do {
			try {
				System.out.print("Nhập số lượng: ");
				n = Integer.parseInt(input.nextLine());
				if (n < 0) {
					throw new NumberException("Vui lòngn hập số lượng >= 0!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				cont = true;
				System.out.println("Vui lòng nhập đúng định dạng số!");
			} catch (NumberException e) {
				cont = true;
				System.out.println(e.getMessage());
			}
		} while (cont);
		System.out.println("========== NHẬP CÁC PHẦN TỬ TRONG MẢNG ==========");
		for (int i = 1; i <= n; i++) {
			do {
				try {
					System.out.print("Nhập số thứ " + i + ": ");
					num = Integer.parseInt(input.nextLine());
					cont = false;
				} catch (NumberFormatException e) {
					cont = true;
					System.out.println("Vui lòng nhập đúng định dạng số!");
				}
			} while (cont);
			
			list.add(num);
		}
		return list;
	}

	public static void displayData(ArrayList<Integer> list) {
		if (list.size() > 0) {
			System.out.println("========== MẢNG VỪA NHẬP ==========");
			for (Integer soNguyen : list) {
				System.out.print(soNguyen + "\t");
			}
		} else {
			System.out.println("Chưa có dữ liệu!");
		}
	}

	public static int tong(ArrayList<Integer> list) {
		int sum = 0;
		for (Integer soNguyen : list) {
			sum += soNguyen;
		}
		return sum;
	}

	public static int tongDauVaCuoi(ArrayList<Integer> list) {
		if (list.size() > 0) {
			return list.get(0) + list.get(list.size() - 1);
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = inputData();
		displayData(list);
		System.out.println("\nTổng các số trong mảng: " + tong(list));
		System.out.println("Tổng số đầu và số cuối của mảng: " + tongDauVaCuoi(list));
	}
}