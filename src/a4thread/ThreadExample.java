package a4thread;
/*
 ���� ģ��QQ��Ƶ������ͬʱ��ִ�С���Ҳ���Գ�Ϊ���߳�
 */

class TalkThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("hi����ã�����Ƶ��...");
		}
	}
}

class VideoThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("��Ƶ��Ƶ....");
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		TalkThread talkThread = new TalkThread();
		talkThread.start();
		VideoThread videoThread = new VideoThread();
		videoThread.start();

	}
}
