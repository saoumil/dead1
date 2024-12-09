package Practicee;

public class Practice {
	
		public void subtraction (int a, int b)
		{
			int sub = a-b;
			System.out.println("Subtraction is " +sub);
		}
		public void addition (int a, int b)
		{
			int sum = a+b;
			System.out.println("Addition is "  +sum);
		}
		public void multiplication (int a, int b)
		{
			int mu1 = a*b;
			System.out.println("Multiplication is " +mu1);
		}
		public void division (int a, int b)
		{
			int div = a/b;
			System.out.println("Division is " +div);
		}
		public static void main(String[] args)
		{
			int a=60, b=40;
			Practice prac = new Practice();
			prac.addition(a,b);
			prac.subtraction(a,b);
			prac.multiplication(a,b);
			prac.division(a,b);
					
		}

}
