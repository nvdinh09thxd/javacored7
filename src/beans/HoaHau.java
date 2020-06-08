package beans;

import java.util.ArrayList;
import java.util.Scanner;

public class HoaHau {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HoaHau(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public HoaHau() {
		super();
	}

	@Override
	public String toString() {
		return "id=" + this.id + "\nname=" + this.name;
	}

}
