package com.beanscope.usinganootation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class Employee 
{
	@Value("john")
   private String ename;
	@Value("999")
   private int eid;
	@Value("1000.0")
   private double esal;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public double getEsal() {
	return esal;
}
public void setEsal(double esal) {
	this.esal = esal;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", eid=" + eid + ", esal=" + esal + "]";
}
   
}
