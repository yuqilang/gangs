package com.csdj.Service;

import java.util.List;

import com.csdj.entity.pet;

public interface PetService {

List<pet> cha();
List<pet> cha(String leix);
int zeng(String name,String leix,String sex,String riqi,String miaoshu);
int update(pet pet);
int delete(int id);
}
