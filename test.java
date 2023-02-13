//****P6***********************************************************************************
//currency.java
package currencyconversion;
import java.util.*;
public class currency
	{
	double inr,usd;
	double euro,yen;
	Scanner in=new Scanner(System.in);
	public void dollartorupee()
	{
	System.out.println("Enter dollars to convert into Rupees:");
	usd=in.nextInt();
	inr=usd*67;
	System.out.println("Dollar ="+usd+"equal to INR="+inr);
	}
	public void rupeetodollar()
	{
		System.out.println("Enter Rupee to convert into Dollars:");
		inr=in.nextInt();
		usd=inr/67;
		System.out.println("Rupee ="+inr+"equal to Dollars="+usd);
}
	public void eurotorupee()
		{
		System.out.println("Enter euro to convert into Rupees:");
		euro=in.nextInt();
		inr=euro*79.50;
		System.out.println("Euro ="+euro +"equal to INR="+inr);
}
	public void rupeetoeuro()
		{
		System.out.println("Enter Rupees to convert into Euro:");
		inr=in.nextInt();
		euro=(inr/79.50);
		System.out.println("Rupee ="+inr +"equal to Euro="+euro);
}
	public void yentorupee()
		{
		System.out.println("Enter yen to convert into Rupees:");
		yen=in.nextInt();
		inr=yen*0.61;
		System.out.println("YEN="+yen +"equal to INR="+inr);
		}
	public void rupeetoyen()
		{
		System.out.println("Enter Rupees to convert into Yen:");
		inr=in.nextInt();
		yen=(inr/0.61);
		System.out.println("INR="+inr +"equal to YEN"+yen);
}
}
	//distance.java
	package distanceconversion;
	import java.util.*;
	public class distance
	{
		double km,m,miles;
		Scanner sc = new Scanner(System.in);

	public void kmtom()
		{
		System.out.print("Enter in km ");
		km=sc.nextDouble();
		m=(km*1000);
		System.out.println(km+"km" +"equal to"+m+"metres");
		}
	public void mtokm()
	{
	System.out.print("Enter in meter ");
	m=sc.nextDouble();
	km=(m/1000);
	System.out.println(m+"m" +"equal to"+km+"kilometres");
}
	public void milestokm()
{
		System.out.print("Enter in miles");
		miles=sc.nextDouble();
		km=(miles*1.60934);
		System.out.println(miles+"miles" +"equal to"+km+"kilometres");
}
	public void kmtomiles()
		{
		System.out.print("Enter in km");
		km=sc.nextDouble();
		miles=(km*0.621371);
		System.out.println(km+"km" +"equal to"+miles+"miles");
}
}


//converter.java
import currencyconversion.currency;
import distanceconversion.distance;
import timeconversion.timer;
import java.util.*;
import java.io.*;
class converter
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int choice,ch;
currency c=new currency();
distance d=new distance();
timer t=new timer();
do
{
System.out.println("1.dollar to rupee ");
System.out.println("2.rupee to dollar ");
System.out.println("3.Euro to rupee ");
System.out.println("4..rupee to Euro ");
System.out.println("5.Yen to rupee ");
System.out.println("6.Rupee to Yen ");
System.out.println("7.Meter to kilometer ");
System.out.println("8.kilometer to meter ");
System.out.println("9.Miles to kilometer ");

System.out.println("10.kilometer to miles");
System.out.println("11.Hours to Minutes");
System.out.println("12.Hours to Seconds");
System.out.println("13.Seconds to Hours");
System.out.println("14.Minutes to Hours");
System.out.println("Enter ur choice");
choice=s.nextInt();
switch(choice)
{
case 1:
{
c.dollartorupee();
break;
}
case 2:
{
c.rupeetodollar();
break;
}
case 3:
{
c.eurotorupee();
break;
}
case 4:
{
c.rupeetoeuro();
break;
}
case 5:
{c.yentorupee();
break;}
case 6 :

{
c.rupeetoyen();
break;
}
case 7 :
{
d.mtokm();
break;
}
case 8 :
{
d.kmtom();
break;
}
case 9 :
{
d.milestokm();
break;
}
case 10 :
{
d.kmtomiles();
break;
}
case 11 :
{
t.hourstominutes();
break;
}
case 12 :
{
t.hourstoseconds();
break;
}
case 13 :
{
t.secondstohours();
break;
}
case 14 :
{
t.minutestohours();
break;
}
}
System.out.println("Enter 0 to quit and 1 to continue ");
ch=s.nextInt();
}while(ch==1);
}
}
//***************************************PROGRAM7***********************************************************************************
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
//***************************************PROGRAM8***********************************************************************************
import java.util.*;
class Square implements Runnable{
	int x;
	Square(int n){
		x = n;
	}
	public void run(){
		int sqr = x * x;
		System.out.println("Square of " + x + " = " + sqr );
	}
}
class Cube implements Runnable{
	int x;
	Cube(int n){
		x = n;
	}
	public void run(){
		int cub = x * x * x;
		System.out.println("Cube of " + x + " = " + cub );
	}
}
class Number extends Thread{
	public void run(){
		Random random = new Random();
		for(int i =0; i<5; i++)	{
			int randomInteger = random.nextInt(100);
			System.out.println("Random Integer generated : " + randomInteger);
			Thread t1=new Thread(new Square(randomInteger));
			t1.start();
			Thread t2=new Thread(new Cube(randomInteger));
			t2.start();
			try {
			Thread.sleep(1000);
			} catch (InterruptedException ex) {
			System.out.println(ex);
			}
		}
	}
}
public class DemoThread {
	public static void main(String args[]){	
		Number n = new Number();
		n.start();
	}
}
//***************************************PROGRAM9***********************************************************************************
import java.util.*;
import java.io.*;
public class DemoArrayList
{
public static void main(String args[])throws IOException
{
ArrayList<String> obj = new ArrayList<String>();
DataInputStream in=new DataInputStream(System.in);
int c,ch;
int i,j;
String str,str1;
do
{
System.out.println("STRING MANIPULATION");
System.out.println("******************************");
System.out.println(" 1. Append at end \t 2.Insert at particular index \t 3.Search \t");
System.out.println( "4.List string that starting with letter \t");
System.out.println("5.Size \t 6.Remove \t 7.Sort\t 8.Display\t" );
System.out.println("Enter the choice ");
c=Integer.parseInt(in.readLine());
switch(c)
{
case 1:
{
System.out.println("Enter the string ");
str=in.readLine();
obj.add(str);
break;
}
case 2:
{
System.out.println("Enter the string ");
str=in.readLine();
System.out.println("Specify the index/position to insert");
i=Integer.parseInt(in.readLine());
obj.add(i-1,str);
System.out.println("The array list has following elements:"+obj);
break;
}
case 3:
{
System.out.println("Enter the string to search ");
str=in.readLine();
j=obj.indexOf(str);
if(j==-1)
System.out.println("Element not found");
else
System.out.println("Index of:"+str+"is"+j);
break;
}
case 4:
{
System.out.println("Enter the character to List string that starts with specified character");
str=in.readLine();
for(i=0;i<(obj.size()-1);i++)
{
str1=obj.get(i);
if(str1.startsWith(str))
{
System.out.println(str1);
} }
break;
}
case 5:
{
System.out.println("Size of the list "+obj.size());
break;
}
case 6:
{
System.out.println("Enter the element to remove");
str=in.readLine();
if(obj.remove(str))
{
System.out.println("Element Removed"+str);
}
else
{
System.out.println("Element not present");
}
break;
}
case 7:
{
Collections.sort(obj);
System.out.println("The array list has following elements:"+obj);
break;
}
case 8:
{
System.out.println("The array list has following elements:"+obj);

break;
}
}
System.out.println("enter 0 to break and 1 to continue");
ch=Integer.parseInt(in.readLine());
}while(ch==1);
} }

//***************************************PROGRAM10***********************************************************************************


import java.util.Scanner;
public class DemoException {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int a,b,c;
System.out.print("Enter the Two Interger Values\nA :");
a=scan.nextInt();
System.out.print("B :");
b=scan.nextInt();
scan.close();
try {
if(b==0)
throw new ArithmeticException("Divide By Zero");
c=a/b;
System.out.println("\nThe Value of "+a+" / "+b+" is "+c);
}catch(ArithmeticException e)
{
e.printStackTrace();
}
}
}
//***************************************PROGRAM11***********************************************************************************
import java.io.*;
import javax.swing.*;
class FileDemo
{
	public static void main(String args[])
	{
		String filename = JOptionPane.showInputDialog("Enter filename: ");
		File f = new File(filename);
		System.out.println("File exists: "+f.exists());
		System.out.println("File is readable: "+f.canRead());
		System.out.println("File is writable: "+f.canWrite());
		System.out.println("Is a directory: "+f.isDirectory());
		System.out.println("length of the file: "+f.length()+" bytes");
		try
		{
			char ch;
			StringBuffer buff = new StringBuffer("");
			FileInputStream fis = new FileInputStream(filename);
		while(fis.available()!=0)
		{
			ch = (char)fis.read();
			buff.append(ch);
			}
			System.out.println("\nContents of the file are: ");
			System.out.println(buff);
			fis.close();
		}
		catch(FileNotFoundException e)
			{
			System.out.println("Cannot find the specified file...");
			}
		catch(IOException i)
			{
			System.out.println("Cannot read file...");
		}
}
}
//***************************************PROGRAM12***********************************************************************************
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Cal extends Applet implements ActionListener
{
	String msg=" "; int v1,v2,result;
	TextField t1;
	Button b[]=new Button[10];
	Button add,sub,mul,div,clear,mod,EQ;
char OP;
public void init()
{
	Color k=new Color(120,89,90);
	setBackground(k);
	t1=new TextField(10);
	GridLayout gl=new GridLayout(4,5);
	setLayout(gl);
for(int i=0;i<10;i++)
{
	b[i]=new Button(""+i);
	}
	add=new Button("+");
	sub=new Button("-");
	mul=new Button("*");
	div=new Button("/");
	mod=new Button("%");
	clear=new Button("clear");
	EQ=new Button("=");
	t1.addActionListener(this);
add(t1);
for(int i=0;i<10;i++)
{
	add(b[i]);
	}
	add(add);
	add(sub);
	add(mul);
	add(div);
	add(mod);

	add(clear);
	add(EQ);
for(int i=0;i<10;i++)
{
	b[i].addActionListener(this);
	}
	add.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	mod.addActionListener(this);
	clear.addActionListener(this);
	EQ.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
	String str=ae.getActionCommand(); char ch=str.charAt(0);
	if ( Character.isDigit(ch)) t1.setText(t1.getText()+str);
	else
	if(str.equals("+"))
	{
	v1=Integer.parseInt(t1.getText());
	OP='+';
	t1.setText("");
	}
else if(str.equals("-"))
{
	v1=Integer.parseInt(t1.getText()); OP='-';
	t1.setText("");
	} else if(str.equals("*"))
	{
	v1=Integer.parseInt(t1.getText());
	OP='*';

	t1.setText("");
	}
else if(str.equals("/"))
{
	v1=Integer.parseInt(t1.getText());
	OP='/';
	t1.setText("");
	}
else if(str.equals("%"))
{
	v1=Integer.parseInt(t1.getText());
	OP='%';
	t1.setText("");
	}
if(str.equals("="))
{
	v2=Integer.parseInt(t1.getText());
if(OP=='+')result=v1+v2;
else if(OP=='-')
result=v1-v2;
else if(OP=='*')
result=v1*v2;
else if(OP=='/')
result=v1/v2;
else if(OP=='%')
result=v1%v2;
t1.setText(""+result);
}
if(str.equals("clear"))
{
t1.setText("");
}

}
}

