package Funding.Bean;

import java.io.Serializable;

public class Contents implements Serializable {
	private int c_num;
	private String c_title;
	private String c_cate;
	private String c_titleimg;
	private String c_intro;
	private String c_text;
	private String c_midimg;
	private String c_topimg;
	private String c_dead;
	private int c_goal;
	private int c_sumprice;
	
	public Contents() { }
	
	
	
	public Contents(int c_num, String c_title, String c_cate, String c_titleimg, String c_intro, String c_text,
			String c_midimg, String c_topimg, String c_dead, int c_goal, int c_sumprice) {
		super();
		this.c_num = c_num;
		this.c_title = c_title;
		this.c_cate = c_cate;
		this.c_titleimg = c_titleimg;
		this.c_intro = c_intro;
		this.c_text = c_text;
		this.c_midimg = c_midimg;
		this.c_topimg = c_topimg;
		this.c_dead = c_dead;
		this.c_goal = c_goal;
		this.c_sumprice = c_sumprice;
	}



	public int getC_num() {
		return c_num;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public String getC_title() {
		return c_title;
	}
	public void setC_title(String c_title) {
		this.c_title = c_title;
	}
	public String getC_cate() {
		return c_cate;
	}
	public void setC_cate(String c_cate) {
		this.c_cate = c_cate;
	}
	public String getC_titleimg() {
		return c_titleimg;
	}
	public void setC_titleimg(String c_titleimg) {
		this.c_titleimg = c_titleimg;
	}
	public String getC_intro() {
		return c_intro;
	}
	public void setC_intro(String c_intro) {
		this.c_intro = c_intro;
	}
	public String getC_text() {
		return c_text;
	}
	public void setC_text(String c_text) {
		this.c_text = c_text;
	}
	public String getC_midimg() {
		return c_midimg;
	}
	public void setC_midimg(String c_midimg) {
		this.c_midimg = c_midimg;
	}
	public String getC_topimg() {
		return c_topimg;
	}
	public void setC_topimg(String c_topimg) {
		this.c_topimg = c_topimg;
	}
	public String getC_dead() {
		return c_dead;
	}
	public void setC_dead(String c_dead) {
		this.c_dead = c_dead;
	}
	public int getC_goal() {
		return c_goal;
	}
	public void setC_goal(int c_goal) {
		this.c_goal = c_goal;
	}
	public int getC_sumprice() {
		return c_sumprice;
	}
	public void setC_sumprice(int c_sumprice) {
		this.c_sumprice = c_sumprice;
	}
	
	
}
