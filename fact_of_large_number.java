//Find factorial of large numbers.
import java.math.BigInteger;

public class Factorial {

	public static BigInteger fact(int i) {
		if(i>0) {
			BigInteger smallOutput = BigInteger.valueOf(i).multiply(fact(i-1));
			return smallOutput;
		}
		return BigInteger.valueOf(1);
	}
	public static void main(String[] args) {
		System.out.println(fact(100));
	}
}

