package xyz.itwill07.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Advice Ŭ���� : Ⱦ�ܰ��ɸ���� ����� Ŭ����
//Ⱦ�ܰ��ɸ��(CrossCutting Concern Module) : Ⱦ�ܰ����ڵ尡 �ۼ��� �޼ҵ�
//Ⱦ�ܰ����ڵ� : �ٽɰ����ڵ� ���� �� �Ǵ� �Ŀ� ����� �ΰ����� ���
// => �α�, ����(���� ó��), Ʈ������ ó��, ����ó�� ���� ��� 
public class StudentAdvice {
	private final static Logger logger=LoggerFactory.getLogger(StudentAdvice.class);
	
	//Ÿ�ٸ޼ҵ�(�ٽɰ��ɸ��) ���� �� ���ԵǾ� ����� ����� �ۼ��ϱ� ���� �޼ҵ�(Ⱦ�ܰ��ɸ��)
	// => JoinPoint : Before Advice
	//JoinPoint : �ٽɰ��ɸ���� �������� Ⱦ�ܰ��ɸ���� ���Ե� ��ġ ǥ��
	public void beforeLog() {
		logger.info("[before]�ٽɰ����ڵ� ���� �� ���ԵǾ� ����� Ⱦ�ܰ����ڵ�");
	}
}
