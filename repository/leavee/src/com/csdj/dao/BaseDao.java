package com.csdj.dao;

import java.io.IOException;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.csdj.Util.BaseDaoUtil;

public class BaseDao {
	private	Connection conn;
	public BaseDao(Connection conn){
		this.conn=conn;
	}
	public int update(String sql,Object...obj){
		PreparedStatement pstmt=null;
		int result=0;
		try {
			pstmt=conn.prepareStatement(sql);
			if(obj!=null){
				for(int i=0;i<obj.length;i++){
					pstmt.setObject(i+1, obj[i]);
				}
			}
			result= pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDaoUtil.close(null, pstmt, null);
		}
		return result;
		
	}
	
	
	protected ResultSet executeQuery(String sql,Object...obj){
		PreparedStatement pstms=null;
		ResultSet rs=null;
		try {
			pstms=conn.prepareStatement(sql);
			for(int i=0;i<obj.length;i++){
				pstms.setObject(i+1, obj[i]);
			}
			rs=pstms.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
	}
}
