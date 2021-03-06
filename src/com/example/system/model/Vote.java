package com.example.system.model;

import java.sql.Date;
import java.util.List;


public class Vote extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int v_id;	
	private String v_title;	
	private String v_content;	
	private int u_no;	
	private int v_tnum;	
	private String pubtime;
	public String getPubtime() {
		return pubtime;
	}

	public void setPubtime(String pubtime) {
		this.pubtime = pubtime;
	}




	private List<Item> itemlist;

	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public String getV_title() {
		return v_title;
	}

	public void setV_title(String v_title) {
		this.v_title = v_title;
	}

	public String getV_content() {
		return v_content;
	}

	public void setV_content(String v_content) {
		this.v_content = v_content;
	}

	public int getU_no() {
		return u_no;
	}

	public void setU_no(int u_no) {
		this.u_no = u_no;
	}


	public Vote(int v_id, String v_title, String v_content, int u_no, int v_tnum, String pubtime, List<Item> itemlist) {
		super();
		this.v_id = v_id;
		this.v_title = v_title;
		this.v_content = v_content;
		this.u_no = u_no;
		this.v_tnum = v_tnum;
		this.pubtime = pubtime;
		this.itemlist = itemlist;
	}

	public Vote() {
		// TODO Auto-generated constructor stub
	}

	public int getV_tnum() {
		return v_tnum;
	}




	public void setV_tnum(int v_tnum) {
		this.v_tnum = v_tnum;
	}





	public List<Item> getItemlist() {
		return itemlist;
	}

	public void setItemlist(List<Item> itemlist) {
		this.itemlist = itemlist;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vote [v_id=" + v_id + ", v_content=" + v_content + ", u_no=" + u_no
			+ ", v_tnum=" + v_tnum + ", v_title=" + v_title + "]";
	}

	
}
