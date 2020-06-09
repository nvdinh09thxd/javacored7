package action;

import java.util.ArrayList;
import java.util.Scanner;

import bean.ThiSinh;
import exception.NumberException;

public class ThiSinhAction {

	// Nhập thông tin thí sinh
	public ArrayList<ThiSinh> inputData() {
		ArrayList<ThiSinh> list = new ArrayList<ThiSinh>();
		Scanner input = new Scanner(System.in);
		boolean cont = false;
		int n = 0;
		do {
			try {
				System.out.print("Nhập số lượng thí sinh: ");
				n = Integer.parseInt(input.nextLine());
				if (n < 0) {
					throw new NumberException("Vui lòng nhập số lượng >= 0!");
				}
				cont = false;
			} catch (NumberFormatException e) {
				cont = true;
				System.out.println("Vui lòng nhập đúng định dạng số!");
			} catch (NumberException e) {
				cont = true;
				System.out.println(e.getMessage());
			}
		} while (cont);

		String name = "";
		float diemToan = 0.0f, diemLy = 0.0f, diemHoa = 0.0f;
		for (int i = 1; i <= n; i++) {
			System.out.println("========= NHẬP THÔNG TIN THÍ SINH =========");
			System.out.print("Nhập tên: ");
			name = input.nextLine();
			do {
				try {
					System.out.print("Nhập điểm toán: ");
					diemToan = Float.parseFloat(input.nextLine());
					if (diemToan > 10 || diemToan < 0) {
						throw new NumberException("Vui lòng nhập điểm >= 0 hoặc <= 10!");
					}
					cont = false;
				} catch (NumberFormatException e) {
					cont = true;
					System.out.println("Vui lòng nhập đúng định dạng số!");
				} catch (NumberException e) {
					cont = true;
					System.out.println(e.getMessage());
				}
			} while (cont);
			do {
				try {
					System.out.print("Nhập điểm lý: ");
					diemLy = Float.parseFloat(input.nextLine());
					if (diemLy > 10 || diemLy < 0) {
						throw new NumberException("Vui lòng nhập điểm >= 0 hoặc <= 10!");
					}
					cont = false;
				} catch (NumberFormatException e) {
					cont = true;
					System.out.println("Vui lòng nhập đúng định dạng số!");
				} catch (NumberException e) {
					cont = true;
					System.out.println(e.getMessage());
				}
			} while (cont);
			do {
				try {
					System.out.print("Nhập điểm hoá: ");
					diemHoa = Float.parseFloat(input.nextLine());
					if (diemHoa > 10 || diemHoa < 0) {
						throw new NumberException("Vui lòng nhập điểm >= 0 hoặc <= 10!");
					}
					cont = false;
				} catch (NumberFormatException e) {
					cont = true;
					System.out.println("Vui lòng nhập đúng định dạng số!");
				} catch (NumberException e) {
					cont = true;
					System.out.println(e.getMessage());
				}
			} while (cont);

			ThiSinh objTS = new ThiSinh(name, diemToan, diemHoa, diemLy);
			list.add(objTS);
		}
		return list;
	}

	// Hiển thị danh sách thí sinh
	public void displayData(ArrayList<ThiSinh> list) {
		if (list.size() > 0) {
			System.out.println("========= DANH SÁCH THÍ SINH =========");
			for (ThiSinh thiSinh : list) {
				System.out.println(thiSinh);
				System.out.println("==============");
			}
		} else {
			System.out.println("Không có thí sinh!");
		}
	}

	// Danh sách thí sinh trúng tuyển
	public void thiSinhTrungTuyen(ArrayList<ThiSinh> list) {
		if (list.size() > 0) {
			System.out.println("========= DANH SÁCH THÍ SINH TRÚNG TUYỂN =========");
			for (ThiSinh thiSinh : list) {
				if (thiSinh.tongDiem() >= 17) {
					System.out.println(thiSinh);
					System.out.println("==============");
				}
			}
		} else {
			System.out.println("Không có thí sinh!");
		}
	}

	// Hoán đổi 2 obj ThiSinh
	public static void swap(ThiSinh ts1, ThiSinh ts2) {
		ThiSinh ts = new ThiSinh();
		ts.setName(ts1.getName());
		ts.setDiemToan(ts1.getDiemToan());
		ts.setDiemLy(ts1.getDiemLy());
		ts.setDiemHoa(ts1.getDiemHoa());
		ts1.setName(ts2.getName());
		ts1.setDiemToan(ts2.getDiemToan());
		ts1.setDiemLy(ts2.getDiemLy());
		ts1.setDiemHoa(ts2.getDiemHoa());
		ts2.setName(ts.getName());
		ts2.setDiemToan(ts.getDiemToan());
		ts2.setDiemLy(ts.getDiemLy());
		ts2.setDiemHoa(ts.getDiemHoa());
	}

	// Sắp xếp thí sinh trúng tuyển theo thứ tự giảm dần tổng điểm
	public void sortThiSinh(ArrayList<ThiSinh> list) {
		if (list.size() > 0) {
			System.out.println("========= DANH SÁCH THÍ SINH TRÚNG TUYỂN THEO THỨ TỰ TỔNG ĐIỂM GIẢM DẦN =========");
			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = i + 1; j < list.size(); j++) {
					if (list.get(i).tongDiem() < list.get(j).tongDiem()) {
						swap(list.get(i), list.get(j));
					}
				}
			}
			for (ThiSinh thiSinh : list) {
				if (thiSinh.tongDiem() >= 17) {
					System.out.println(thiSinh);
					System.out.println("==============");
				}
			}
		} else {
			System.out.println("Không có thí sinh!");
		}
	}

}