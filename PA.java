import java.util.*;
import java.math.*;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int number = input.nextInt();
			int prime = 2;
			int blank = 1;
			if (number>0) {
				while(number>0){
					if(isPrime(prime)){
						if(isSame(prime)){
							if(number==1){
								System.out.println(prime);
								number--;
								break;
							}
							if(blank%10!=0){
								System.out.print(prime + " ");
								number--;
								blank++;
							}
							else{
								System.out.println(prime);
								number--;
								blank++;
							}
						}
					}
					prime++;
				}	
			}
			else{
				System.out.println();
			}
		}
	}

	public static boolean isPrime(int number){
		if(number==2){
			return true;
		}
		for(int i =2; i <= Math.sqrt(number);i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}

	public static boolean isSame(int number){
		String stringValue = Integer.toString(number);
		String reverse = new String();
		for(int i =(stringValue.length()-1);i>=0;i--){
			reverse += (stringValue.charAt(i));
		}
		if(stringValue.equals(reverse)){
			return true;
		}
		else{
			return false;
		}
	}
}