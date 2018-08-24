package Funding.Bean;

import java.io.Serializable;

public class Funding implements Serializable {
	private int f_num;
	private int f_resday;
	private int f_price;
	private int f_amount;
	private String f_readd;
	private int f_card_1;
	private int f_card_2;
	private int f_card_3;
	private int f_card_4;
	private int r_num;
	private int m_num;
	private String f_rename;
	
	public Funding() {}
	
	
	






	public Funding(int f_num, int f_resday, int f_price, int f_amount, String f_readd, int f_card_1, int f_card_2,
			int f_card_3, int f_card_4, int r_num, int m_num, String f_rename) {
		super();
		this.f_num = f_num;
		this.f_resday = f_resday;
		this.f_price = f_price;
		this.f_amount = f_amount;
		this.f_readd = f_readd;
		this.f_card_1 = f_card_1;
		this.f_card_2 = f_card_2;
		this.f_card_3 = f_card_3;
		this.f_card_4 = f_card_4;
		this.r_num = r_num;
		this.m_num = m_num;
		this.f_rename = f_rename;
	}









	public int getF_num() {
		return f_num;
	}
	public void setF_num(int f_num) {
		this.f_num = f_num;
	}
	public int getF_resday() {
		return f_resday;
	}
	public void setF_resday(int f_resday) {
		this.f_resday = f_resday;
	}
	public int getF_price() {
		return f_price;
	}
	public void setF_price(int f_price) {
		this.f_price = f_price;
	}
	public int getF_amount() {
		return f_amount;
	}
	public void setF_amount(int f_amount) {
		this.f_amount = f_amount;
	}
	public String getF_readd() {
		return f_readd;
	}
	public void setF_readd(String f_readd) {
		this.f_readd = f_readd;
	}
	public int getF_card_1() {
		return f_card_1;
	}
	public void setF_card_1(int f_card_1) {
		this.f_card_1 = f_card_1;
	}
	public int getF_card_2() {
		return f_card_2;
	}
	public void setF_card_2(int f_card_2) {
		this.f_card_2 = f_card_2;
	}
	public int getF_card_3() {
		return f_card_3;
	}
	public void setF_card_3(int f_card_3) {
		this.f_card_3 = f_card_3;
	}
	public int getF_card_4() {
		return f_card_4;
	}
	public void setF_card_4(int f_card_4) {
		this.f_card_4 = f_card_4;
	}
	public int getR_num() {
		return r_num;
	}
	public void setR_num(int r_num) {
		this.r_num = r_num;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public String getF_rename() {
		return f_rename;
	}

	public void setF_rename(String f_rename) {
		this.f_rename = f_rename;
	}



}
