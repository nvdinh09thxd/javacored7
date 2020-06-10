package test;

import java.util.ArrayList;

import actions.HoaHauAction;
import beans.HoaHau;

public class HoaHauDemo {

	public static void main(String[] args) {
		 ArrayList<HoaHau> al = new ArrayList<>();
		 al = HoaHauAction.inputData(3);
		 HoaHauAction.displayData(al);

//		HoaHauAction.displayData(HoaHauAction.inputData(3));
	}

}
