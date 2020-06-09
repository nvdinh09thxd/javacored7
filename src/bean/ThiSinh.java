package bean;

public class ThiSinh {
	private String name;
	private float diemToan;
	private float diemHoa;
	private float diemLy;

	public ThiSinh() {

	}

	public ThiSinh(String name, float diemToan, float diemHoa, float diemLy) {
		super();
		this.name = name;
		this.diemToan = diemToan;
		this.diemHoa = diemHoa;
		this.diemLy = diemLy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}
	
	public float tongDiem() {
		return this.diemToan + this.diemLy + this.diemHoa;
	}

	public String toString() {
		return "Name: " + this.name + "\nĐiểm (Toán - Lý - Hoá): " + this.diemToan + " - " + this.diemHoa + " - "
				+ this.diemLy + "\nTổng điểm: " + tongDiem();
	}

}