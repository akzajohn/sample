

import java.util.Scanner;
public class fib{
	public static void main(String[] args)
 {
				Scanner s=new Scanner(System.in);
		System.out.println("Enter the Limit:\n");
		int n=s.nextInt();
		int x=0,y=1,z=1;
			System.out.println(x);
			System.out.println(y);
z=x+y;
while(z<n)
			{
System.out.println(z);
				x=y;
				y=z;
				z=x+y;
			}
}
}
