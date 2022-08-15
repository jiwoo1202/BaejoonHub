import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int[] num2 = new int[num1];
    
    for(int i =0; i<num2.length ;i++){
      num2[i]= sc.nextInt();
    }  
  
    int max  = num2[0];
    int min =  num2[0];
  
    for(int i =0; i<num2.length;i++){
      if(max<num2[i]){
        max = num2[i];
      }
    } 
      for(int i=0; i<num2.length;i++){
      if(min>num2[i]){
        min = num2[i];
    }
      }
    System.out.print(min +" "+ max);
    
  } 
 }
