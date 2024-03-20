package Icode;

public class loops {

	public static void main(String[] args) 
	{
//print 1 to n
/*int n = 10;
for(int i = 1; i<=n; i++)
{
System.out.println(i);
}*/
//print n stars
	int n = 6;
for(int i = 1; i<=n;i++)
{
for(int j = 1; j<=i;j++)
{
System.out.print("*");    //print * in pyramid structure
//System.out.print(j);     ////print 123 in pyramid structure
}
System.out.println();
}
//print the table 
//Print triangle
	{
	/*int a = 5;
	for(int i =0; i<=a; i++)
	{
	for(int j=0; j<=i;j++)
	{
	System.out.print("*");
	}
	System.out.println();
	}*/
	
//Print pyramid
/*	int a = 5;
	for(int i =0; i<=a; i++)
	{
	for(int j=0; j<a-i-1;j++)
	{
	System.out.print(" ");
	}
	for(int k = 0; k<=i;k++)
	{
	System.out.print("* ");
	}
	System.out.println();
}*/
//Print from a to z
int k = 9;
char currentChar ='a';
for(int i =0; i<k;i++)
{
for(int j=0;j<k-i-1;j++)
{
System.out.print(" ");
}
for(int p =0; p<=i;p++)
{
if (currentChar<='z')
{
System.out.print(currentChar+"  ");
}
else
{
currentChar='a';
System.out.print(currentChar+"  ");
}
currentChar++;
}
System.out.println();
}

	}

}
}
