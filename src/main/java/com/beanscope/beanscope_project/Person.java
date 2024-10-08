package com.beanscope.beanscope_project;

public class Person 
{
  private String pname;
  private int pid;
  private String plocation;
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPlocation() {
	return plocation;
}
public void setPlocation(String plocation) {
	this.plocation = plocation;
}
@Override
public String toString() {
	return "Person [pname=" + pname + ", pid=" + pid + ", plocation=" + plocation + "]";
}
  
}
