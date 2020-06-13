package actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import beans.ThiSinh;
import exception.NumberException;

public class ThiSinhAction {
	static Scanner sc = new Scanner(System.in);
	
	//Nhập một chuỗi
	public static String nhapChuoi(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}

	//Nhập điểm từ 0 đến 10
	public static float nhapDiem(String msg, String err) {
		boolean check = true;
		float n = 0;
		do {
			try {
				System.out.print(msg);
				n = Float.parseFloat(sc.nextLine());
				if (n < 0 || n > 10)
					throw new NumberException(err);
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập đúng định dạng số!");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (check);
		return n;
	}
	
	//Nhập một số dương
	public static int nhapSoDuong(String msg, String err) {
		boolean check = true;
		int n = 0;
		do {
			try {
				System.out.print(msg);
				n = Integer.parseInt(sc.nextLine());
				if (n < 0)
					throw new NumberException(err);
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập đúng định dạng số!");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (check);
		return n;
	}
	
	// Nhập mảng thí sinh
	public static ArrayList<ThiSinh> inputData() {
		ArrayList<ThiSinh> listTS = new ArrayList<>();
		int n = nhapSoDuong("Nhập số lượng thí sinh: ", "Vui lòng nhập số lượng thí sinh lớn hơn hoặc bằng 0!");

		// Nhập thông tin cho mỗi thí sinh
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin thi sinh thu " + (i + 1) + ": ");
			String ten = nhapChuoi("Nhap ten thi sinh: ");
			// Nhập điểm Toán
			float toan = nhapDiem("Nhap diem Toan: ", "Vui long nhap diem Toan tu 0 den 10!");
			// Nhập điểm Lý
			float ly = nhapDiem("Nhap diem Ly: ", "Vui long nhap diem Ly tu 0 den 10!");
			// Nhập điểm Hóa
			float hoa = nhapDiem("Nhap diem Hoa: ", "Vui long nhap diem Hoa tu 0 den 10!");

			ThiSinh ts = new ThiSinh(ten, toan, ly, hoa);
			listTS.add(ts);
		}

		return listTS;

	}

	// Xuất mảng thí sinh trúng tuyển
	public static void display(ArrayList<ThiSinh> listTS) {
		int dem = 0;
		for (ThiSinh objTS : listTS) {
			if (objTS.tongDiem() >= 17) {
				dem++;
			}
		}
		if (dem > 0) {
			System.out.println("Ten\tDiem Toan\tDiem Ly \tDiem Hoa\tTong diem");
			for (ThiSinh objTS : listTS) {
				if (objTS.tongDiem() >= 17) {
					System.out.println(objTS);
				}
			}
		} else {
			System.out.println("Khong co thi sinh nao trung tuyen!");
		}
	}

	// Sắp xếp danh sách thí sinh theo tổng điểm giảm dần
	public static void sapXep(ArrayList<ThiSinh> listTS) {
		Collections.sort(listTS, new Comparator<ThiSinh>() {
			public int compare(ThiSinh ts1, ThiSinh ts2) {
				if (ts1.tongDiem() < ts2.tongDiem()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
	}
}
