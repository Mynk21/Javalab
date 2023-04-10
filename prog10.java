import java.util.*;
class prog10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a, b, c ; 
		a = sc.nextInt();
		b = sc.nextInt();
		try{
		if(b==0){
			throw new ArithmeticException("DivideBy0");
			}
		c= a/b ;
		System.out.println("Value "+c);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
}
