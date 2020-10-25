import java.util.*;    
    
public class    Main {    
    
    // static Boolean isPrime(int number){    
    //  for(int i = 2; i < Math.sqrt(number);i++){    
    //      if(number%i==0){    
    //          return false;    
    //      }    
    //  }    
    //  return true;    
    // }    
    
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);    
        while(input.hasNext()){    
            int number = input.nextInt();  
            // if(isPrime(number)){    
            //  System.out.println(number);    
            // }    
            int factor = 2;
            while(number>=2){
                if(number%factor==0){
                    number = number / factor;    
                    System.out.print(factor);    
                    if(number>1){
                        System.out.print(" ");
                    }
                }
                else{
                    factor++;    
                }    
            }    
            if(number != 1){   
                if(number/factor==1){
                    System.out.print(number);
                }
                else{
                    System.out.print(number);
                    System.out.print(" ");
                }
            }    
            System.out.println();    
        }    
    }    
}  