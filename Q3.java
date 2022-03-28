//Q 3 write a program to ask two number from user and print their sum.(using scanner class)
import java.util.Scanner;
public class Q3 {
public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two integers");
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println("Therir sum = "+(a+b));
	
}
}
