package test1;

public class TestThread  implements Runnable{

	String a;
	Thread t1;
	TestThread(String a){
		this.a=a;
	}
	public void run(){
		try{
		t1.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("Error:"+e);
		}
	}
}
class Woo{
	public static void main(String[] args){
		TestThread a=new TestThread("hhh");
		TestThread b=new TestThread("hhh");
	}
}