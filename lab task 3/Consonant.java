import java.util.*;

class Consonant
{
	public static void main(String [] args)
	{
Scanner m=new Scanner(System.in);
System.out.println("Enter a letter");
String v= m.nextLine();
switch(v)
{
	case "a":
	case "e":
	case "i":
	case "o":
	case "u":
	System.out.println(  v+" "+"is a vowel");
	break;

	
	default :
		System.out.println(  v+" "+"is a Consonant");
	}
}
}