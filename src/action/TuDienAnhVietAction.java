package action;

import java.util.ArrayList;
import java.util.Scanner;

import bean.TuDienAnhViet;
import exception.NumberException;
import exception.WordException;

public class TuDienAnhVietAction {
	public ArrayList<TuDienAnhViet> inputData(ArrayList<TuDienAnhViet> list) {
		int n = 0;
		String word = "", vietnameseMeaning = "", articulation = "";
		boolean cont = false;
		Scanner input = new Scanner(System.in);
		do {
			try {
				System.out.print("Số từ cần nhập: ");
				n = Integer.parseInt(input.nextLine());
				if (n < 0) {
					throw new NumberException("Vui lòng nhập số lượng từ >= 0!");
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
		System.out.println("========== NHẬP THÔNG TIN ==========");
		for (int i = 1; i <= n; i++) {
			System.out.println("========== Nhập từ thứ " + i + " ==========");
			do {
				try {
					System.out.print("Nhập từ tiếng Anh: ");
					word = input.nextLine();
					if (check(list, word)) {
						throw new WordException("Từ vừa nhập đã có trong từ điển!");
					}
					cont = false;
				} catch (WordException e) {
					cont = true;
					System.out.println(e.getMessage());
				}
			} while (cont);
			System.out.print("Nhập nghĩa tiếng Việt: ");
			vietnameseMeaning = input.nextLine();
			System.out.print("Nhập cách phát âm: ");
			articulation = input.nextLine();

			TuDienAnhViet obj = new TuDienAnhViet(word, vietnameseMeaning, articulation);
			list.add(obj);
		}
		return list;
	}
	
	public boolean check(ArrayList<TuDienAnhViet> list, String word) {
		if (list.size() > 0) {
			for (TuDienAnhViet tuDienAnhViet : list) {
				if (word.equals(tuDienAnhViet.getWord())) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	public void displayData(ArrayList<TuDienAnhViet> list) {
		if (list.size() > 0) {
			System.out.println("========== TỪ ĐIỂN ANH - VIỆT ==========");
			for (TuDienAnhViet tuDienAnhViet : list) {
				System.out.println(tuDienAnhViet);
				System.out.println("==========");
			}
		} else {
			System.out.println("Từ điển chưa có thông tin!");
		}
	}

	public void translation(ArrayList<TuDienAnhViet> list) {
		if (list.size() > 0) {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhập từ tiếng Anh cần tìm: ");
			String wordSearch = input.nextLine();
			for (TuDienAnhViet tuDienAnhViet : list) {
				if (wordSearch.equals(tuDienAnhViet.getWord())) {
					System.out.println("Vietnamese meaning: " + tuDienAnhViet.getVietnameseMeaning());
					System.out.println("Articulation: " + tuDienAnhViet.getArticulation());
					return;
				}
			}
			System.out.println("Không tìm thấy " + wordSearch + "!");
		} else {
			System.out.println("Từ điển chưa có dữ liệu!");
		}
	}

	public void menu() {
		TuDienAnhVietAction obj = new TuDienAnhVietAction();
		ArrayList<TuDienAnhViet> list = new ArrayList<TuDienAnhViet>();

		while (true) {
			System.out.println("======= TỪ ĐIỂN ANH VIỆT – BÀI TẬP VINAENTER EDU =======");
			System.out.println("--1. Nhập dữ liệu");
			System.out.println("--2. Xuất dữ liệu");
			System.out.println("--3. Dịch từ");
			System.out.println("--4. Thoát");
			Scanner input = new Scanner(System.in);
			boolean cont = false;
			int choose = 0;
			do {
				try {
					System.out.print("Nhập lựa chọn: ");
					choose = Integer.parseInt(input.nextLine());
					if (choose < 1 || choose > 4) {
						throw new NumberException("Vui lòng nhập lựa chọn từ 1 đến 4!");
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
			if (choose == 1) {
				list = obj.inputData(list);
			} else if (choose == 2) {
				obj.displayData(list);
			} else if (choose == 3) {
				obj.translation(list);
			} else {
				System.out.println("Cảm ơn đã sử dụng từ điển!");
				break;
			}

		}
	}
}