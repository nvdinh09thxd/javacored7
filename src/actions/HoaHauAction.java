package actions;

import java.util.ArrayList;
import java.util.Scanner;

import beans.HoaHau;

public class HoaHauAction {

	public static ArrayList<HoaHau> inputData(int n) {
		Scanner sc = new Scanner(System.in);
		ArrayList<HoaHau> alHH = new ArrayList<HoaHau>();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap hoa hau thu " + i);
			System.out.print("Nhap ID: ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap ho ten: ");
			String name = sc.nextLine();
			HoaHau hh = new HoaHau(id, name);
			alHH.add(hh);
		}
		return alHH;
	}

	public static void displayData(ArrayList<HoaHau> al) {
		System.out.println("Thong tin hoa hau da nhap:");
		for (HoaHau obj : al) {
			System.out.println(obj);
			System.out.println("=====================");
		}
	}
}
