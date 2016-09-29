package a2otherclass;

import java.io.IOException;

import javax.management.RuntimeErrorException;

/*
 RunTime   该类类主要代表了应用程序运行的环境。
 	
 	getRuntime()  返回当前应用程序的运行环境对象。//一个这个类的对象就代表一个运行环境：单例设计 注：一个应用程序只有一个运行环境
 	exec(String command)  根据指定的路径执行对应的可执行文件。
 	freeMemory()   返回 Java 虚拟机中的空闲内存量。。 以字节为单位
 	maxMemory()    返回 Java 虚拟机试图使用的最大内存量。
 	totalMemory()    返回 Java 虚拟机中的内存总量
 	
 	
 
 */
public class RunTimeClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();
//		Process process = runtime.exec("C:\\Windows\\notepad.exe");
//		Thread.sleep(3000); //让当前程序停止3秒。这样在下一步关闭前，还能看到暂留的运行程序界面。
//		process.destroy();
		System.out.println(" 当前应用程序的运行环境对象"+runtime);
		System.out.println(" Java虚拟机中的空闲内存量。"+runtime.freeMemory());//注：126000000大概126M
		System.out.println("Java 虚拟机试图使用的最大内存量:"+ runtime.maxMemory());
		System.out.println("返回 Java 虚拟机中的内存总量:"+ runtime.totalMemory());
	}
}
