package a4thread;

class SaleTicket1 implements Runnable{
	
	int  num = 50; // Ʊ��
	
	@Override
	public void run() {
		while(true){
			synchronized ("��") {
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"�۳��˵�"+ num+"��Ʊ");
					num--;
				}else{
					System.out.println("������..");
					break;
				}	
			}
		}		
	}
}


public class TicketRunnable {
	
	public static void main(String[] args) {
		//������һ��Runnableʵ����Ķ���
		SaleTicket1 SaleTicket1 = new SaleTicket1();//ע��ֻ������һ������50�� û������������3���̹߳�������û��staticҲ�С����ϵĻ��������ڱ䳤
		//���������̶߳���ģ����������
		Thread thread1 = new Thread(SaleTicket1,"����1");
		Thread thread2 = new Thread(SaleTicket1,"����2");
		Thread thread3 = new Thread(SaleTicket1,"����3");
		//�����߳���Ʊ
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}

}
