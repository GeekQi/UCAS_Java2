package a94file;

import java.io.File;
import java.io.FilenameFilter;
/*
����1 ��  ָ��һ���ļ��У�Ȼ����ļ�����������java�ļ���

����2�� ָ��һ���ļ��У�Ȼ���г��ļ���������������ļ����ļ��У����Ǹ�ʽҪ����:
 
�ļ���
	�ļ���1
	�ļ���2
	�ļ���3
	..

�ļ��У�
	�ļ�����1
	�ļ�����2
	�ļ�����3
	....

	listFiles(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
list(fileNameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��

*/

// �Զ���һ���ļ���������
class MyFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
//		System.out.println("�ļ�Ŀ¼:"+dir+" �ļ�����"+ name);
		return name.endsWith(".txt");
	}
	
}



public class FileGuoLv {
	
	public static void main(String[] args) {
		File dir = new File("/Users/GeekQi/Desktop/1");
		listJava2(dir);
//		listJava(dir);
//		listFile(dir);
	}
	
	public static void listJava2(File dir){
		File[] files = dir.listFiles(new MyFilter()); //�õ��ļ���������������ļ����ļ��С�
		for(File file : files){
			System.out.println(file.getName());
		}
	}
	
	
	
	
	//�г����е�java�ļ�
	public static void listJava(File dir){
		File[] files = dir.listFiles(); //��ȡ�������е����ļ�
		for(File file : files){
			String fileName = file.getName();
//			if(fileName.endsWith(".txt")&&file.isFile()){
//				System.out.println(fileName);
//			}
//			
			if(fileName.matches(".+\\.txt")&&file.isFile()){
				System.out.println(fileName);
			}
			
		}
	}
	
	
	
	public static void listFile(File dir){
		File[] files = dir.listFiles();//��ȡ�����е����ļ�
		System.out.println("�ļ���");
		for(File fileItem : files){
			if(fileItem.isFile()){
				System.out.println("\t"+fileItem.getName());
			}
		}
		
		
		System.out.println("�ļ��٣�");
		for(File fileItem : files){
			if(fileItem.isDirectory()){
				System.out.println("\t"+fileItem.getName());
			}
		}
		
		
	}
	
	
	
	
	
	
	
}
