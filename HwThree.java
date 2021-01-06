import java.util.*;
import java.math.*;


public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		StringTokenizer result = new StringTokenizer(str,"\\+|-|\\*|/|(|)|%",true);
		String[] array = new String[100];
		String[] number_array = new String[100];
		String[] operator_array = new String[100];
		int number_index = 0;
		int operator_index = 0;
		int index = 0;
		float answer = 0;
		while(result.hasMoreElements()){
			array[index] = result.nextToken();
			index++;
		}
		for(int i = 0;i<index;i++){
			if(array[i].equals("+")||array[i].equals("-")||array[i].equals("*")||array[i].equals("/")
				||array[i].equals("(")||array[i].equals(")")||array[i].equals("%")){
				operator_array[operator_index] = array[i];
				operator_index++;
			}
			else{
				float tmp = Float.parseFloat(array[i]);
				answer += tmp;
				number_array[number_index] = array[i];
				number_index++;
			}
		}
		for(int i =0;i<number_index;i++){
			if(i==number_index-1){
				System.out.println(number_array[i]);
			}
			else{
				System.out.print(number_array[i] + " ");
			}
		}
		for(int i =0;i<operator_index;i++){
			if(i==operator_index-1){
				System.out.println(operator_array[i]);
			}
			else{
				System.out.print(operator_array[i] + " ");
			}
		}
		System.out.printf("%.3f",answer);
		System.out.println();
	}
}