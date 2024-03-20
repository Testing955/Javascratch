package Revision;

import java.util.Arrays;

public class Arrayquestion {

	public static void main(String[] args)
	{
/*int a []=new int[6];
a[0]=10;
a[1]=20;
a[2]=30;
a[3]=40;
a[4]=50;
a[5]=60;
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
System.out.println(a[3]);
System.out.println(a[4]);
System.out.println(a[5]);
System.out.println(a.length);*/

/*int b[] = {10,20,45,45,32,13};
for(int i = 0;i<b.length;i++)
{
if(b[i]%2==0)
{
System.out.println("Print evene numbers are: "+b[i]);
System.out.println();
}
}
System.out.println(Arrays.toString(b));
for(int i =0; i<b.length;i++)
{
if(b[i]%2!=0)
{
System.out.println(b[i]);
}
}

int sum = 2;
for(int j = 0; j<b.length;j++)

{
	
//	sum++;
System.out.println(b[j]+sum);
}*/
		
//Print the array
//print the length of an array
//print the total character of the array
//trim the first character from the array (optional)
//print the first number   (optional)
//print the last number   (optional)
//print the even number
//print the sum of total number
//print the sum of each number
//substract the total number
		
int a []= {10,5,4};
System.out.println(Arrays.toString(a));
System.out.println(a.length);
System.out.println(Arrays.toString(a).length());
for(int i = 0; i<a.length;i++)
{
if(a[i]%2==0)
{
System.out.print("The even numbers are: "+a[i]+" ");
System.out.println();
}
}
System.out.println();
for(int i = 0; i<a.length;i++)
{
if(a[i]%2!=0)
{
System.out.println("The odd number are: "+a[i]);
}
}
int sum =89;
int add=5;
for(int i =0; i<a.length;i++)
{
sum+=a[i];
System.out.println("The total sum of the number: "+ sum);
}


for(int i =0; i<a.length;i++)
	add+=a[i];
{
System.out.println();
System.out.println("The total sum of the number: "+ add);
}
int sub = 5;
for(int i = 0; i<a.length;i++)
sub-=a[i];
{
System.out.println();
System.out.println("The numbers which are left after the substraction is: "+ sub);
}
}

}

