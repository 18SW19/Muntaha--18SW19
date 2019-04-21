import java.util.Scanner;
class Bill
{
	public static void main(String []args)
	{
	Scanner input = new Scanner (System.in);
	
	System.out.println("Electricity Bill");
	System.out.println("Enter the number of units");
	int no = input.nextInt();
	if (no==50)
	{
		System.out.println(no+10);
	}
if (no>50 && no<=100)
{
	System.out.println(no+15);
	}
	if (no>100 && no<=200)
	{
		System.out.println(no+20);
	}
	if (no>200 && no<=300)
	{
		System.out.println(no+25);
	}
	if (no>300)
	{
		System.out.println(no+30);
	}
}
}