package main;

import java.util.ArrayList;
import java.util.Scanner;

import actions.TuDienAction;
import beans.TuDien;

public class TuDienMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<TuDien> listTuDien = new ArrayList<>();
		boolean check = true;
		do {
			int chon = TuDienAction.menu();
			switch (chon) {
			case 1:
				System.out.println("============== NHAP DANH SACH TU DIEN ==============");
				TuDienAction.inputData(listTuDien);

				break;
			case 2:
				System.out.println("============== XUAT DANH SACH TU DIEN ==============");
				TuDienAction.displayData(listTuDien);

				break;
			case 3:
				System.out.println("============== TRA TU ==============");
				TuDienAction.search(listTuDien);
				
				break;
			case 4:
				System.out.println("Cam on da su dung tu dien!");
				check = false;
				break;
			}
		} while (check);
	}

}
