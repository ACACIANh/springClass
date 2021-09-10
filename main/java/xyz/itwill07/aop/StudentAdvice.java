package xyz.itwill07.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Advice 클래스 : 횡단관심모듈이 선언된 클래스
//횡단관심모듈(CrossCutting Concern Module) : 횡단관심코드가 작성된 메소드
//횡단관심코드 : 핵심관심코드 실행 전 또는 후에 실행될 부가적인 명령
// => 로그, 보안(권한 처리), 트렌젝션 처리, 예외처리 등의 명령 
public class StudentAdvice {
	private final static Logger logger=LoggerFactory.getLogger(StudentAdvice.class);
	
	//타겟메소드(핵심관심모듈) 동작 전 삽입되어 실행될 명령을 작성하기 위한 메소드(횡단관심모듈)
	// => JoinPoint : Before Advice
	//JoinPoint : 핵심관심모듈을 기준으로 횡단관심모듈이 삽입될 위치 표현
	public void beforeLog() {
		logger.info("[before]핵심관심코드 동작 전 삽입되어 실행될 횡단관심코드");
	}
}
