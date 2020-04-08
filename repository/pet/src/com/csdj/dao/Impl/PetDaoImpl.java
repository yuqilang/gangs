package com.csdj.dao.Impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.csdj.dao.BaseDao;
import com.csdj.dao.PetDao;
import com.csdj.entity.pet;

public class PetDaoImpl extends BaseDao implements PetDao {
	private ResultSet rs = null;
	public PetDaoImpl(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<pet> cha() {
		List<pet> list=new ArrayList<>();
		pet pet=null;
		String sql="select * from pet";
		rs=executeQuery(sql);
		try {
			while(rs.next()){
				pet=new pet();
				pet.setPetId(rs.getInt(1));
				pet.setPetName(rs.getString(2));
				pet.setPetBreed(rs.getString(3));
				pet.setPetSex(rs.getString(4));
				pet.setBirthday(rs.getString(5));
				pet.setDesc(rs.getString(6));
				list.add(pet);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<pet> cha(String leix) {
		List<pet> list=new ArrayList<>();
		pet pet=null;
		String sql="select * from pet where petBreed=?";
		rs=executeQuery(sql,leix);
		try {
			while(rs.next()){
				pet=new pet();
				pet.setPetId(rs.getInt(1));
				pet.setPetName(rs.getString(2));
				pet.setPetBreed(rs.getString(3));
				pet.setPetSex(rs.getString(4));
				pet.setBirthday(rs.getString(5));
				pet.setDesc(rs.getString(6));
				list.add(pet);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int zeng(String name, String leix, String sex, String riqi, String miaoshu) {
		String sql="insert into pet (petName,petBreed,petSex,birthday,descc) values(?,?,?,?,?)";
		return update(sql, name,leix,sex,riqi,miaoshu);
	}

	@Override
	public int update(pet pet) {
		String sql="update pet set petName=?,petBreed=?,petSex=?,birthday=?,descc=? where petId=?";
		return update(sql, pet.getPetName(),pet.getPetBreed(),pet.getPetSex(),pet.getBirthday(),pet.getDesc(),pet.getPetId());
	}

	@Override
	public int delete(int id) {
		String sql="delete from pet where petId=?";
		return update(sql, id);
	}

}
