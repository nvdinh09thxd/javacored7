package test;

import java.util.ArrayList;

import actions.USBAction;
import beans.USB;

public class USBDemo {

	public static void main(String[] args) {
		ArrayList<USB> al = new ArrayList<>();
		al = USBAction.inputData(2);
		System.out.println("Tong dung luong hien co: " + USBAction.tongDungLuong(al));
		USBAction.displayData(al);
		System.out.println("Thông tin USB có trạng thái là 1");
		USBAction.displayStatus1(al);
	}

}
