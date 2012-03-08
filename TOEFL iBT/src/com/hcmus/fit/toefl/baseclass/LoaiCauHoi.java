package com.hcmus.fit.toefl.baseclass;

public class LoaiCauHoi {
	private int id;
	private int maDangThi;
	private String tenLoaiCauhoi;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tenLoaiCauhoi;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaDangThi() {
		return maDangThi;
	}
	public void setMaDangThi(int maDangThi) {
		this.maDangThi = maDangThi;
	}
	public String getTenLoaiCauhoi() {
		return tenLoaiCauhoi;
	}
	public void setTenLoaiCauhoi(String tenLoaiCauhoi) {
		this.tenLoaiCauhoi = tenLoaiCauhoi;
	}
}
