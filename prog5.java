public class Sum{
//addition method of parameter a and b
void addition(int a,int b){
int sum=a+b;
System.out.println("Sum of two numbers is "+sum);
}
//addition method of parameter a, b and c
void addition(int a,int b,int c){
int sum=a+b+c;
System.out.println("Sum of three numbers is "+sum);
}
public static void main(String args[]){
Sum s=new Sum();
s.addition(2,5,10);
s.addition(15,10);
}
}
// Program Code: (Constructor Overloading)
// import java.util.Scanner;
// class Main {
// int s;
// Main() {
// System.out.print("Sum is:");
// }
// Main(int a, int b) {
// s = a + b;
// }
// void display() {
// System.out.print(s);
// }
// public static void main(String args[]) {
// int a, b;
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter two numbers:");
// a = sc.nextInt();
// b = sc.nextInt();
// Main t1 = new Main();
// Main t2 = new Main(a, b);
// t2.display();
// }
// }
