package main;

import java.util.ArrayList;

import beans.ThiSinh;
import actions.ThiSinhAction;;

public class ThiSinhMain {

	public static void main(String[] args) {

		ArrayList<ThiSinh> listThiSinh = new ArrayList<>();
		System.out.println("NHAP DANH SACH THI SINH");
		listThiSinh = ThiSinhAction.inputData();
		System.out.println("XUAT DANH SACH THI SINH TRUNG TUYEN");
		ThiSinhAction.display(listThiSinh);
		//Sắp xếp danh sách thí sinh
		ThiSinhAction.sapXep(listThiSinh);
		System.out.println("XUAT DANH SACH THI SINH TRUNG TUYEN DA DUOC SAP XEP");
		ThiSinhAction.display(listThiSinh);

		System.out.println("Ket thuc chuong trinh!");
	}

}
