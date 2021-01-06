import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String tmp = input.nextLine();
		for (int i =0;i<number ;i++ ) {
			String str = input.nextLine();
			String search = input.nextLine();
			String rep = input.nextLine();
			StringBuffer buffer = new StringBuffer(str);
			int begin = 0;
			int end = search.length();
			int times = buffer.length()-end;
			boolean flag = true;
			while(flag){
				begin = 0;
				end = search.length();
				times = buffer.length()-end;
				for (int j = 0;j<times+1 ;j++ ) {
					String sub = buffer.substring(begin,end);
					if(sub.equals(search)){
						buffer.replace(begin,end,rep);
						break;
					}
					begin++;
					end++;
					if(j==times-1){

						flag = false;
					}
				}
			}
			buffer.reverse();
			String answer = buffer.substring(0,buffer.length());
			System.out.println(answer);
		}
	}
}