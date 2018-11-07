package com.sdongwan.Java8;  
/**  
*
* @author 宋东皖
* @date 2018年10月16日 下午9:56:12  
* 
*/  

public interface MyInterface {
	boolean test(Object object);
	default String getName() {
		System.out.println("sdongwan1");
		return "sdongwan1";
	}
}
