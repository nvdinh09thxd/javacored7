package beans;

public class TuDien {
	private String tu;
	private String nghiaTV;
	private String phienAm;

	public String getTu() {
		return tu;
	}

	public void setTu(String tu) {
		this.tu = tu;
	}

	public String getNghiaTV() {
		return nghiaTV;
	}

	public void setNghiaTV(String nghiaTV) {
		this.nghiaTV = nghiaTV;
	}

	public String getPhienAm() {
		return phienAm;
	}

	public void setPhienAm(String phienAm) {
		this.phienAm = phienAm;
	}

	public TuDien(String tu, String nghiaTV, String phienAm) {
		super();
		this.tu = tu;
		this.nghiaTV = nghiaTV;
		this.phienAm = phienAm;
	}

	public TuDien() {
		super();
	}

	@Override
	public String toString() {
		if (this.nghiaTV.length() > 5) {
			return this.tu + "\t\t\t" + this.nghiaTV + "\t\t\t" + this.phienAm;
		} else {
			return this.tu + "\t\t\t" + this.nghiaTV + "\t\t\t\t" + this.phienAm;
		}
	}
}
