import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[9999];
		int index = 0;
		while(input.hasNext()){
			int number = input.nextInt();
			if(index==0){
				array[index] = number;
			}
			for(int i = index;i>=0;i--){
				if(number>array[i]){
					array[i+1] = array[i];
				}
				if(number<array[i]){
					array[i+1] = number;
					break;
				}
				if(i==0){
					array[i] = number;
				}
			}
			index++;
			if(index%2==0){
				System.out.println((array[index/2]+array[index/2-1])/2);
			}
			else{
				System.out.println(array[index/2]);
			}
		}
	}
}