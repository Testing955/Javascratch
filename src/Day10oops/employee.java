package Day10oops;

public class employee 
/*{
int empid;
String empname;
int empsal;

void display()

{
System.out.println(empid);
System.out.println(empname);
System.out.println(empsal);
}
public static void main(String args[])
{
	employee e = new employee();
	e.empid=101;
	e.empname="Rabi";
	e.empsal=2000;
	e.display();
}*/
{
int esal;
String ename;
double eroll;
String edpt;
int eid;
void show()
{
System.out.println(esal);
System.out.println(eroll);
System.out.println(eid);
System.out.println(ename);
System.out.println(edpt);
}
public static void main(String args[])
{
employee emp = new employee();
emp.edpt="QA";
emp.eid=20419;
emp.ename="Ram bahudhar singh dinkar";
emp.eroll=2098.32;
emp.eroll=21;
emp.show();
}
}
