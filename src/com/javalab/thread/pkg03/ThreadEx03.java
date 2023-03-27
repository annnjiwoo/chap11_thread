package com.javalab.thread.pkg03;

public class ThreadEx03 {
	public static void main(String[] args) {
		
//		// 첫번째 스레드 객체 생성 (상속)
//		ThreadEx3_1 t1 = new ThreadEx3_1();
//		
//		// 두번째 스레드 객체 생성(인터페이스 구현)
//		Runnable r = new ThreadEx3_2();
//		Thread t2 = new Thread(r);	// 생성자 Thread(Runnable target)
//		
//		t1.start(); // 스레드 이름 : Thread-0
//		t2.start(); // 스레드 이름 : Thread-1
		
		
		//싱글스레드
		for (int i = 0; i < 100; i++) {
			 //조상인 Thread의 getName
			System.out.print(0);
		}
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			System.out.print(1);
		}
	}

}
/**
 * Thread를 상속하는 스레드 클래스
*/

class ThreadEx3_1 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			 //조상인 Thread의 getName
			System.out.print(0);
		}
	}
}

/**
 * Runnable을 구현한 구현 클래스를 통한 스레드 구현
 */
class ThreadEx3_2 implements Runnable {
	public void run() {
		for (int i = 0; i < 100; i++) {
		
			//Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
			//Thread를 상속받지 않아서 바로 사용하지 못함
			System.out.print(1);
		}
	}
}