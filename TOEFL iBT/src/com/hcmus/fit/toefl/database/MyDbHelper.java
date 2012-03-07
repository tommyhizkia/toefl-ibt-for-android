package com.hcmus.fit.toefl.database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MyDbHelper extends SQLiteOpenHelper {

	private static final String BaiThi = "CREATE TABLE BaiThi ("
			+ " MaBaiThi INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ " TenBaiThi TEXT," + " SoCauHoi INTEGER,"
			+ " ThoiGianLamBai TEXT," + " MaDangThi INTEGER,"
			+ " MaLoaiBaiThi INTEGER," + " MaCapDo INTEGER,"
			+ " MaChuDe INTEGER," + " DaLam INTEGER);";

	private static final String CapDo = "CREATE TABLE CapDo ("
			+ " MaCapDo INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ " TenCapDo TEXT);";

	private static final String CauHoi = "CREATE TABLE CauHoi (CauHoi INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "            NoiDungCauHoi TEXT,"
			+ "            MaLoaiCauHoi INTEGER,"
			+ "            MaDoanVan INTEGER);";

	private static final String ChiTietBaiThi = "CREATE TABLE ChiTietBaiThi (MaChiTietBaiThi INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "                              MaBaiThi INTEGER,"
			+ "                              MaDoanVan INTEGER);";

	private static final String ChiTietKetQuaThi = "CREATE TABLE ChiTietKetQuaThi (MaChiTietKetQuatThi INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "            MoTaChiTiet TEXT,"
			+ "            MaKetQuaThi INTEGER,"
			+ "            MaDangThi INTEGER,"
			+ "            SoCauDung INTEGER,"
			+ "            SoCauSai INTEGER,"
			+ "            SoCauChuaLam INTEGER,"
			+ "            Diem INTEGER);";

	private static final String ChiTietLuaChon = "CREATE TABLE ChiTietLuaChon (MaChiTietLuaChon INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "            MaChiTietKetQuaThi INTEGER,"
			+ "            MaCauHoi INTEGER,"
			+ "            MaLuaChon INTEGER,"
			+ "            NoiDungLuaChon TEXT,"
			+ "            NoiDungDapAn TEXT,"
			+ "            NoiDungTraLoi TEXT);";

	private static final String ChuDe = "CREATE TABLE ChuDe (MaChuDe INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "            TenChuDe TEXT);";

	private static final String DangThi = "CREATE TABLE DangThi (MaDangThi INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "              TenDangThi TEXT);";

	private static final String DoanVan = "CREATE TABLE DoanVan (MaDoanVan INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "				 MaBaiThi INTEGER,"
			+ "				 NoiDungDoanVan TEXT,"
			+ "              NoiDungDoanVan BLOB);";

	private static final String KetQuaThi = "CREATE TABLE KetQuaThi (MaKetQuaThi INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "                MaThiSinh INTEGER,"
			+ "                MaBaiThi INTEGER,"
			+ "                TongDiem INTEGER,"
			+ "                NgayThi TEXT);";

	private static final String LoaiBaiThi = "CREATE TABLE LoaiBaiThi (LoaiBaiThi INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "                 TenLoaiBaiThi TEXT);";

	private static final String LuaChon = "CREATE TABLE LuaChon (MaLuaChon INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,              "
			+ "			NoiDungLuaChon TEXT,"
			+ "           LaDapAn INTEGER,"
			+ "           MaCauHoi INTEGER);";

	private static final String MoTaDangThi = "CREATE TABLE MoTaDangThi (MaMoTaDangThi INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "                  MaDangThi INTEGER,"
			+ "                  MoTaDangThi BLOB,"
			+ "                  CachThucThi BLOB);";

	private static final String LoaiCauHoi = "CREATE TABLE LoaiCauHoi (MaLoaiCauHoi INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "	MaDangThi INTEGER," + "	TenLoaiCauHoi TEXT);";

	private static final String MoTaLoaiCauHoi = "CREATE TABLE MoTaLoaiCauHoi (MaMoTaLoaiCauHoi INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "                     MoTaLoaiCauHoi TEXT,"
			+ "                     CachThucThi TEXT,"
			+ "                     MaLoaiCauHoi INTEGER);";

	private static final String sysdiagrams = "CREATE TABLE sysdiagrams (name TEXT NOT NULL,"
			+ "                  principal_id INTEGER NOT NULL,"
			+ "                  diagram_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "                  version INTEGER,"
			+ "                  definition BLOB);";

	private static final String ThiSinh = "CREATE TABLE ThiSinh (MaThiSinh INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "              TenThiSinh TEXT);";

	private static final String Tip = "CREATE TABLE Tip (MaTip INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"
			+ "          NoiDungTip TEXT,"
			+ "          MaLoaiCauHoi INTEGER,"
			+ "          MaBaiThi INTEGER,"
			+ "          MaDangBaiThi INTEGER);";

	// private static final String CREATE_TABLE = "create table "
	// + Constants.TABLE_NAME + " (" + Constants.KEY_ID
	// + " integer primary key autoincrement, " + Constants.TITLE_NAME
	// + " text not null, " + Constants.CONTENT_NAME + " text not null, "
	// + Constants.DATE_NAME + " long);";

	// private final static String fileName =
	// "/data/data/com.hcmus.fit.toefl/files/script.txt";
	// public static final String openFile() {
	// try {
	// // File f = new
	// // File("/data/data/com.hcmus.fit.toefl/files/hello.txt");
	// // f.createNewFile();
	//
	// FileInputStream fis = new FileInputStream("/data/script.txt");
	//
	// BufferedReader r = new BufferedReader(new InputStreamReader(fis));
	// String doString = "";
	// char ch;
	// int i = r.read();
	// while (i != -1) {
	// ch = (char) i;
	// doString += ch;
	// i = r.read();
	// }
	// r.close();
	// return doString;
	// } catch (IOException e1) {
	// // TODO Auto-generated catch block
	// e1.printStackTrace();
	// return "";
	// }
	// }

	public MyDbHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		Log.v("MyDBhelper onCreate", "Creating all the tables");
		try {
			db.execSQL(BaiThi);
			db.execSQL(CapDo);
			db.execSQL(CauHoi);
			db.execSQL(ChiTietBaiThi);
			db.execSQL(ChiTietKetQuaThi);
			db.execSQL(ChiTietLuaChon);
			db.execSQL(ChuDe);
			db.execSQL(DangThi);
			db.execSQL(DangThi);
			db.execSQL(DoanVan);
			db.execSQL(KetQuaThi);
			db.execSQL(LoaiBaiThi);
			db.execSQL(LoaiCauHoi);
			db.execSQL(LuaChon);
			db.execSQL(MoTaDangThi);
			db.execSQL(MoTaLoaiCauHoi);
			db.execSQL(ThiSinh);
			db.execSQL(Tip);
			db.execSQL(sysdiagrams);
		} catch (SQLiteException ex) {
			Log.v("Create table exception", ex.getMessage());
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		Log.w("TaskDBAdapter", "Upgrading from version " + oldVersion + " to "
				+ newVersion + ", which will destroy all old data");
		// db.execSQL("drop table if exists " + Constants.TABLE_NAME);
		onCreate(db);
	}
}
