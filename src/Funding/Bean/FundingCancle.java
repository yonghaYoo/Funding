package Funding.Bean;

import java.io.Serializable;

public class FundingCancle implements Serializable{
	private int fc_num;
	private int fc_cancleday;
	private int f_num;
	
	public int getFc_num() {
		return fc_num;
	}
	public void setFc_num(int fc_num) {
		this.fc_num = fc_num;
	}
	public int getFc_cancleday() {
		return fc_cancleday;
	}
	public void setFc_cancleday(int fc_cancleday) {
		this.fc_cancleday = fc_cancleday;
	}
	public int getF_num() {
		return f_num;
	}
	public void setF_num(int f_num) {
		this.f_num = f_num;
	}
	
	
}
