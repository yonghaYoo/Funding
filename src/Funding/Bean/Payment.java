package Funding.Bean;

import java.io.Serializable;

public class Payment implements Serializable {
	private int p_num;
	private int p_payday;
	private int p_usepoint;
	private int p_givepoint;
	private int f_num;
	
	public Payment() {}
	
	
	
	public Payment(int p_num, int p_payday, int p_usepoint, int p_givepoint, int f_num) {
		super();
		this.p_num = p_num;
		this.p_payday = p_payday;
		this.p_usepoint = p_usepoint;
		this.p_givepoint = p_givepoint;
		this.f_num = f_num;
	}



	public int getP_num() {
		return p_num;
	}
	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	public int getP_payday() {
		return p_payday;
	}
	public void setP_payday(int p_payday) {
		this.p_payday = p_payday;
	}
	public int getP_usepoint() {
		return p_usepoint;
	}
	public void setP_usepoint(int p_usepoint) {
		this.p_usepoint = p_usepoint;
	}
	public int getP_givepoint() {
		return p_givepoint;
	}
	public void setP_givepoint(int p_givepoint) {
		this.p_givepoint = p_givepoint;
	}
	public int getF_num() {
		return f_num;
	}
	public void setF_num(int f_num) {
		this.f_num = f_num;
	}
	
	
}
