import java.util.*; 
class Square implements Runnable{
	int x ; 
	Square(int n ){
		x = n ;
	}
	public void run(){
	int sqr = x* x ;
	System.out.println("Square of "+sqr);
	}
}
class Number extends Thread{
	public void run(){
		Random r = new Random();
		for(int i = 0 ; i< 5 ; i++){
			int rand = r.nextInt(1000);
			Thread t1=new Thread(new Square(rand));
			t1.start();
		}
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ex){
		}
		
	}
}

public class prog8{
	public static void main(String agrs[]){
		Number n = new Number();
		n.start();
	}
}
