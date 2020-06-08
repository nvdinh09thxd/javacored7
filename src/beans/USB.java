package beans;

public class USB {
	int ma;
	float dungluong;
	String nhansx;
	boolean trangthai;

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public float getDungluong() {
		return dungluong;
	}

	public void setDungluong(float dungluong) {
		this.dungluong = dungluong;
	}

	public String getNhansx() {
		return nhansx;
	}

	public void setNhansx(String nhansx) {
		this.nhansx = nhansx;
	}

	public boolean isTrangthai() {
		return trangthai;
	}

	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}

	public USB(int ma, float dungluong, String nhansx, boolean trangthai) {
		super();
		this.ma = ma;
		this.dungluong = dungluong;
		this.nhansx = nhansx;
		this.trangthai = trangthai;
	}

	public USB() {
		super();
	}

	@Override
	public String toString() {
		return "ma = " + ma + ", dungluong = " + dungluong + ", nhansx = " + nhansx + ", trangthai = " + trangthai;
	}

}
