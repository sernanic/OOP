package helloWorld;

public class Fib {
	// constructorpublic
	int firstElement, secondElement,
	followingNumber,nthRecursiveIteration;
	public Fib(int f0, int f1){
		firstElement = f0;
		secondElement  = f1;
		followingNumber = 0;
		nthRecursiveIteration = 0;
	}
	public static int f(int n) {
		Fib fibIterativeSequence = new Fib(0,1);

		for (int i = 0; i < n-1; i++) {
			fibIterativeSequence.followingNumber = fibIterativeSequence.firstElement + fibIterativeSequence.secondElement;
			fibIterativeSequence.firstElement = fibIterativeSequence.secondElement;
			fibIterativeSequence.secondElement = fibIterativeSequence.followingNumber;
			}
		System.out.println(fibIterativeSequence.secondElement);
		return fibIterativeSequence.secondElement;
	}
	public static int fRec(int n) {
		if (n <= 1) 
		       return n; 
		return fRec(n-1) + fRec(n-2);
	}
		
	public static void main(String[] args) {
		System.out.println(fRec(3));
	}
}
