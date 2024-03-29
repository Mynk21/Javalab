import java.util.Scanner;
class Staff {
private String staffId;
private String name;
private long phone;
private float salary;
public void accept() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Staff Id: ");
staffId = scanner.next();
System.out.print("Enter Name: ");
name = scanner.next();
System.out.print("Enter Phone: ");
phone = scanner.nextLong();
System.out.print("Enter Salary: ");
salary = scanner.nextFloat();
}
public void display() {
System.out.println("Staff Id: " + staffId);
System.out.println("Name: " + name);
System.out.println("Phone: " + phone);
System.out.println("Salary: " + salary);
}
}
class Teaching extends Staff {
private String domain;
private String[] publications;
public void accept() {
super.accept();
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Domain: ");
domain = scanner.next();
System.out.print("Enter Number of Publications: ");
int n = scanner.nextInt();
publications = new String[n];
System.out.print("Enter Publications: ");
for (int i = 0; i < n; i++) {
publications[i] = scanner.next();
}
}
public void display() {
super.display();
System.out.println("Domain: " + domain);
System.out.println("Publications:");
for (int i = 0; i < publications.length; i++) {
System.out.println(publications[i]);
}
}
}
class Technical extends Staff {
private String[] skills;
public void accept() {
super.accept();
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Number of Skills: ");
int n = scanner.nextInt();
skills = new String[n];
System.out.println("Enter Skills:");
for (int i = 0; i < n; i++) {
skills[i] = scanner.next();
}
}
public void display() {
super.display();
System.out.println("Skills:");
for (int i = 0; i < skills.length; i++) {
System.out.println(skills[i]);
}
}
}
class Contract extends Staff {
private int period;
public void accept() {
super.accept();
Scanner scanner = new Scanner(System.in);
System.out.print("Enter Period: ");
period = scanner.nextInt();
}
public void display() {
super.display();
System.out.println("Period: " + period);
}
}
class Main {
public static void main(String[] args) {
Teaching teaching = new Teaching();
Technical technical = new Technical();
Contract contract = new Contract();
System.out.println("Enter Details for Teaching Staff Member");
teaching.accept();
System.out.println("Enter Details for Technical Staff Member");
technical.accept();
System.out.println("Enter Details for Contract Staff Member");
contract.accept();
System.out.println("Details for Teaching Staff Member are");
teaching.display();
System.out.println("Details for Technical Staff Member are");
technical.display();
System.out.println("Details for Contract Staff Member are");
contract.display();
}
}
