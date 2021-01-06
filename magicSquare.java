 import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		while(input.hasNext()){
			int number = input.nextInt(); // input number
			int[][] arr = new int[number][number]; // array
			for(int i = 0;i<number;i++){ // initialize array
				for(int j = 0;j<number;j++){
					arr[i][j] = 0;
				}
			}
			if(number%2==0){ // even output not odd number
				System.out.println("It is not an odd number.");
				flag = true;
			}
			else{ // odd output square()
				if(flag){
					System.out.println("");
					flag = false;
				}
				int times = number*number; // total elements in array
				int x = number - 1; //initial position of x
				int y = (number-1)/2; // initial position of y
				arr[x][y] = 1; // initial number
				int tmp_x = x; // temporary position of x
				int tmp_y = y; // temporary position of y
				for(int i = 2;i <= times;i++){
					tmp_x += 1; // 
					tmp_y += 1; // x,y + 1 先取得如果加1後的位置
					if(tmp_x >= number){
						tmp_x = 0; // +1 後超出邊界，設為0
					}
					if(tmp_y >= number){
						tmp_y = 0; // 跟x相同
					}
					if(arr[tmp_x][tmp_y] > 0){
						tmp_x = x - 1; // 如果該位置已有放過數字，就放回自己原本位置的上一格
						tmp_y = y;
					}
					x = tmp_x; // 取得當前位置
					y = tmp_y; //
					arr[x][y] = i; // 將數字放入
				}
				int total = 0;
				for(int i = 0 ; i < number; i++){
					total += arr[i][0];
				}
				System.out.println(total);
				for(int i = 0;i < number;i++){ // 將答案output
					for (int j = 0;j<number ;j++ ) {
						System.out.printf("%5d",arr[i][j]);
					}
					System.out.println("");
				}
				System.out.println("");
			}
		}
	}
}

// 4 9 2
// 3 5 7
// 8 1 6













