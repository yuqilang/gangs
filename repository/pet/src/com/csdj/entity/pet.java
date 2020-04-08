package com.csdj.entity;

public class pet {
private int petId;
private String petName;
private String petBreed;
private String petSex;
private String birthday;
private String desc;
public pet(){};
public pet(int petid,String petname,String petbreed,String petsex,String bicrthday,String desc){
	this.desc=desc;
	this.petBreed=petbreed;
	this.petId=petid;
	this.petName=petname;
	this.birthday=bicrthday;
	this.petSex=petsex;
}
public int getPetId() {
	return petId;
}
public void setPetId(int petId) {
	this.petId = petId;
}
public String getPetName() {
	return petName;
}
public void setPetName(String petName) {
	this.petName = petName;
}
public String getPetBreed() {
	return petBreed;
}
public void setPetBreed(String petBreed) {
	this.petBreed = petBreed;
}
public String getPetSex() {
	return petSex;
}
public void setPetSex(String petSex) {
	this.petSex = petSex;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
}
