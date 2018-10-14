# PALINDROME
package oxygen.com;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
int temp,digit,rev=0;
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
int n=s.nextInt();
temp=n;
while(n>0)
{
	digit=n%10;
	n=n/10;
	rev=rev*10+digit;
}
System.out.println(rev);
if(temp==rev)
{
	System.out.println("number is palindrome");
}
else
{
	System.out.println("number is not palindrome");
}
	}
}
OUTPUT:
enter a number:
121
121
number is palindrome
