import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class PrimeFactorizer {
    static boolean isPrime(int number) {
        if(number == 2){
            return true;
        }
        if (number % 2 == 0)
            return false; // Return false if x is even
        int counter = 3;
        while (counter * counter <= number) {
            if ((number % counter) == 0)
                return false;
            counter += 2;
        }
        return true;
    }

    static void primeFactors(int target){
        int candidate = 2;
        while (target > 0 && candidate < target*target) {
            if ( isPrime(candidate) && (target % candidate) == 0 ) {
                System.out.println(candidate);
                target /= candidate;
            }
            else{
            candidate ++;
            }
        }
    }
    public static void main(String[] args){
        System.out.println(isPrime(6));
        primeFactors(18);
    }
}
