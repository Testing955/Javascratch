package Icode;

public class vowels {

	public static void main(String[] args) 
	{
String vow = "YOU ARE IDIOT";
int kl = 0;
for(int i = 0; i<vow.length();i++)
	
{
	char pt=vow.charAt(i);
if(pt=='a'||pt=='e'||pt=='i'||pt=='o'||pt=='u'||pt == 'A' || pt == 'E' || pt == 'I' || pt == 'O' || pt == 'U')
	System.out.print(Character.toLowerCase(pt) + " ");
{
kl++;

}
}
System.out.println();
System.out.println("Total number of the character is: "+kl);


}
}
