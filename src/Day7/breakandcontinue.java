package Day7;

public class breakandcontinue {

	public static void main(String[] args) 
	{
/*int i =1;
for(int n =1; n<=10;n++)
{
System.out.println(n);
if(n==5)
{
break;
}
}
System.out.println("End of the statement");*/
System.out.println("Start of the continue loop");
		int i =1;
		for(int n =1; n<=10;n++)
		{
		System.out.println(n);
		if(n==5)
		{
		continue;
		}
		}
		System.out.println("End of the statement");
	}

}

//While--> intialization-->condition--->Body--->Updation/increment/decrement
//Do While--> intialization-->Body--->Updation/increment/decrement--->condition
//break statement is used in every where accept in the if condition
