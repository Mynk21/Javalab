import java.util.Scanner;
interface Resume
{
	public void biodata();
}
class Teacher implements Resume
	{
	String name,gen,dept,qual,achiv,mail,address,mob;
	int exp,fac_id;
	public void biodata()
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Name:");
		name=s1.next();
		System.out.print("Gender:");
		gen=s1.next();
		System.out.print("Employee ID:");
		fac_id=s1.nextInt();
		System.out.print("Department:");
		dept=s1.next();
		System.out.print("Qualification:");
		qual=s1.next();
		System.out.print("Achievement:");
		achiv=s1.next();
		System.out.print("Experience:");

		exp=s1.nextInt();
		System.out.print("Mail Id:");
		mail=s1.next();
		System.out.print("Address:");
		address=s1.next();
		System.out.print("Mobile:");
		mob=s1.next();
		System.out.println("");
		System.out.println("************************");
		System.out.println(" Biodata-Teacher ");
		System.out.println("************************");
		System.out.println("----------------------------------------*");
		System.out.println("|Name :| "+name);
		System.out.println("|Employee ID :| "+fac_id);
		System.out.println("|Department :| "+dept);
		System.out.println("|Qualification :| "+qual);
		System.out.println("|Experience :| "+exp);
		System.out.println("|Achievement :| "+achiv);
		System.out.println("|Experience :| "+achiv);
		System.out.println("|Address :| "+address);
		System.out.println("|Mobile :| "+mob);
		System.out.println("----------------------------------------*");
		}
}
class Student implements Resume
	{
	String name,address,section,res,disc,mob;
	int rollno;
	public void biodata()
{
		Scanner s1=new Scanner(System.in);
		System.out.print("Name:");
		name=s1.next();

		System.out.print("Rollno:");
		rollno=s1.nextInt();
		System.out.print("Section:");
		section=s1.next();
		System.out.print("Result:");
		res=s1.next();
		System.out.print("Discipline:");
		disc=s1.next();
		System.out.print("Address:");
		address=s1.next();
		System.out.print("Mobileno:");
		mob=s1.next();
		System.out.println("");
		System.out.println("************************");
		System.out.println(" Biodata-Student ");
		System.out.println("************************");
		System.out.println("----------------------------------------*");
		System.out.println("|Name :| "+name);
		System.out.println("|Rollno :| "+rollno);
		System.out.println("|Section :| "+section);
		System.out.println("|Section :| "+section);
		System.out.println("|Result :| "+res);
		System.out.println("|Discipline :| "+disc);
		System.out.println("|Address :| "+address);
		System.out.println("|Mobile :| "+mob);
		System.out.println("----------------------------------------*");
	}
}
class Demo7
{
	public static void main(String args[])
	{
		Student stud=new Student();

		Teacher teach=new Teacher();
		Scanner s2=new Scanner(System.in);
		System.out.println("Resume");
		System.out.println("*******");
		System.out.println("1.Student");
		System.out.println("2.Teacher");
		System.out.println("Enter your option");
		int choice=s2.nextInt();
		switch(choice)
		{
		case 1:
		stud.biodata();
		break;
		case 2:
		teach.biodata();
		break;
		default:
		System.out.println("Wrong Option");
		}
}
}
