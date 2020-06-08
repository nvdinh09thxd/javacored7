package main;

import java.util.ArrayList;
import java.util.Scanner;

import actions.TuDienAction;
import beans.TuDien;
import exception.NumberException;

public class TuDienMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<TuDien> listTuDien = new ArrayList<>();
		boolean check = true;
		do {
			int chon = TuDienAction.menu();
			switch (chon) {
			case 1:
				System.out.println("NHAP DANH SACH TU DIEN");
				int n = 0;
				boolean check1 = true;
				do {
					try {
						System.out.print("Nhap so tu cua tu dien: ");
						n = Integer.valueOf(sc.nextLine());
						if (n < 1)
							throw new NumberException("So tu phai lon hon 0!");
						listTuDien = TuDienAction.inputData(n);
						check1 = false;
					} catch (NumberFormatException e) {
						System.out.println("Nhap sai dinh dang so!");
					} catch (NumberException e) {
						System.out.println(e.getMessage());
					}
				} while (check1);
				break;
			case 2:
				System.out.println("XUAT DANH SACH TU DIEN");
				if (listTuDien.size() == 0) {
					System.out.println("Danh sach tu dien trong!");
				} else {
					TuDienAction.displayData(listTuDien);
				}
				break;
			case 3:
				System.out.println("TRA TU");
				System.out.print("Nhap tu can tra: ");
				String tu = sc.nextLine();
				if (TuDienAction.searchWord(tu, listTuDien) == null) {
					System.out.println("Khong tim thay!");
				} else {
					System.out.println("Ket qua tim kiem");
					System.out.println("Tu tieng Anh\tNghia tieng Viet\tPhien am");
					System.out.println(TuDienAction.searchWord(tu, listTuDien));
				}
				break;
			case 4:
				System.out.println("Cam on da su dung tu dien!");
				check = false;
				break;
			default:
				System.out.println("Nhap sai lua chon, xin moi nhap lai!");
			}
		} while (check);
	}

}
