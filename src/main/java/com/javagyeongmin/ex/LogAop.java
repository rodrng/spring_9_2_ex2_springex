package com.javagyeongmin.ex;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		
		String signatureStr = joinPoint.getSignature().toShortString(); // Ÿ�� �޼ҵ��� signature ���� 
		System.out.println(signatureStr + "�޼ҵ� ȣ��");
		long st = System.currentTimeMillis(); // �޼ҵ� ȣ�� "��"�� ���� �ð�
		
		try {
		Object obj = joinPoint.proceed(); // Ÿ���� �޼ҵ�(�ٽɱ��)�� ȣ��
		return obj;
		}finally {
			long et = System.currentTimeMillis(); // �޼ҵ� ȣ�� "��"�� ���� �ð�
			System.out.println(signatureStr + "�޼ҵ� ����");
			System.out.println(signatureStr + "�޼ҵ��� �۾� ����ð�" + (et-st) + "ms");
		}
		
	}
	
	
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("before Advice ����");
	}
	public void afterReturningAdvice(JoinPoint joinPoint) {
		System.out.println("after Returning Advice ����");
	}
	public void afterThrowingAdvice(JoinPoint joinPoint) {
		System.out.println("after Throwing Advice ����");
	}
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("after Advice ����");
	}
	
	
}
