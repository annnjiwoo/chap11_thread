package com.javalab.thread.pkg01;
/**
 * 실행클래스
 */
public class ThreadMain {
	
	public static void main(String[] args) {
		// 1. 위에서 정의해놓은 Mythread 클래스 사용해서 스레드 객체 생성
		Mythread t1 = new Mythread();
		
		//스레드 실행
		t1.start(); // start 호출 시 새로운 스레드가 생긴다.
	}

}
