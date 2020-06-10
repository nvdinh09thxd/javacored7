package bean;

public class TuDienAnhViet {
	private String word;
	private String vietnameseMeaning;
	private String articulation;

	public TuDienAnhViet() {

	}

	public TuDienAnhViet(String word, String vietnameseMeaning, String articulation) {
		super();
		this.word = word;
		this.vietnameseMeaning = vietnameseMeaning;
		this.articulation = articulation;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getVietnameseMeaning() {
		return vietnameseMeaning;
	}

	public void setVietnameseMeaning(String vietnameseMeaning) {
		this.vietnameseMeaning = vietnameseMeaning;
	}

	public String getArticulation() {
		return articulation;
	}

	public void setArticulation(String articulation) {
		this.articulation = articulation;
	}

	public String toString() {
		return "Word: " + this.word + "\nVietnamese meaning: " + this.vietnameseMeaning + "\nArticulation: "
				+ this.articulation;
	}

}