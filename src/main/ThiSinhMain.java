package main;

import java.util.ArrayList;
import java.util.Scanner;

import beans.ThiSinh;
import exception.NumberException;
import actions.ThiSinhAction;;

public class ThiSinhMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		do {
			try {
				System.out.print("Nhap so luong thi sinh: ");
				int n = Integer.valueOf(sc.nextLine());
				if (n < 1)
					throw new NumberException("Vui long nhap so luong thi sinh lon hon 0!");
				System.out.println("NHAP DANH SACH THI SINH");
				ArrayList<ThiSinh> listThiSinh;
				listThiSinh = ThiSinhAction.inputData(n);
				System.out.println("XUAT DANH SACH THI SINH TRUNG TUYEN");
				ThiSinhAction.display(listThiSinh);
				ThiSinhAction.sapXep(listThiSinh);
				System.out.println("XUAT DANH SACH THI SINH TRUNG TUYEN DA DUOC SAP XEP");
				ThiSinhAction.display(listThiSinh);
				check = false;
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang so!");
			}
		} while (check);
		sc.close();
		System.out.println("Ket thuc chuong trinh!");
	}

}
