package com.sdongwan.Java8;  
/**  
*
* @author 宋东皖
* @date 2018年10月16日 下午9:57:58  
* 
*/  
public class MyClass implements MyInterface{

	private String name ;
	
	public  MyClass(String name) {
		this.name = name ;
	}
	
	@Override
	public boolean test(Object object) {
		return false;
	}
	
	public String getName () {
		return this.name;
	}
	
}
