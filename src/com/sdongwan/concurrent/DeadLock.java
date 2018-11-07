package com.sdongwan.concurrent; 
/**  
*
* @author 宋东皖
* @date 2018年11月7日 下午11:28:48  
*  线程间的死锁模拟
*/
public class DeadLock {
	public static final String A = "A";
	public static final String B = "B";
	
	public static Thread threadA = new Thread(() -> {
		try {
			synchronized (A) {
				Thread.sleep(100);
				System.out.println("threadA enter A");
				synchronized (B) {
					System.out.println("threadA enter B");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	});
	
	public static Thread threadB = new Thread(() -> {
		try {
			synchronized (B) {
				Thread.sleep(100);
				System.out.println("threadB enter B");
				synchronized (A) {
					System.out.println("threadB enter A");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	});
	
	public static void main(String[] args) {
		threadA.start();
		threadB.start();
	}
}


