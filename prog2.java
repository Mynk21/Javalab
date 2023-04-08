import java.util.*;
class Student{
	String usn , name , branch , ph ; 
	Student(){
		usn = name = branch =ph= "no value";
	} 
	void read_data(String u, String n, String b, String p)
	{
		usn = u;
		name = n;
		branch = b;
		ph =p;
	}
	void display(){
		System.out.println(usn + "\t" + name + "\t" + branch + "\t" + ph+"\n");
	}
}
 class prog2{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		String u , n , b , ph ; 
		int no ;
		System.out.println("Enter number of student");
		no=sc.nextInt();
		Student[] s = new Student[no];		
		for(int i = 0 ; i< no; i++){
			s[i] = new Student();
			System.out.println("Enter " + (i + 1) + " Student record");
			s[i] = new Student();
			System.out.println("Enter student USN");
			u = sc.next();
			System.out.println("Enter student Name");
			n = sc.next();
			System.out.println("Enter student Branch");
			b = sc.next();
			System.out.println("Enter student Phone number");
			ph = sc.next();
			s[i].read_data(u, n, b, ph);
		}
		System.out.println("USN\tNAME\tBRANCH \t PHONE NO");
		for(int i=0; i<s.length;i++){
			s[i].display();
		}
	}
}
	
