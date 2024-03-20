package Icode;

public class diffcode {

	public static void main(String[] args)
	{
		
//Print the first character
/*String first = "I am Hindu";
int f=0;
String []words=first.split("\\s+");
for(String word:words)
{
if(!word.isEmpty())
{
System.out.print(word.charAt(0) + " ");
f++;
}
}
System.out.println();
System.out.println("The number of values: "+f);
		/*String pen = "This is blue||Red pen";
		String colours[]=pen.split("\\s+");
		for(String colour:colours)
		{
		if(!colour.isEmpty())
		{
		System.out.print(colour.charAt(0) + " ");
		}
		}*/
/*String str = "My name is Prince Gaurav";
String name[] = str.split("\\s+");
for(String names:name)
{
if(!names.isEmpty())
{
//System.out.print(Character.toLowerCase(names.charAt(0)) + " ");  //if i have to print all the character in lower character 
System.out.print(Character.toUpperCase(names.charAt(0))+" ");    //if i have to print all the character in lower character 
}
}*/

//Print the first number
/*int i = 2028790;
while(i>=10)
{
i/=10;
}
System.out.println(i);*/

/*		int h = 56789098;
		while(h>=10)
		{
		h/=10;
		}
		System.out.println(h);*/
//Print the vowel letter from the String
/*String k = "Aashna Gaurav";
for(int i = 0; i<k.length(); i++)
{
char ch=k.charAt(i);
if(ch=='a' || ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'|| ch=='U')
{
System.out.print(ch + " ");
}
}*/
/*String p = "PRINCE";
for(int i = 0; i<p.length();i++)
{
char o = p.charAt(i);
{
//if(o=='A'||o=='a'||o=='E'||o=='e'||o=='o'||o=='O'||o=='u'||o=='U'||o=='I'||o=='i')
if(o=='A'||o=='E'||o=='I'||o=='O'||o=='U')
{
System.out.print(Character.toLowerCase(o) + " ");//lower case
System.out.print(Character.toUpperCase(o) + " ");//upper case
}
}
}*/
//if i have to count the number of the vowels
/*String p ="MY";
int count=0;
for(int i =0; i<p.length();i++)
{
char r = p.charAt(i);
if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u')
{
	System.out.print(Character.toLowerCase(r)+" ");
count++;
}
	}
System.out.println("No of vowls counts: "+count);*/

//Printing the consonant value
/*	String h = "My name is Prince and i always wanted to become a wriiter but it couldn't happen due to my poor english and family conndition ";
	int y = 0;
	//String []cons=h.split("\\s+");
	String[] cons = h.replaceAll("\\s+", "").split("");
	for(String constan:cons)
	{
if (!"aeiouAEIOU".contains(constan))
{
System.out.print(constan.charAt(0)+" ");
y++;

}
	}
	System.out.println();
	System.out.println("Print the total number of the veriabls: "+y);*/
/*String fuck = "My life is fucking up meshup, i don't know what is going on my life i am just getting fuck from it";
int fl=0;
String fuckkkk[]=fuck.replaceAll("\\s+"," ").split("");
for(String fucking:fuckkkk)
{
if(!"aeiou".contains(fucking))
{
System.out.print(Character.toLowerCase(fucking.charAt(0)));
fl++;
}
}
System.out.println();
System.out.println("The total number of character is: "+fl);*/
//Print the first character,in lowercase,total no digit count
String b = "This time shall also pass";
int cd = 0;
/*String br[] = b.split("\\s+");
for(String bk:br) 
{
if(bk.isEmpty())

{
System.out.print(Character.toLowerCase(bk.charAt(0)));
}
}*/

/*String br[] = b.split("\\s+");
for(String bk:br) 
{
if(!bk.isEmpty())
{
System.out.print(Character.toLowerCase(bk.charAt(0)));
cd++;
}
}
System.out.println();
System.out.println("Total number of counts: "+cd);*/


//Print the stars in pyramid
/*int i = 9;
for(int p =1; p<=i;p++)
{
for(int j = 1; j<=p;j++)
{
System.out.print("*");
//System.out.print(j);
}
System.out.println();
}*/
//Print number from 1 to n
/*int n = 10;
for(int i = 1; i<=n; i++)
{
System.out.println(i);
}*/

}
}




