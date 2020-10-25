import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		boolean flag = false;
		while(input.hasNext()){
			int length = input.nextInt();
			if(length==-1){
				break;
			}
			else{
				if(flag){
					System.out.println();
					flag = false;
				}
				char[][] square = new char[length][length];
				for (int i =0;i<square.length ;i++ ) {
					for(int j =0;j<square[i].length;j++){
						String str = input.next();
						char ch = str.charAt(0);
						square[i][j] = ch;
					}
				}
				if(checkSingle(square)&&checkLetter(square)&&checkRow(square)&&checkColumn(square)){
					System.out.println("The input array is a Latin square");
					flag = true;
				}
				else{
					System.out.println("The input array is not a Latin square");
					flag = true;
				}
			}
		}
	}
	public static boolean checkSingle(char[][] square){
		int[] counts = new int[26];
		int counter = 0;
		for(int i =0;i<25;i++){
			counts[i] = 0;
		}
		for (int i =0;i<square.length ;i++ ) {
			for(int j =0;j<square[i].length;j++){
				counts[square[i][j]-65]++;
			}
		}
		for(int i =0;i<26;i++){
			if(counts[i]>0){
				counter++;
			}
		}
		if(counter>square.length){
			return false;
		}
		return true;
	}
	public static boolean checkLetter(char[][] square){
		for (int i =0;i<square.length ;i++ ) {
			for(int j =0;j<square[i].length;j++){
				if(square[i][j] > 64 && square[i][j] < 91){
					return true;
				}
			}
		}
		return false;
	}
	public static boolean checkRow(char[][] square){
		for (int i =0;i<square.length ;i++ ) {
			int[] counts = new int[26];
			for(int j =0;j<square[i].length;j++){
				counts[square[i][j]-65]++;
				if(counts[square[i][j]-65]>1){
					return false;
				}
			}
		}
		return true;
	}
	public static boolean checkColumn(char[][] square){
		for (int i =0;i<square.length ;i++ ) {
			int[] counts = new int[26];
			for(int j =0;j<square[i].length;j++){
				counts[square[j][i]-65]++;
				if(counts[square[j][i]-65]>1){
					return false;
				}
			}
		}
		return true;
	}

}