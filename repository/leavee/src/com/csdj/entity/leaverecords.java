package com.csdj.entity;

public class leaverecords {

private int id;
private String name;
private String leaveTime;
private String reason;
public leaverecords(){}
public leaverecords(int id,String name,String leaveTime,String reason ){
	this.id=id;
	this.name=name;
	this.reason=reason;
	this.leaveTime=leaveTime;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLeaveTime() {
	return leaveTime;
}
public void setLeaveTime(String leaveTime) {
	this.leaveTime = leaveTime;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}

}
