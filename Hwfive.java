import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		StringTokenizer test = new StringTokenizer(str,"\\+|-|\\*|/|%",true);
		String[] array = new String[test.countTokens()];
		array = transform.inputToken(str);
		StringBuffer buffer = new StringBuffer();
		StringBuffer poster = new StringBuffer();
		for (int i =0;i<array.length ;i++ ) {
			buffer.append(array[i]);
		}
		String post = buffer.toString();
		// System.out.println("post: "+post);
		String[] toPost = new String[test.countTokens()];
		toPost = transform.postToken(post);
		for (int i =0;i<toPost.length ;i++ ) {
			poster.append(toPost[i]);
		}
		String answer = poster.toString();
		// System.out.println("answer: "+answer);
		BigDecimal output = transform.Calculate(answer);
		System.out.println(output);
	}
	public static class transform{
		public static String[] inputToken(String str){
			StringTokenizer result = new StringTokenizer(str,"\\+|-|\\*|/|%",true);
			int index = 0;
			String[] array = new String[result.countTokens()];
			while(result.hasMoreElements()){
				array[index] = result.nextToken();
				index++;
			}
			return array;
		}
		public static String[] postToken(String str){
			Stack stk = new Stack();
			Boolean flag = true;
			int start = 0;
			StringTokenizer result = new StringTokenizer(str,"\\+|-|\\*|/|(|)|%",true);
			StringBuffer buffer = new StringBuffer();
			String[] array = new String[result.countTokens()];
			int index = 0;
			while(result.hasMoreElements()){
				array[index] = result.nextToken();
				index++;
			}
			while(stk.empty()){
				int icp = 0;
				icp = ICP(array[start]);
				if(icp==0){
					buffer.append(array[start]+" ");
				}
				else{
					stk.push(array[start]);
					// System.out.println("1:"+stk);
				}
				start++;
			}
			for(int i = start;i<index;i++){
				// System.out.println("every:"+stk);
				if(stk.empty()){
					stk.push(array[i]);
					// System.out.println("2"+stk);
				}
				else{
					int in_icp = 0;
					int stk_isp = 0;
					String pop_string =(String) stk.peek();
					in_icp = ICP(array[i]);
					stk_isp = ISP(pop_string);
					if(in_icp==0&&!array[i].equals(")")){
						buffer.append(array[i]+" ");		
					}
					if(in_icp>0&&!array[i].equals(")")){
						if(in_icp>stk_isp){
							stk.push(array[i]);
							// System.out.println("3"+stk);
						}
						if(in_icp<=stk_isp){
							while(flag){
								int isp = 0;
								if(!stk.empty()){
									String out = (String) stk.peek();
									isp = ISP(out);
								}
								else{
									stk.push(array[i]);
									// System.out.println("4"+stk);
									break;
								}
								if(in_icp<=isp){
									String output = (String) stk.peek();
									if(output.equals("(")){
										stk.pop();
									}
									if(!output.equals("(")){
										buffer.append(output+" ");
										stk.pop();
									}
								}
								else{
									// System.out.println("5"+stk);
									stk.push(array[i]);
									break;
								}
							}
						}
					}
					if(array[i].equals(")")){
						boolean end = true;
						while(end){
							String last = (String) stk.peek();
							if(!last.equals("(")){
								buffer.append(last+" ");
								stk.pop();
							}
							else if(last.equals("(")){
								stk.pop();
								break;
							}
						}
					}
				}
				
			}
			// System.out.println("fn:"+stk);
			while(!stk.empty()){
				// System.out.println("final: "+stk);
				String fin = (String) stk.pop();
				buffer.append(fin+" ");
			}
			String ending = buffer.toString();
			StringTokenizer ret = new StringTokenizer(ending," ",true);
			int fin_index = 0;
			String[] fin = new String[ret.countTokens()];
			while(ret.hasMoreElements()){
				fin[fin_index] = ret.nextToken();
				fin_index++;
			}
			return fin;

		}
		public static int ICP(String str){
		if(str.equals("+")||str.equals("-"))
			return 1;
		else if(str.equals("*")||str.equals("/")||str.equals("%"))
			return 2;
		else if(str.equals("("))
			return 4;
		else
			return 0;
		}
		public static int ISP(String str){
			if(str.equals("+")||str.equals("-"))
				return 1;
			else if(str.equals("*")||str.equals("/")||str.equals("%"))
				return 2;
			else
				return 0;	
		}
		// Calculate is ok
		public static BigDecimal Calculate(String str){
			StringTokenizer result = new StringTokenizer(str," ");
			int index = 0;
			String[] cal = new String[result.countTokens()];
			while(result.hasMoreElements()){
				cal[index] = result.nextToken();
				index++;
			}
			Stack stk = new Stack();
			for (int i = 0;i<cal.length;i++) {
				double ans = 0.0;
				if(cal[i].equals("+")||cal[i].equals("-")||cal[i].equals("/")||cal[i].equals("*")||cal[i].equals("%")){
					String str1 = (String) stk.pop();
					String str2 = (String) stk.pop();
					BigDecimal val1 = new BigDecimal(str1.trim());
					BigDecimal val2 = new BigDecimal(str2.trim());
					if(cal[i].equals("+")){
						BigDecimal answer = val2.add(val1);
						String string = answer.toString();
						stk.push(string);
					}
					if(cal[i].equals("-")){
						BigDecimal answer = val2.subtract(val1);
						String string = answer.toString();
						// System.out.println(string);
						stk.push(string);
					}
					if(cal[i].equals("*")){
						BigDecimal answer = val2.multiply(val1);
						String string = answer.toString();
						// System.out.println(string);
						stk.push(string);
					}
					if(cal[i].equals("/")){
						BigDecimal answer = val2.divide(val1);
						String string = answer.toString();
						// System.out.println(string);
						stk.push(string);
					}
					if(cal[i].equals("%")){
						BigDecimal answer = val2.remainder(val1);
						String string = answer.toString();
						stk.push(string);
					}
				}
				else{
					if(cal[i].equals(" ")){
						continue;
					}
					else{
						stk.push(cal[i]);
					}
				}
			}
			String ans = (String) stk.pop();
			BigDecimal real = new BigDecimal(ans).setScale(2,BigDecimal.ROUND_HALF_UP);
			return real;
		}

	}
}