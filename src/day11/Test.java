package day11;

public class Test extends Thread{
	public static void main(String[] args) {
		//创建一个线程
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("拿弹弓打你家玻璃");
			}
		});
		//设置线程优先级最高
		t1.setPriority(MAX_PRIORITY);
		for (int i = 0; i < 10; i++) {
			t1.run();
		}
	}
}
