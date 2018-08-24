package Funding.Bean;

import java.io.Serializable;

public class Myreservation implements Serializable {
	private String c_title;
	private String c_intro;
	private String f_resday;
	private int f_price;
	
	Myreservation(){}

	public Myreservation(String c_title, String c_intro, String f_resday, int f_price) {
		super();
		this.c_title = c_title;
		this.c_intro = c_intro;
		this.f_resday = f_resday;
		this.f_price = f_price;
	}

	public String getC_title() {
		return c_title;
	}

	public void setC_title(String c_title) {
		this.c_title = c_title;
	}

	public String getC_intro() {
		return c_intro;
	}

	public void setC_intro(String c_intro) {
		this.c_intro = c_intro;
	}

	public String getF_resday() {
		return f_resday;
	}

	public void setF_resday(String f_resday) {
		this.f_resday = f_resday;
	}

	public int getF_price() {
		return f_price;
	}

	public void setF_price(int f_price) {
		this.f_price = f_price;
	}
	
	
}
