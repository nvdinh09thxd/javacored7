package actions;

import java.util.ArrayList;
import java.util.Scanner;

import beans.TuDien;
import exception.WordException;

public class TuDienAction {
	static Scanner sc = new Scanner(System.in);

	public static void line() {
		System.out.println("----------------------------------------");
	}

	public static ArrayList<TuDien> inputData(int n) {
		ArrayList<TuDien> listWord = new ArrayList<>();
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
		return listWord;
	}

	public static boolean isExist(String word, ArrayList<TuDien> listWord) {
		for (TuDien w : listWord) {
			if (w.getTu().equals(word))
				return true;
		}
		return false;
	}

	public static TuDien searchWord(String word, ArrayList<TuDien> listWord) {
		for (TuDien w : listWord) {
			if (w.getTu().equals(word))
				return w;
		}
		return null;
	}

	public static void displayData(ArrayList<TuDien> listWord) {
		System.out.println("Tu tieng Anh\tNghia tieng Viet\tPhien am");
		for (TuDien objWord : listWord) {
			System.out.println(objWord);
		}
	}

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
				chon = Integer.valueOf(sc.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang so!");
			}
		} while (check);
		return chon;
	}
}
