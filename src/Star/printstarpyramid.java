package Star;

public class printstarpyramid 
{
	public static void main(String args[])
	{
/*int i = 15;
for(int j = 0; j<i;j++)
{
for(int k =0;k<i-j;k++)
{
System.out.print(" ");
}
for(int p = 0; p<2*j+1;p++)
{
System.out.print("*");
}
System.out.println();
}*/

/*int row = 10;
for(int i = 0; i<row;i++)
{
for(int j=0;j<row-i;j++)
{
System.out.print(" ");
}
for(int k = 0; k<2*i+1;k++)
{
System.out.print("*");
}
System.out.println();
}*/
		
int row =3;
for(int i = 0; i<row;i++)
{
for(int j = 0; j<row-i;j++)
{
System.out.print(" ");
}
for(int k =0; k<2*i+1;k++)
{
System.out.print("*");
}
System.out.println();
}
}
}