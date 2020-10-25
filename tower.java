import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int star = 1;
		for(int i = 1;i<=number;i++){
			int blank = number - i;
			for(int j = 0;j<blank;j++){
				System.out.print(" ");
			}
			for(int j = 0;j<star;j++){
				System.out.print("*");
			}
			star += 2;
			System.out.println("");
		}
	}
}