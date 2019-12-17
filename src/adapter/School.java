package adapter;

public class School implements Runnable{

	public static void main(String[] args) {
		School s=new School();
		Thread t=new Thread(s);
		t.start();
		
	   for(int i=0;i<100000;i=i+2)
		   System.out.println(i);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		printOdd();
		
		
	}
	
	public void printOdd(){
		for(int i=1;i<1000;i=i+2){
			System.out.println(i);
			try {
				Thread.sleep(233);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
