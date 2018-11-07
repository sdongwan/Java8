package com.sdongwan.Java8;  
/**  
*
* @author 宋东皖
* @date 2018年8月20日 下午7:12:20  
* 
*/  
public class Apple {
	private String color;
	private int weight ;
	private int appleId;
	
	
	public Apple(String color, int weight,int appleId) {
		super();
		this.color = color;
		this.weight = weight;
		this.appleId = appleId;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getAppleId() {
		return appleId;
	}
	
	public void setAppleId(int appleId) {
		this.appleId = appleId;
	}
}
