import java.util.Scanner; // Import the Scanner class

public class Fib {
	// constructorpublic
    static int firstElement, secondElement;
    static int followingNumber,nthRecursiveIteration;
	public Fib(int f0, int f1){
		firstElement = f0;
		secondElement  = f1;
		followingNumber = 0;
		nthRecursiveIteration = 0;
	}
	public static int f(int n) {

		for (int i = 0; i < n-1; i++) {
			followingNumber = firstElement + secondElement;
			firstElement = secondElement;
			secondElement = followingNumber;
			}
		return secondElement;
	}
	public static int fRec(int n) {
		if (n <= 1) 
		       return n; 
		return fRec(n-1) + fRec(n-2);
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter arg 0");
		int arg0 = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter arg 1");
		int arg1 = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter arg 2");
		int arg2 = Integer.parseInt(scan.nextLine());
		Fib fibClass = new Fib(arg0,arg1);
		System.out.println(fRec(arg2));
		System.out.println(f(arg2));
	}
}