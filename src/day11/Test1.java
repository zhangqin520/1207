package day11;

public class Test1 {
	public static void main(String[] args) {
		//t1线程
		final Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("t1");
			}
		});
		final Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					t1.join();
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("t2");
			}
		});
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					t2.join();
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("t3");
			}
		});
		t2.start();
		t3.start();
		t1.start();
	}
}
