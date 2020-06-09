package actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import beans.ThiSinh;
import exception.NumberException;

public class ThiSinhAction {
	static Scanner sc = new Scanner(System.in);

	// Nhập mảng thí sinh
	public static ArrayList<ThiSinh> inputData() {
		ArrayList<ThiSinh> listTS = new ArrayList<>();
		boolean cont = true;
		do {
			try {
				System.out.print("Nhap so luong thi sinh: ");
				int n = Integer.parseInt(sc.nextLine());
				if (n < 0)
					throw new NumberException("Vui long nhap so luong thi sinh lon hon hoac bang 0!");
				cont = false;
				for (int i = 0; i < n; i++) {
					System.out.println("Nhap thong tin thi sinh thu " + (i + 1) + ": ");
					System.out.print("Nhap ten thi sinh: ");
					String ten = sc.nextLine();
					float toan = 0, ly = 0, hoa = 0;
					boolean check = true;
					do {
						try {
							System.out.print("Nhap diem Toan: ");
							toan = Float.parseFloat(sc.nextLine());
							if (toan < 0 || toan > 10)
								throw new NumberException("Vui long nhap diem Toan tu 0 den 10!");
							check = false;
						} catch (NumberException e) {
							System.out.println(e.getMessage());
						} catch (NumberFormatException e) {
							System.out.println("Nhap sai dinh dang so!");
						}
					} while (check);
					do {
						try {
							System.out.print("Nhap diem Ly: ");
							ly = Float.parseFloat(sc.nextLine());
							if (ly < 0 || ly > 10)
								throw new NumberException("Vui long nhap diem Ly tu 0 den 10!");
							check = true;
						} catch (NumberException e) {
							System.out.println(e.getMessage());
						} catch (NumberFormatException e) {
							System.out.println("Nhap sai dinh dang so!");
						}
					} while (!check);
					do {
						try {
							System.out.print("Nhap diem Hoa: ");
							hoa = Float.parseFloat(sc.nextLine());
							if (hoa < 0 || hoa > 10)
								throw new NumberException("Vui long nhap diem Hoa tu 0 den 10!");
							check = false;
						} catch (NumberException e) {
							System.out.println(e.getMessage());
						} catch (NumberFormatException e) {
							System.out.println("Nhap sai dinh dang so!");
						}
					} while (check);
					ThiSinh ts = new ThiSinh(ten, toan, ly, hoa);
					listTS.add(ts);
				}
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang so!");
			}
		} while (cont);

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
				} else if (ts1.tongDiem() == ts2.tongDiem()) {
					return 0;
				} else {
					return -1;
				}
			}
		});
	}
}
