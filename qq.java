import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int number = input.nextInt();
			boolean flag = true;
			System.out.print("2");
			for(int i = 3; i <= number;i++){
				for(int j = 2;j<i;j++){
					if(i%j==0){
						flag = false;
						break;
					}
				}
				if(flag){
					System.out.printf(" %d",i);
				}
				flag = true;
			}
			System.out.println("");
		}
	}
}