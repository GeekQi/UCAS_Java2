package a2otherclass;

import java.io.IOException;

import javax.management.RuntimeErrorException;

/*
 RunTime   ��������Ҫ������Ӧ�ó������еĻ�����
 	
 	getRuntime()  ���ص�ǰӦ�ó�������л�������//һ�������Ķ���ʹ���һ�����л������������ ע��һ��Ӧ�ó���ֻ��һ�����л���
 	exec(String command)  ����ָ����·��ִ�ж�Ӧ�Ŀ�ִ���ļ���
 	freeMemory()   ���� Java ������еĿ����ڴ������� ���ֽ�Ϊ��λ
 	maxMemory()    ���� Java �������ͼʹ�õ�����ڴ�����
 	totalMemory()    ���� Java ������е��ڴ�����
 	
 	
 
 */
public class RunTimeClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();
//		Process process = runtime.exec("C:\\Windows\\notepad.exe");
//		Thread.sleep(3000); //�õ�ǰ����ֹͣ3�롣��������һ���ر�ǰ�����ܿ������������г�����档
//		process.destroy();
		System.out.println(" ��ǰӦ�ó�������л�������"+runtime);
		System.out.println(" Java������еĿ����ڴ�����"+runtime.freeMemory());//ע��126000000���126M
		System.out.println("Java �������ͼʹ�õ�����ڴ���:"+ runtime.maxMemory());
		System.out.println("���� Java ������е��ڴ�����:"+ runtime.totalMemory());
	}
}
