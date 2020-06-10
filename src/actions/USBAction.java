package actions;

import java.util.ArrayList;
import java.util.Scanner;

import beans.USB;

public class USBAction {

	public static float tongDungLuong(ArrayList<USB> al) {
		float sum = 0;
		for (USB obj : al) {
			sum += obj.getDungluong();
		}
		return sum;
	}

	public static ArrayList<USB> inputData(int n) {
		Scanner sc = new Scanner(System.in);
		ArrayList<USB> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin USB thu " + i);
			System.out.print("Nhap ID: ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap dung luong: ");
			float dungluong = Float.parseFloat(sc.nextLine());
			System.out.print("Nhap nha san xuat: ");
			String nhasx = sc.nextLine();
			System.out.print("Nhap trang thai: ");
			boolean status = Boolean.parseBoolean(sc.nextLine());
			USB usb = new USB(id, dungluong, nhasx, status);
			al.add(usb);
		}
		return al;
	}

	public static void displayData(ArrayList<USB> al) {
		System.out.println("Thong tin USB hien co:");
		for (USB obj : al) {
			System.out.println(obj);
			System.out.println("=====================");
		}
	}

	public static void displayStatus1(ArrayList<USB> al) {
		int dem = 0;
		for (USB obj : al) {
			if (obj.isTrangthai()) {
				dem++;
			}
		}
		if (dem > 0) {
			for (USB obj : al) {
				if (obj.isTrangthai()) {
					System.out.println(obj);
					System.out.println("=====================");
				}
			}
		} else
			System.out.println("Không có thông tin");
	}
}
