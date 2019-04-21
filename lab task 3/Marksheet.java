import java.util.*;
class Marksheet 
{
	public static void main(String [] args)
	{
		
	Scanner mark= new Scanner(System.in);
	System.out.println("Enter your marks of C++");
	double  b = mark.nextInt();

	System.out.println("Enter your marks of Data base");
	double  c = mark.nextInt();
	System.out.println("Enter your marks of Operating System");
	double  o = mark.nextInt();
	 double tmarks=300;
	System.out.println("Total marks is "+tmarks );
	 double sum =b+c+o;
	 System.out.println("Your sum of  marks is "+sum);
	 
	
	 double  percentage =(sum*100)/300;
	System.out.println("Your percentage is" +percentage +"%");
	if(percentage <=100 && percentage >=90) 
	{

	System.out.println("Your grade is A");
}
if(percentage <=89 && percentage >=80) 
{
System.out.println("Your grade is B");}
 if(percentage >=79 && percentage >=70) 
{
System.out.println("Your grade is C");}
 if(percentage <=79 && percentage >=60) 
{

	System.out.println("Your grade is D");}

else 
	System.out.println("you are fail");
}
}

	




