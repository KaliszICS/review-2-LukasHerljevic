import java.util.Scanner;
public class PracticeProblem {

	
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		
		Scanner input = new Scanner(System.in); 

		System.out.print("In: ");
		String H= input.nextLine();

		System.out.println(H);


		
	}

	public static void q2() {
		
		Scanner input = new Scanner(System.in); 

		System.out.print("In: ");
		int F= input.nextInt();

		System.out.print("In: ");
		int A= input.nextInt();

		System.out.println(F/A);
		System.out.println(F%A);
	}

	public static void q3() {
		
	Scanner input = new Scanner(System.in);

		System.out.print("In: ");
		String W= input.next();

		System.out.println(W+ " was the text you wrote");
		
	}

	public static void q4() {
		
		Scanner input = new Scanner(System.in);

		System.out.print("In: ");
		int L= input.nextInt();

		System.out.println(L*5);

	}

	public static void q5() {
		Scanner input = new Scanner(System.in);

		System.out.print("In: ");
		Boolean Z= input.nextBoolean();

		System.out.println(Z+" is a boolean");
		
	}

	public static void q6() {
		Scanner input = new Scanner(System.in);

		System.out.print("In: ");
		Double Z= input.nextDouble();

		System.out.println(Z-3.2);
		
	}

}
