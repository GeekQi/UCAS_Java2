package a4thread;
/*
 需求： 模拟QQ视频与聊天同时在执行。这也可以称为多线程
 */

class TalkThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("hi，你好！开视频呗...");
		}
	}
}

class VideoThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("视频视频....");
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
