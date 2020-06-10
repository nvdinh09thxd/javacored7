package actions;

import java.util.ArrayList;
import java.util.Scanner;

import beans.TuDien;
import exception.NumberException;
import exception.WordException;

public class TuDienAction {
	static Scanner sc = new Scanner(System.in);

	public static void line() {
		System.out.println("----------------------------------------");
	}

	// Nhập mảng từ điển
	public static void inputData(ArrayList<TuDien> listWord) {
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhap so tu cua tu dien: ");
				n = Integer.parseInt(sc.nextLine());
				if (n < 0)
					throw new NumberException("So tu phai lon hon hoặc bằng 0!");
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang so!");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (check);

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap tu so " + (i + 1) + ":");
			try {
				System.out.print("Nhap tu tieng Anh: ");
				String tu = sc.nextLine();
				if (isExist(tu, listWord))
					throw new WordException("Tu nay da co trong tu dien, vui long nhap tu khac!");
				System.out.print("Nhap nghia tieng Viet: ");
				String nghiaTV = sc.nextLine();
				System.out.print("Nhap phien am: ");
				String phienAm = sc.nextLine();
				line();
				TuDien tuDien = new TuDien(tu, nghiaTV, phienAm);
				listWord.add(tuDien);
			} catch (WordException e) {
				System.out.println(e.getMessage());
				i--;
			}
		}
	}

	// Kiểm tra từ có tồn tại trong mảng từ điển chưa?
	public static boolean isExist(String word, ArrayList<TuDien> listWord) {
		for (TuDien w : listWord) {
			if (w.getTu().equals(word))
				return true;
		}
		return false;
	}

	// Tìm kiếm từ trong từ điển
	public static TuDien searchWord(String word, ArrayList<TuDien> listWord) {
		for (TuDien w : listWord) {
			if (w.getTu().equals(word))
				return w;
		}
		return null;
	}

	// Hiển thị danh sách từ điển
	public static void displayData(ArrayList<TuDien> listWord) {
		if (listWord.size() == 0) {
			System.out.println("Danh sach tu dien trong!");
		} else {
			System.out.println("Tu tieng Anh\t\tNghia tieng Viet\t\tPhien am");
			for (TuDien objWord : listWord) {
				System.out.println(objWord);
			}
		}
	}

	// Tra từ
	public static void search(ArrayList<TuDien> listWord) {
		System.out.print("Nhap tu can tra: ");
		String tu = sc.nextLine();
		if (searchWord(tu, listWord) == null) {
			System.out.println("Khong tim thay!");
		} else {
			System.out.println("Ket qua tim kiem");
			System.out.println("Tu tieng Anh\t\tNghia tieng Viet\t\tPhien am");
			System.out.println(searchWord(tu, listWord));
		}
	}

	// menu
	public static int menu() {
		line();
		System.out.println("== TU DIEN ANH VIET - BAI TAP VINAENTER EDU ==");
		System.out.println("1. Nhap du lieu");
		System.out.println("2. Xuat du lieu");
		System.out.println("3. Dich tu");
		System.out.println("4. Thoat");
		line();
		int chon = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhap thao tac lua chon: ");
				chon = Integer.parseInt(sc.nextLine());
				if (chon > 4 || chon < 1)
					throw new NumberException("Nhập số từ 1 - 4");
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang so!");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (check);
		return chon;
	}
}
