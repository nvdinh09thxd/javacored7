package test;

import java.util.ArrayList;

import beans.ThiSinh;

public class SapXepThiSinh {
	public static void hoanDoi(ThiSinh ts1, ThiSinh ts2) {
		ThiSinh temp = new ThiSinh();
		temp.setTen(ts1.getTen());
		temp.setDiemToan(ts1.getDiemToan());
		temp.setDiemLy(ts1.getDiemLy());
		temp.setDiemHoa(ts1.getDiemHoa());

		ts1.setTen(ts2.getTen());
		ts1.setDiemToan(ts2.getDiemToan());
		ts1.setDiemLy(ts2.getDiemLy());
		ts1.setDiemHoa(ts2.getDiemHoa());

		ts2.setTen(temp.getTen());
		ts2.setDiemToan(temp.getDiemToan());
		ts2.setDiemLy(temp.getDiemLy());
		ts2.setDiemHoa(temp.getDiemHoa());
	}

	public static void sapXep(ArrayList<ThiSinh> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).tongDiem() < list.get(j).tongDiem())
					hoanDoi(list.get(i), list.get(j));
			}
		}
	}

	public static void display(ArrayList<ThiSinh> list) {
		for (ThiSinh ts : list) {
			System.out.println(ts);
		}
	}

	public static void main(String[] args) {
		ThiSinh ts1 = new ThiSinh("A", 7, 8, 9);
		ThiSinh ts2 = new ThiSinh("B", 6, 7, 9);
		ThiSinh ts3 = new ThiSinh("C", 6, 8, 9);
		ThiSinh ts4 = new ThiSinh("D", 6, 10, 9);
		ArrayList<ThiSinh> listTS = new ArrayList<>();
		listTS.add(ts1);
		listTS.add(ts2);
		listTS.add(ts3);
		listTS.add(ts4);
		System.out.println("Truoc khi sap xep");
		display(listTS);
		sapXep(listTS);
		System.out.println("Sau khi sap xep");
		display(listTS);
	}

}
