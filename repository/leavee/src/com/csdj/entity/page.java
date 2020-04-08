package com.csdj.entity;

import java.util.List;

public class page {

private int pageSize;
private int totalPage;
private int curPageNo;
private int totalCount;
private List<leaverecords> pageList;
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getTotalPage() {
	return totalPage;
}
public void setTotalPage(int totalPage) {
	this.totalPage = totalPage;
}
public int getCurPageNo() {
	return curPageNo;
}
public void setCurPageNo(int curPageNo) {
	this.curPageNo = curPageNo;
}
public int getTotalCount() {
	return totalCount;
}
public void setTotalCount(int totalCount) {
	this.totalCount = totalCount;
	if(totalCount% pageSize==0){
		this.totalCount=totalCount/pageSize;
	}else{
		this.totalCount=totalCount/pageSize+1;
		
	}
}
public List<leaverecords> getPageList() {
	return pageList;
}
public void setPageList(List<leaverecords> pageList) {
	this.pageList = pageList;
}
}
