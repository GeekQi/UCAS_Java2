package a4thread;

/*
 �̳߳��õķ�����
 	 Thread(String name)     ��ʼ���̵߳�����
	 setName(String name)    �����̶߳�����
	 getName()             �����̵߳�����
	 
	 
	 sleep()                 �߳�˯��ָ���ĺ������� ��̬�ķ���������Ҫ������ã��� �Ǹ��߳�ִ����sleep����������ô�����Ǹ��߳�˯�ߡ�ע�������main�У����д��붼�������߳�ִ�е�
	 //ֱ��Thread.sleep()���ǿ��Ե�
	  * 
	 currentThread()      ���ص�ǰ���̶߳��󣬸÷�����һ����̬�ķ����� ע�⣺ �Ǹ��߳�ִ����currentThread()����ͷ����Ǹ��߳� �Ķ���
	 
	 getPriority()             ���ص�ǰ�̶߳�������ȼ�   Ĭ���̵߳����ȼ���5
	 setPriority(int newPriority) �����̵߳����ȼ�    ��Ȼ�������̵߳����ȼ������Ǿ����ʵ��ȡ���ڵײ�Ĳ���ϵͳ��ʵ�֣��������ȼ���10 ����С��1 �� Ĭ����5����
	 
 */
public class ThreadMethod extends Thread {

	public ThreadMethod() {

	}

	public ThreadMethod(String name) {
		super(name); // ������Thread���һ�� �����Ĺ��췽����
	}

	@Override
	public void run() {

		System.out.println("this:" + this);
		System.out.println("��ǰ�̶߳���" + Thread.currentThread());
		// this �͵�ǰ������ͬһ�����Ǹö�Ӧ���������߶���

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			// try {
			//// Thread.sleep(10);// Ϊʲô�����ﲻ���׳��쳣��ֻ�ܲ��񣿣�
			// // Thread���run����û���׳��쳣���ͣ��������಻���׳��쳣���͡�
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }

		}

	}

	public static void main(String[] args) throws InterruptedException {
		// ������һ���̶߳���
		ThreadMethod d1 = new ThreadMethod();
		System.out.println("�̵߳�����" + d1.getName());

		ThreadMethod d = new ThreadMethod("����");
		System.out.println("�̵߳�����" + d1.getName());

		d.setName("����"); // setName�����̵߳�����

		d.setPriority(10); // �����߳� �����ȼ��� ���ȼ�������Խ�����ȼ�Խ�� ��
							// ���ȼ��ķ�Χ��1~10//��Ҳû˵һ��Ҫ��ִ���ꡣ
		d.start(); // �����߳�

		System.out.println("�Զ����̵߳����ȼ���" + d.getPriority()); // �̵߳����ȼ�Ĭ����5
		System.out.println("���̵߳����ȼ���" + Thread.currentThread().getPriority());

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		} // ע����������̡߳���Ϊ��main��

		/*
		 * Thread mainThread = Thread.currentThread();
		 * System.out.println("���̵߳����֣�"+ mainThread.getName());
		 */
	}

}