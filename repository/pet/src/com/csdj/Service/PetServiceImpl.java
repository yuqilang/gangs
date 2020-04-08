package com.csdj.Service;

import java.sql.Connection;
import java.util.List;

import com.csdj.Util.BaseDaoUtil;
import com.csdj.dao.PetDao;
import com.csdj.dao.Impl.PetDaoImpl;
import com.csdj.entity.pet;

public class PetServiceImpl implements PetService {

	@Override
	public List<pet> cha() {
		Connection conn=BaseDaoUtil.getConnection();
		PetDao pd=new PetDaoImpl(conn);
		return pd.cha();
	}

	@Override
	public List<pet> cha(String leix) {
		Connection conn=BaseDaoUtil.getConnection();
		PetDao pd=new PetDaoImpl(conn);
		return pd.cha(leix);
	}

	@Override
	public int zeng(String name, String leix, String sex, String riqi, String miaoshu) {
		Connection conn=BaseDaoUtil.getConnection();
		PetDao pd=new PetDaoImpl(conn);
		return pd.zeng(name, leix, sex, riqi, miaoshu);
	}

	@Override
	public int update(pet pet) {
		Connection conn=BaseDaoUtil.getConnection();
		PetDao pd=new PetDaoImpl(conn);
		return pd.update(pet);
	}

	@Override
	public int delete(int id) {
		Connection conn=BaseDaoUtil.getConnection();
		PetDao pd=new PetDaoImpl(conn);
		return pd.delete(id);
	}

}
