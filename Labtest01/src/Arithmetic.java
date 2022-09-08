
public class Arithmetic {

	public static void main(String[] args) {
		char c='*';
		int a=2, b=4;
		switch(c)
		{
			case '+':System.out.println("The sum of number is " +(a+b));
			break;
			case '%':System.out.println("The Factorial of number is " +(a%b));
			break;
			case '-':System.out.println("The difference between the numbers is " +(a-b));
			break;
			case '*':System.out.println("The multplication of numbers is " +(a*b));
			break;
			case '/':System.out.println("The division of number is " +(a/b));
			break;
			default:System.out.println("invalid oprator");
		}
		
	}

}
