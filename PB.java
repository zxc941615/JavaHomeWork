import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String str = input.next();
			int odd = 0;
			int even = 0;
			if(str.equals("0")){
				break;
			}
			else{
				for(int i = (str.length()-1);i>=0;i--){
					if(i%2==0){
						even += str.charAt(i) - 48;
					}
					else{
						odd += str.charAt(i) - 48;
					}
				}
				if(even>odd){
					if((even-odd)%11==0){
						System.out.println(odd+" "+even);
						System.out.println(str +" is a multiple of 11.");
					}
					else{
						System.out.println(str +" is not a multiple of 11.");
					}
				}
				if(odd>even){
					if((odd-even)%11==0){
						System.out.println(odd+" "+even);
						System.out.println(str +" is a multiple of 11.");
					}
					else{
						System.out.println(str +" is not a multiple of 11.");
					}
				}
				if(odd==even){
					if((odd-even)%11==0){
						System.out.println(odd+" "+even);
						System.out.println(str +" is a multiple of 11.");
					}
					else{
						System.out.println(str +" is not a multiple of 11.");
					}
				}

			}
		}
	}
}