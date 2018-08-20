package Funding.Bean;

import java.io.Serializable;

public class Reward implements Serializable {
	private int r_num;
	private String r_title;
	private String r_detail;
	private int r_price;
	private int r_depay;
	private int c_num;
	
	public Reward() {}
	
	
	public Reward(int r_num, String r_title, String r_detail, int r_price, int r_depay, int c_num) {
		super();
		this.r_num = r_num;
		this.r_title = r_title;
		this.r_detail = r_detail;
		this.r_price = r_price;
		this.r_depay = r_depay;
		this.c_num = c_num;
	}


	public int getR_num() {
		return r_num;
	}
	public void setR_num(int r_num) {
		this.r_num = r_num;
	}
	public String getR_title() {
		return r_title;
	}
	public void setR_title(String r_title) {
		this.r_title = r_title;
	}
	public String getR_detail() {
		return r_detail;
	}
	public void setR_detail(String r_detail) {
		this.r_detail = r_detail;
	}
	public int getR_price() {
		return r_price;
	}
	public void setR_price(int r_price) {
		this.r_price = r_price;
	}
	public int getR_depay() {
		return r_depay;
	}
	public void setR_depay(int r_depay) {
		this.r_depay = r_depay;
	}
	public int getC_num() {
		return c_num;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	
	
}
