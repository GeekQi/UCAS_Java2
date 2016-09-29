package a4thread;

class SaleTicket1 implements Runnable{
	
	int  num = 50; // 票数
	
	@Override
	public void run() {
		while(true){
			synchronized ("锁") {
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"售出了第"+ num+"号票");
					num--;
				}else{
					System.out.println("售罄了..");
					break;
				}	
			}
		}		
	}
}


public class TicketRunnable {
	
	public static void main(String[] args) {
		//创建了一个Runnable实现类的对象
		SaleTicket1 SaleTicket1 = new SaleTicket1();//注：只创建了一个对象50。 没有三个。并给3个线程共享。所以没加static也行。加上的话声明周期变长
		//创建三个线程对象模拟三个窗口
		Thread thread1 = new Thread(SaleTicket1,"窗口1");
		Thread thread2 = new Thread(SaleTicket1,"窗口2");
		Thread thread3 = new Thread(SaleTicket1,"窗口3");
		//开启线程售票
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}

}
