import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String str = input.next();
			String str2 = input.next();
			BigInteger num = new BigInteger(str);
			BigInteger num2 = new BigInteger(str2);
			BigInteger gcd,lcm;
			BigInteger bi1,bi2,bi3,bi4,bi5;

			gcd = num.gcd(num2);
			lcm = (num.multiply(num2)).divide(gcd);
			String output = gcd + " " + lcm;
			System.out.println(output);
			bi1 = lcm.nextProbablePrime();
			bi2 = bi1.nextProbablePrime();
			bi3 = bi2.nextProbablePrime();
			bi4 = bi3.nextProbablePrime();
			bi5 = bi4.nextProbablePrime();
			System.out.println(bi1 + " " + bi2 + " " + bi3 + " " + bi4 + " " + bi5);		
		}
	}
}