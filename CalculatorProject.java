import java.util.Scanner;

public class CalculatorProject {
	public static void main(final String args[]) {
		System.out.println("My First Calculator Program");
		System.out.println("===========================");
		System.out.println("Enter Two  Number for Basic Airthmetic opertaion");
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a);
        System.out.println(b);	
		//hello //e
		aag
		pavan 2
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a);
		System.out.println(b);
		pow(a, 3);

	}

	public static void pow(final int a, final int b)
	{
		final int p = (int) Math.pow((double)a, (double)b);
		System.out.println("Result : "+p);
	}
}