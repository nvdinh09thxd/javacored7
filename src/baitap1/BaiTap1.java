package baitap1;

import java.util.ArrayList;
import java.util.Scanner;

import exception.NumberException;

public class BaiTap1 {
	static Scanner sc = new Scanner(System.in);

	//Nhập mảng số nguyên
	public static ArrayList<Integer> inputData(int n) throws NumberException {
		if (n < 0)
			throw new NumberException("Số phần tử của mảng không được nhỏ hơn 0!");
		ArrayList<Integer> listInt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap so thu " + (i + 1) + ": ");
			int number = Integer.parseInt(sc.nextLine());
			listInt.add(number);
		}
		return listInt;
	}

	//Xuất mảng số nguyên
	public static void displayData(ArrayList<Integer> listInt) {
		if (listInt.size() > 0) {
			System.out.print("Danh sach mang: ");
			for (int i : listInt) {
				System.out.print(i + " ");
			}
			System.out.println();
		} else
			System.out.println("Mảng rỗng!");
	}

	//Tính tổng mảng
	public static int tinhTongMang(ArrayList<Integer> listInt) {
		int tong = 0;
		for (int i : listInt) {
			tong += i;
		}
		return tong;
	}

	//Tính tổng phần tử đầu + cuối
	public static int tinhTongDauCuoi(ArrayList<Integer> listInt) {
		if (listInt.size() == 1)
			return listInt.get(0);
		return listInt.get(0) + listInt.get(listInt.size() - 1);
	}

	public static void main(String[] args) {
		ArrayList<Integer> listNumber = new ArrayList<>();
		boolean check = true;
		do {
			try {
				System.out.print("Nhap so phan tu cua mang: ");
				int n = Integer.parseInt(sc.nextLine());
				listNumber = inputData(n);
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang so!");
			}
		} while (check);

		displayData(listNumber);
		if (listNumber.size() > 0) {
			System.out.println("Tong cac phan tu cua mang: " + tinhTongMang(listNumber));
			System.out.println("Tong cua phan tu dau va cuoi cua mang: " + tinhTongDauCuoi(listNumber));
		}
	}
}
