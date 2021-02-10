import java.util.Scanner;
public class LineComparison
{
	public static void main(String[] args)
	{
	System.out.println("Calculate Length Between Two Point");
	int x1,x2,y1,y2;
	double Length1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter x1=");
	x1=sc.nextInt();
	System.out.println("enter x2=");
	x2=sc.nextInt();
	System.out.println("enter y1=");
	y1=sc.nextInt();
	System.out.println("enter y2=");
	y2=sc.nextInt();
	Length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	System.out.println("Length Between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")="+Length);
	int p1,p2,q1,q2;
	double Length2;
	System.out.println("enter p1 =");
	p1=sc.nextInt();
	System.out.println("enter p2 =");
	p2=sc.nextInt();
	System.out.println("enter q1 =");
	q1=sc.nextInt();
	System.out.println("enter q2 =");
	q2=sc.nextInt();
	Length2=Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
	System.out.println("Length between"+"("+p1+","+q1+"),"+"("+p2+","+q2+")="+Length2);
	Double obj1=new Double(Length1);
	Double obj2=new Double(Length2);
	int comparevalue=obj1.compareTo(obj2);
	if(comparevalue==0)
	{
	System.out.println("Both lines are same");
	}
	else if(comparevalue>0)
	{
	System.out.println("Length1 is greater than Length2");
	}
	else
	{
	System.out.println("Length1 is less than Length2");
	}
	}
}
