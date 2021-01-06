import java.util.*;
import java.math.*;
import java.text.*;
public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String str = input.nextLine();
			Calculate(str);
		}
	}
	public static void Calculate(String exp){
		StringTokenizer result = new StringTokenizer(exp,"\\+|-|\\*|/|%",true);
		String[] array = new String[result.countToken()];
		int index = 0;
		while(result.hasMoreElements()){
			array[index] = result.nextToken();
			index++;
		}
		// System.out.println(index);
		String operator1;
		String operator2;
		if (index==3) {
			BigDecimal val1 = new BigDecimal(array[0].trim());
			BigDecimal val2 = new BigDecimal(array[2].trim());
			operator1 = array[1];
			if(operator1.equals("+")){
				BigDecimal tmp = val1.add(val2);
				System.out.printf("%.1f",val1);
				System.out.print(" " + operator1 + " ");
				System.out.printf("%.1f",val2);
				System.out.print(" = ");
				System.out.printf("%.1f",tmp);
				System.out.println();
			}
			if(operator1.equals("-")){
				BigDecimal tmp = val1.subtract(val2);
				System.out.printf("%.1f",val1);
				System.out.print(" " + operator1 + " ");
				System.out.printf("%.1f",val2);
				System.out.print(" = ");
				System.out.printf("%.1f",tmp);
				System.out.println();
			}
			if(operator1.equals("*")){
				BigDecimal tmp = val1.multiply(val2);
				System.out.printf("%.1f",val1);
				System.out.print(" " + operator1 + " ");
				System.out.printf("%.1f",val2);
				System.out.print(" = ");
				System.out.printf("%.1f",tmp);
				System.out.println();
			}
			if(operator1.equals("/")){
				BigDecimal tmp = val1.divide(val2);
				System.out.printf("%.1f",val1);
				System.out.print(" " + operator1 + " ");
				System.out.printf("%.1f",val2);
				System.out.print(" = ");
				System.out.printf("%.1f",tmp);
				System.out.println();
			}
			if(operator1.equals("%")){
				BigDecimal tmp = val1.remainder(val2);
				System.out.printf("%.1f",val1);
				System.out.print(" " + operator1 + " ");
				System.out.printf("%.1f",val2);
				System.out.print(" = ");
				System.out.printf("%.1f",tmp);
				System.out.println();
			}
		}
		if (index==5) {
			float answer = 0;
			float operand1 = Float.parseFloat(array[0]);
			float operand2 = Float.parseFloat(array[2]);
			float operand3 = Float.parseFloat(array[4]);
			BigDecimal val1 = new BigDecimal(operand1);
			BigDecimal val2 = new BigDecimal(operand2);
			BigDecimal val3 = new BigDecimal(operand3);
			operator1 = array[1];
			operator2 = array[3];
			if(operator1.equals("*")){
				BigDecimal tmp = val1.multiply(val2);
				if(operator2.equals("*")){
					BigDecimal tmpp = tmp.multiply(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("+")){
					BigDecimal tmpp = tmp.add(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("-")){
					BigDecimal tmpp = tmp.subtract(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("/")){
					BigDecimal tmpp = tmp.divide(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("%")){
					BigDecimal tmpp = tmp.remainder(val3);
					answer = tmpp.floatValue();
				}

			}
			if(operator1.equals("/")){
				BigDecimal tmp = val1.divide(val2);
				if(operator2.equals("*")){
					BigDecimal tmpp = tmp.multiply(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("+")){
					BigDecimal tmpp = tmp.add(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("-")){
					BigDecimal tmpp = tmp.subtract(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("/")){
					BigDecimal tmpp = tmp.divide(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("%")){
					BigDecimal tmpp = tmp.remainder(val3);
					answer = tmpp.floatValue();
				}

			}
			if(operator1.equals("%")){
				BigDecimal tmp = val1.remainder(val2);
				if(operator2.equals("*")){
					BigDecimal tmpp = tmp.multiply(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("+")){
					BigDecimal tmpp = tmp.add(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("-")){
					BigDecimal tmpp = tmp.subtract(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("/")){
					BigDecimal tmpp = tmp.divide(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("%")){
					BigDecimal tmpp = tmp.remainder(val3);
					answer = tmpp.floatValue();
				}

			}
			if(operator1.equals("+")){
				if(operator2.equals("*")){
					BigDecimal tmp = val2.multiply(val3);
					BigDecimal tmpp = tmp.add(val1);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("+")){
					BigDecimal tmp = val1.add(val2);
					BigDecimal tmpp = tmp.add(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("-")){
					BigDecimal tmp = val1.add(val2);
					BigDecimal tmpp = tmp.subtract(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("/")){
					BigDecimal tmp = val2.divide(val3);
					BigDecimal tmpp = tmp.add(val1);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("%")){
					BigDecimal tmp = val2.remainder(val3);
					BigDecimal tmpp = tmp.add(val1);
					answer = tmpp.floatValue();
				}

			}
			if(operator1.equals("-")){
				if(operator2.equals("*")){
					BigDecimal tmp = val2.multiply(val3);
					BigDecimal tmpp = val1.subtract(tmp);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("+")){
					BigDecimal tmp = val1.subtract(val2);
					BigDecimal tmpp = tmp.add(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("-")){
					BigDecimal tmp = val1.subtract(val2);
					BigDecimal tmpp = tmp.subtract(val3);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("/")){
					BigDecimal tmp = val2.divide(val3);
					BigDecimal tmpp = val1.subtract(tmp);
					answer = tmpp.floatValue();
				}
				if(operator2.equals("%")){
					BigDecimal tmp = val2.remainder(val3);
					BigDecimal tmpp = val1.subtract(tmp);
					answer = tmpp.floatValue();
				}

			}
			System.out.printf("%.1f",operand1);
			System.out.print(" " + operator1 + " ");
			System.out.printf("%.1f",operand2);
			System.out.print(" " + operator2 + " ");
			System.out.printf("%.1f",operand3);
			System.out.print(" = ");
			System.out.printf("%.1f",answer);
			System.out.println();

		}
		if (index==2){
			BigDecimal operand1 = new BigDecimal(array[1].trim());
			System.out.print(array[0]);
			System.out.printf("%.1f",operand1);
			System.out.println();
		}
		if (index==1) {
			BigDecimal operand1 = new BigDecimal(array[0].trim());
			System.out.printf("%.1f",operand1);
			System.out.println();
		}
	}
}