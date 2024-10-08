package com.expression.language;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelExp 
{
	@Value("#(54+45 )")
 private int x;
	@Value("#(23>67?5.9:9.6)")
 private double y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "SpelExp [x=" + x + ", y=" + y + "]";
	}
	
}
