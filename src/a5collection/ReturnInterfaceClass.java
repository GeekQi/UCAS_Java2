package a5collection;

interface Money {

	public void makeMoney();
}

class Worker implements Money {

	@Override
	public void makeMoney() {
		System.out.println("������׬Ǯ...");
	}
}

class Student implements Money {

	@Override
	public void makeMoney() {
		// TODO Auto-generated method stub

	}

}

public class ReturnInterfaceClass {

	public static void main(String[] args) {
		Money m = test();
		m.makeMoney();

	}

	public static Money test() {

		return new Worker();
	}

}
