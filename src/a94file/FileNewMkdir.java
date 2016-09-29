package a94file;

import java.io.File;
import java.io.IOException;

/*
������
	createNewFile()	��ָ��λ�ô���һ�����ļ����ɹ��ͷ���true������Ѵ��ھͲ�����Ȼ�󷵻�false
	mkdir()			��ָ��λ�ô���Ŀ¼����ֻ�ᴴ�����һ��Ŀ¼������ϼ�Ŀ¼�����ھ����쳣��
	mkdirs()		��ָ��λ�ô���Ŀ¼����ᴴ��·�������в����ڵ�Ŀ¼��
	renameTo(File dest)	�������ļ����ļ��У�Ҳ���Բ����ǿյ��ļ��У��ļ���ͬʱ�൱���ļ��ļ���,����ʱ���ܲ����ǿյ��ļ��С��ƶ�/�������ɹ��򷵻�true��ʧ���򷵻�false��

*/

public class FileNewMkdir {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/GeekQi/Desktop/1.txt");
		System.out.println("�����ɹ�����" + file.createNewFile()); // createNewFile
////		File file = new File("/Users/GeekQi/Desktop/wordfreq.txt");
////		file.createNewFile();
//		System.out.println("�ļ�������?" + file.exists());
//																// ����һ��ָ�����ļ���������ļ������ˣ��򲻻��ٴ����������û�д����򴴽��������ɹ�����true�����򷵻�false��
//
		File dir = new File("/Users/GeekQi/Desktop/1");
		System.out.println("�����ļ��гɹ���" + dir.mkdir()); // mkdir ����һ�������ļ��У�
		System.out.println("�ļ�������?" + dir.exists());
		dir = new File("/Users/GeekQi/Desktop/2/3");
		System.out.println("�����༶�ļ��У�" + dir.mkdirs());
		System.out.println("�ļ�������?" + dir.exists());
//
		// renameTo() ���Ŀ���ļ���Դ�ļ�����ͬһ��·���£���ôrenameTo����������������
//		// ���Ŀ���ļ���Դ�ļ�������ͬһ��·���£���ôrenameTo�����þ��Ǽ��У����һ����ܲ� ���ļ��С�
		File destFile = new File("/Users/GeekQi/Desktop/hello.txt");
		System.out.println("�������ɹ���" + file.renameTo(destFile));

	}

}
