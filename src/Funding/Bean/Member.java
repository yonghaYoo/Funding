package Funding.Bean;

import java.io.Serializable;

public class Member implements Serializable {
	private int m_num;
	private String m_name;
	private String m_id;
	private String m_pw;
	private String m_pno;
	private String m_email;
	private String m_acc;
	private int m_ownpoint;
	private String m_add;
	private int c_num;
	
	public Member() {}
	

	public Member(int m_num, String m_name, String m_id, String m_pw, String m_pno, String m_email, String m_acc,
			int m_ownpoint, String m_add, int c_num) {
		super();
		this.m_num = m_num;
		this.m_name = m_name;
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_pno = m_pno;
		this.m_email = m_email;
		this.m_acc = m_acc;
		this.m_ownpoint = m_ownpoint;
		this.m_add = m_add;
		this.c_num = c_num;
	}




	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_pno() {
		return m_pno;
	}
	public void setM_pno(String m_pno) {
		this.m_pno = m_pno;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_acc() {
		return m_acc;
	}
	public void setM_acc(String m_acc) {
		this.m_acc = m_acc;
	}
	public int getM_ownpoint() {
		return m_ownpoint;
	}
	public void setM_ownpoint(int m_ownpoint) {
		this.m_ownpoint = m_ownpoint;
	}
	public String getM_add() {
		return m_add;
	}
	public void setM_add(String m_add) {
		this.m_add = m_add;
	}
	public int getC_num() {
		return c_num;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	
	
	
}
