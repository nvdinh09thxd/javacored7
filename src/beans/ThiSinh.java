package beans;

public class ThiSinh {
	private String ten;
	private float diemToan;
	private float diemLy;
	private float diemHoa;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public ThiSinh(String ten, float diemToan, float diemLy, float diemHoa) {
		super();
		this.ten = ten;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public ThiSinh() {
		super();
	}

	public float tongDiem() {
		return this.diemHoa + this.diemLy + this.diemToan;
	}

	@Override
	public String toString() {
		return this.ten + "\t" + this.diemToan + "\t\t" + this.diemLy + "\t\t" + diemHoa + "\t\t" + tongDiem();
	}
}
